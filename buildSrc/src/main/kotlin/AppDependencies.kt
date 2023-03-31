import org.gradle.api.artifacts.dsl.DependencyHandler

object AppDependencies {
    val android_core = "androidx.core:core-ktx:${Versions.android_core}"
    val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_runtime_ktx}"
    val activity = "androidx.activity:activity-compose:${Versions.activity_compose}"
    val compose_ui = "androidx.compose.ui:ui:${Versions.compose_ui_version}"
    val compose_ui_preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose_ui_version}"
    val material = "androidx.compose.material:material:${Versions.material}"
    val junit = "junit:junit:${Versions.junit}"
    val android_junit = "androidx.test.ext:junit:${Versions.android_junit}"
    val expresso = "androidx.test.espresso:espresso-core:${Versions.expresso}"
    val compose_junit = "androidx.compose.ui:ui-test-junit4:${Versions.compose_ui_version}"
    val compose_tooling = "androidx.compose.ui:ui-tooling:${Versions.compose_ui_version}"
    val compose_manifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose_ui_version}"
    val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    val hilt_compile = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    val ktor_client = "io.ktor:ktor-client-android:${Versions.ktor}"
    val ktor_serialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    val kotlinx_serialization_json = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinx_serialization_json}"
    val ktor_logging = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.courotines}"

    val appLibraries  = arrayListOf<String>().apply {
        add(android_core)
        add(lifecycle)
        add(activity)
        add(compose_ui)
        add(compose_ui_preview)
        add(material)
        add(hilt)
        add(ktor_client)
        add(ktor_serialization)
        add(kotlinx_serialization_json)
        add(ktor_logging)
        add(coroutines)
    }

    val annotationLibaries = arrayListOf<String>().apply {
        add(hilt_compile)
    }

    val testLibraries = arrayListOf<String>().apply {
        add(junit)
    }

    val androidTestLibraries = arrayListOf<String>().apply {
        add(android_junit)
        add(expresso)
        add(compose_junit)
    }

    val debugLibaries = arrayListOf<String>().apply {
        add(compose_tooling)
        add(compose_manifest)
    }
}

fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}

fun DependencyHandler.debugImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("debugImplementation", dependency)
    }
}