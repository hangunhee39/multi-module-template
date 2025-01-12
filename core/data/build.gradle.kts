import com.hgh.mmt.setNamespace

plugins {
    id("hgh.android.library")
    id("hgh.android.hilt")
    id("kotlinx-serialization")
}

android {
    setNamespace("core.data")
}

dependencies {
    implementation(project(":core:model"))
    implementation(project(":core:repo"))
    //implementation(project(":core:datastore"))

    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.okhttp.logging)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.datetime)
    testImplementation(libs.turbine)
}
