plugins {
    id("com.android.application") version "8.0.0"
    kotlin("android") version "1.6.21"
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.mywearapp"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("com.google.android.wearable:wearable:2.9.0")
    implementation("androidx.wear:wear:1.2.0")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.0")
}