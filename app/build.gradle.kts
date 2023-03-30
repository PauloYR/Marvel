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
    implementation("androidx.core:core-ktx:${Versions.android_core}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_runtime_ktx}")
    implementation("androidx.activity:activity-compose:${Versions.activity_compose}")
    implementation("androidx.compose.ui:ui:${Versions.compose_ui_version}")
    implementation("androidx.compose.ui:ui-tooling-preview:${Versions.compose_ui_version}")
    implementation("androidx.compose.material:material:${Versions.material}")
    testImplementation("junit:junit:${Versions.junit}")
    androidTestImplementation("androidx.test.ext:junit:${Versions.android_junit}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${Versions.expresso}")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Versions.compose_ui_version}")
    debugImplementation("androidx.compose.ui:ui-tooling:${Versions.compose_ui_version}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${Versions.compose_ui_version}")
}