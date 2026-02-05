plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.3.0"
}

dependencies {
    implementation(libs.kotlin.plugin)
    implementation(libs.kotlin.compose.plugin)
    implementation(libs.ksp.plugin)

    implementation(libs.android.gradle.plugin)
    implementation(libs.hilt.plugin)
}
