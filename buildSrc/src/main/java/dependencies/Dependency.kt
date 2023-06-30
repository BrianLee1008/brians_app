package dependencies

object Dependency {

    object Kotlin {
        const val SDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.KOTLIN}"
        const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
        const val COROUTINE_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"
        const val REFLECTION = "org.jetbrains.kotlin:kotlin-reflect:${Versions.KOTLIN}"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:${Versions.KTX_CORE}"
        const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:2.2.0"
        const val LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
        const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
        const val ACTIVITY = "androidx.activity:activity-ktx:${Versions.ANDROIDX_ACTIVITY}"
        const val NAVIGATION_RUNTIME = "androidx.navigation:navigation-runtime-ktx:${Versions.ANDROIDX_NAVIGATION}"
        const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:${Versions.ANDROIDX_NAVIGATION}"
    }

    object Hilt {
        const val CORE = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val APT = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
        const val NAVIGATION_COMPOSE = "androidx.hilt:hilt-navigation-compose:${Versions.HILT_NAVIGATION_COMPOSE}"
    }

    object Google {
        const val GSON = "com.google.code.gson:gson:2.8.8"
    }

    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.4.0"
        const val ROOM = "androidx.room:room-runtime:${Versions.ROOM}"
        const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
        const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    }

    object Compose {
        const val ACTIVITY = "androidx.activity:activity-compose:${Versions.ANDROIDX_ACTIVITY}"
        const val ANIMATION = "androidx.compose.animation:animation:${Versions.COMPOSE}"
        const val UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
        const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.LIFECYCLE}"
        const val COMPILER = "androidx.compose.compiler:compiler:${Versions.COMPOSE}"
        const val UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
        const val RUNTIME = "androidx.compose.runtime:runtime:${Versions.COMPOSE}"
        const val FOUNDATION = "androidx.compose.foundation:foundation:${Versions.COMPOSE}"
        const val FOUNDATION_LAYOUT = "androidx.compose.foundation:foundation-layout:${Versions.COMPOSE}"
        const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"
        const val COIL_GIF = "io.coil-kt:coil-gif:${Versions.COIL}"
        const val VIEW_BINDING = "androidx.compose.ui:ui-viewbinding:${Versions.COMPOSE}"
        const val SHIMMER = "com.valentinilk.shimmer:compose-shimmer:1.0.3"
        const val MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE}"
    }

    object Accompanist {
        const val SWIPE_REFRESH = "com.google.accompanist:accompanist-swiperefresh:${Versions.ACCOMPANIST}"
        const val INSETS = "com.google.accompanist:accompanist-insets:${Versions.ACCOMPANIST}"
    }

    object Network {
        const val OKHTTP3 = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP3}"
        const val OKHTTP_LOGGING = "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING}"
        const val RETROFIT2 = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT2}"
        const val RETROFIT_ADAPTER = "com.squareup.retrofit2:adapter-rxjava2:${Versions.RETROFIT2}"
        const val GSON = "com.google.code.gson:gson:${Versions.GSON}"
        const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT2}"
    }



}