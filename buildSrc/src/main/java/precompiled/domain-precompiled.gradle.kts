
import dependencies.AndroidEnvironmentValue
import dependencies.Dependency
import org.gradle.kotlin.dsl.dependencies


plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}


android {
    compileSdk = AndroidEnvironmentValue.COMPILE_SDK

    defaultConfig {
        minSdk = AndroidEnvironmentValue.MIN_SDK
        targetSdk = AndroidEnvironmentValue.TARGET_SDK
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
    hilt {
        enableExperimentalClasspathAggregation = true
    }
}

dependencies {
    implementation(Dependency.KTX.CORE)

    implementation(Dependency.Google.GSON)

    implementation(Dependency.Network.OKHTTP3)
    implementation(Dependency.Network.OKHTTP_LOGGING)
    implementation(Dependency.Network.RETROFIT2)
    implementation(Dependency.Network.RETROFIT_ADAPTER)
    implementation(Dependency.Network.RETROFIT_CONVERTER)
    implementation(Dependency.Network.GSON)

    implementation(Dependency.AndroidX.ROOM)
    kapt(Dependency.AndroidX.ROOM_COMPILER)
    implementation(Dependency.AndroidX.ROOM_KTX)

    implementation(Dependency.Kotlin.REFLECTION)
    implementation(Dependency.Kotlin.SDK)
    implementation(Dependency.Kotlin.COROUTINE_CORE)
    implementation(Dependency.Kotlin.COROUTINE_ANDROID)

    kapt(Dependency.Hilt.APT)
    implementation(Dependency.Hilt.CORE)
    implementation(Dependency.Hilt.NAVIGATION_COMPOSE)
}