plugins {
    id("hgh.kotlin.library")
    id("kotlinx-serialization")
}

dependencies {
    api(libs.kotlinx.datetime)
    implementation(libs.kotlinx.serialization.json)
}