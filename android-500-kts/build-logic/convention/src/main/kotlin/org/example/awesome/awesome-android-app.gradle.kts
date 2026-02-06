import org.example.awesome.asProjectNameToNamespace
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

plugins {
    id("com.android.application")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.plugin.compose")
}

extensions.configure<com.android.build.api.dsl.ApplicationExtension> {
    namespace = "com.awesome." + project.name.asProjectNameToNamespace()
    compileSdk = 36
    defaultConfig {
        applicationId = "com.awesome." + project.name.asProjectNameToNamespace()
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

extensions.getByType(KotlinAndroidProjectExtension::class.java).apply {
    jvmToolchain(23)
}

extensions.getByType(JavaPluginExtension::class.java).apply {
    toolchain.languageVersion.set(JavaLanguageVersion.of(23))
}

// Hilt missing Java Toolchain support https://github.com/google/dagger/issues/4623
val toolchains = extensions.getByType(JavaToolchainService::class.java)
tasks.withType<JavaCompile>()
    .matching { it.name.startsWith("hiltJavaCompile") }
    .configureEach {
        javaCompiler.set(
            toolchains.compilerFor {
                languageVersion.set(JavaLanguageVersion.of(23))
            }
        )
    }
