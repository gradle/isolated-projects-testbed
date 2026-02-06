import com.android.build.api.dsl.LibraryExtension
import org.example.awesome.asProjectNameToNamespace
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
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_23
        targetCompatibility = JavaVersion.VERSION_23
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