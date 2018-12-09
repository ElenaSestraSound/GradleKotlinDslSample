plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.harumin.gradlekotlindslsample"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {

    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.11")
    implementation("androidx.appcompat:appcompat:1.0.2")
}