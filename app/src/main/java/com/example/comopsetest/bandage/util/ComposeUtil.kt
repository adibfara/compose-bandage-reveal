package com.example.comopsetest.bandage.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

@Composable
fun Dp.toPx(): Int {
    return with(
        LocalDensity.current
    ) { roundToPx() }
}
