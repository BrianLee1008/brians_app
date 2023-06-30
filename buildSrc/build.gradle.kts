plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    jcenter()
    mavenCentral()
    gradlePluginPortal()
}

object PluginVersion {
    const val ANDROID_GRADLE = "7.3.1"
    const val KOTLIN = "1.8.0"
    const val HILT = "2.44.2"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginVersion.ANDROID_GRADLE}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.KOTLIN}")
    implementation("com.google.dagger:hilt-android-gradle-plugin:${PluginVersion.HILT}")
}
