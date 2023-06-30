package com.example.shared_ui.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColor.colors() else LightColor.colors()
    ) {
        content()
    }
}

@get: Composable
val Colors.surface1: Color
    get() = if(isLight) LightColor.surface else DarkColor.surface

@get: Composable
val Colors.gray: Color
    get() = if(isLight) LightColor.gray else DarkColor.gray

object DarkColor {
    @Composable
    fun colors() : Colors {
        return darkColors(
            background = background,
            surface = surface
        )
    }
    val background = Color(0xFF121212)
    val surface = Color(0xFF121212)
    val gray = Color(0xFF898B81)
}

object LightColor {
    @Composable
    fun colors() : Colors {
        return lightColors(
            background = background,
            surface = surface
        )
    }
    val background = Color(0xFFFFFFFF)
    val surface = Color(0xFFFFFFFF)
    val gray = Color(0xFF656961)
}