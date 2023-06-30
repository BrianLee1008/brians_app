import dependencies.AndroidEnvironmentValue
import dependencies.Dependency
import dependencies.Versions
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

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }

    kotlinOptions {
        jvmTarget = "11"
    }
    hilt {
        enableExperimentalClasspathAggregation = true
    }
}

dependencies {
    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.KTX.CORE)
    implementation(Dependency.Kotlin.SDK)

    implementation(Dependency.Hilt.CORE)
    implementation(Dependency.Hilt.NAVIGATION_COMPOSE)
    kapt(Dependency.Hilt.APT)

    // jetpack compose
    implementation(Dependency.Compose.ACTIVITY)
    implementation(Dependency.Compose.VIEWMODEL)
    implementation(Dependency.Compose.UI_TOOLING)
    implementation(Dependency.Compose.ANIMATION)
    implementation(Dependency.Compose.COMPILER)
    implementation(Dependency.Compose.UI)
    implementation(Dependency.Compose.RUNTIME)
    implementation(Dependency.Compose.FOUNDATION)
    implementation(Dependency.Compose.FOUNDATION_LAYOUT)
    implementation(Dependency.Compose.COIL)
    implementation(Dependency.Compose.COIL_GIF)
    implementation(Dependency.Compose.MATERIAL)
    implementation(Dependency.KTX.NAVIGATION_COMPOSE)
    implementation(Dependency.Compose.SHIMMER)
    implementation(Dependency.Accompanist.SWIPE_REFRESH)
    implementation(Dependency.Accompanist.INSETS)

    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}