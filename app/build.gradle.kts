plugins {
    id("com.android.application")
}

android {
    namespace = "com.charbel.jesusforme"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.charbel.jesusforme"
        minSdk = 24
        targetSdk = 36
        versionCode = 20
        versionName = "2"
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
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")

}


