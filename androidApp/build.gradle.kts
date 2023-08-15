plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = Lib.applicationId
    compileSdk = Lib.compileSdk
    defaultConfig {
        applicationId = Lib.applicationId
        minSdk = Lib.minSdk
        targetSdk = Lib.targetSdk
        versionCode = Lib.versionCode
        versionName = Lib.versionName
    }
    buildFeatures {
        compose = Lib.withCompose
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Lib.kotlinCompilerExtensionVersion
    }
    packaging {
        resources {
            excludes += Lib.dataExcludes
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Lib.jvmTarget
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.5.0")
    implementation("androidx.compose.ui:ui-tooling:1.5.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.0")
    implementation("androidx.compose.foundation:foundation:1.5.0")
    implementation("androidx.compose.material:material:1.5.0")
    implementation("androidx.activity:activity-compose:1.7.2")
}