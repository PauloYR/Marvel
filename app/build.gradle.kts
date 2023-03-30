plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.paulo.marvel"
    compileSdkVersion(AppConfig.compileSdk)

    defaultConfig {
        applicationId = "com.paulo.marvel"
        minSdkVersion(AppConfig.minSdk)
        targetSdkVersion(AppConfig.targetSdk)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.androidTestInstrumentation
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
        kotlinCompilerExtensionVersion ="1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(AppDependencies.android_core)
    implementation(AppDependencies.lifecycle)
    implementation(AppDependencies.activity)
    implementation(AppDependencies.compose_ui)
    implementation(AppDependencies.compose_ui_preview)
    implementation(AppDependencies.material)
    testImplementation(AppDependencies.junit)
    androidTestImplementation(AppDependencies.android_junit)
    androidTestImplementation(AppDependencies.expresso)
    androidTestImplementation(AppDependencies.compose_junit)
    debugImplementation(AppDependencies.compose_tooling)
    debugImplementation(AppDependencies.compose_manifest)
}