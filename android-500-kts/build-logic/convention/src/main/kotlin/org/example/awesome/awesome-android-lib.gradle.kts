import com.android.build.api.dsl.LibraryExtension
import org.example.awesome.asProjectNameToNamespace
import org.example.awesome.javaToolchainVersion
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

plugins {
    id("com.android.library")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.plugin.compose")
}

extensions.configure<LibraryExtension> {
    namespace = "com.awesome." + project.name.asProjectNameToNamespace()
    compileSdk = 36
    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(javaToolchainVersion)
        targetCompatibility = JavaVersion.toVersion(javaToolchainVersion)
    }
    buildFeatures {
        compose = true
    }
}

extensions.getByType(KotlinAndroidProjectExtension::class.java).apply {
    jvmToolchain(javaToolchainVersion)
}

extensions.getByType(JavaPluginExtension::class.java).apply {
    toolchain.languageVersion.set(JavaLanguageVersion.of(javaToolchainVersion))
}