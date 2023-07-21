package com.example.comopsetest.bandage

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection

@Composable
internal fun BandageOriginalContainer(
    modifier: Modifier,
    width: Dp,
    scratchedAmount: Dp,
    content: @Composable () -> Unit
) {
    Box(modifier = modifier.clip(object : Shape {
        override fun createOutline(
            size: Size,
            layoutDirection: LayoutDirection,
            density: Density
        ): Outline {
            val endOffsetX = with(density) { (width - scratchedAmount).roundToPx() }.toFloat()
            val rect = Rect(
                Offset(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY),
                Offset(endOffsetX, Float.POSITIVE_INFINITY)
            )
            return Outline.Rectangle(rect)
        }
    })) {
        content()
    }
}
