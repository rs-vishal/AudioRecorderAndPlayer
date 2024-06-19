plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.codersdroid.audio"
    compileSdk = APIVersions.compileSdk

    defaultConfig {
        applicationId = "com.codersdroid.audio"
        minSdk = APIVersions.minSdk
        targetSdk = APIVersions.targetSdk
        versionCode = AppVersioning.versionCode
        versionName = AppVersioning.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            exclude("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {

    implementation(Implementation.coreKTX)
    implementation(Implementation.runtimeKTX)
    implementation(Implementation.composeActivity)
    implementation(Implementation.composeUI)
    implementation(Implementation.composePreview)
    implementation(Implementation.composeMaterial)
    testImplementation(TestImplementation.jUnit)
    androidTestImplementation(AndroidTestImplementation.jUnitEXT)
    androidTestImplementation(AndroidTestImplementation.espressoCore)
    androidTestImplementation(AndroidTestImplementation.jUnitCompose)
    debugImplementation(DebugImplementation.composeUITooling)
    debugImplementation(DebugImplementation.composeUiManifest)
}