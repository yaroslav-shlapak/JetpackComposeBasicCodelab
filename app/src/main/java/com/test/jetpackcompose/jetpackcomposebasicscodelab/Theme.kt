package com.test.jetpackcompose.jetpackcomposebasicscodelab

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun BasicsCodelabTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(colors = colors) {
        content()
    }

}

private val purple200 = Color(0xFFBB86FC)
private val purple500 = Color(0xFF6200EE)
private val purple700 = Color(0xFF3700B3)
private val teal200 = Color(0xFF03DAC5)

private val DarkColors = darkColors(
    primary = purple200,
    primaryVariant = purple700,
    secondary = teal200
)

private val LightColors = lightColors(
    primary = purple500,
    primaryVariant = purple700,
    secondary = teal200
)

