plugins {
    id ("com.android.application") version "7.4.2" apply false
    id ("com.android.library") version "7.4.2" apply false
    id ("org.jetbrains.kotlin.android") version Versions.kotlin apply false
    id ("com.google.dagger.hilt.android") version Versions.hilt apply false
}
buildscript{
    dependencies {
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
//        classpath ("com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}")
    }
}
