import com.hgh.mmt.setNamespace

plugins {
    id("hgh.android.library")
    id("kotlinx-serialization")
}

android {
    setNamespace("core.data.api")
}

dependencies {
    implementation(project(":core:model"))
}
