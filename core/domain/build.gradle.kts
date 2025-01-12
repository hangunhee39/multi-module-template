import com.hgh.mmt.setNamespace

plugins {
    id("hgh.android.library")
}

android {
    setNamespace("core.domain")
}

dependencies {
    implementation(project(":core:repo"))
    implementation(project(":core:model"))

    implementation(libs.inject)
}
