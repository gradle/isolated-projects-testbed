package com.logic

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class CompositeBuildPluginAndroidApp : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("com.google.devtools.ksp")
                apply("dagger.hilt.android.plugin")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            extensions.configure<com.android.build.api.dsl.ApplicationExtension> {
                namespace = "com.awesome." + target.name.asProjectNameToNamespace()
                compileSdk = 36
                defaultConfig {
                    applicationId = "com.awesome." + target.name.asProjectNameToNamespace()
                    minSdk = 24
                    targetSdk = 36
                    versionCode = 1
                    versionName = "1.0"
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
                buildTypes {
                    getByName("release") {
                        isMinifyEnabled = false
                        proguardFiles(
                            getDefaultProguardFile("proguard-android-optimize.txt"),
                            "proguard-rules.pro"
                        )
                    }
                }
                buildFeatures {
                    compose = true
                }
            }
            target.extensions.getByType(KotlinAndroidProjectExtension::class.java).apply {
                jvmToolchain(23)
            }
            target.extensions.getByType(org.gradle.api.plugins.JavaPluginExtension::class.java)
                .apply {
                    toolchain.languageVersion.set(JavaLanguageVersion.of(23))
                }
            // Hilt missing Java Toolchain support https://github.com/google/dagger/issues/4623
            val toolchains = target.extensions.getByType(JavaToolchainService::class.java)
            target.tasks.withType(JavaCompile::class.java)
                .matching { it.name.startsWith("hiltJavaCompile") }
                .configureEach {
                    javaCompiler.set(
                        toolchains.compilerFor {
                            languageVersion.set(JavaLanguageVersion.of(23))
                        }
                    )
                }

            dependencies {

            }
        }
    }
}
