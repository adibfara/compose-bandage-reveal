package com.example.comopsetest.bandage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp


@Composable
internal fun BandageScratchedContent(
    modifier: Modifier,
    width: Dp,
    scratchedAmount: Dp,
    content: @Composable () -> Unit

) {
    val shape = object : Shape {
        override fun createOutline(
            size: Size,
            layoutDirection: LayoutDirection,
            density: Density
        ): Outline {
            val realAmount = with(density) { (width - scratchedAmount).roundToPx() }.toFloat()
            val rect = Rect(Offset(realAmount - 400, -100f), Offset(size.width, size.height + 100))
            return Outline.Rectangle(rect)

        }
    }
    Box(modifier = modifier
        .offset(-scratchedAmount)
        .scale(1f, 1.05f)
        .bandageShadow(scratchedAmount)
        .clip(shape)
        .offset {
            IntOffset((width - scratchedAmount).roundToPx(), 0)
        }
        .scale(-1f, 1f)
    ) {
        content()
    }

}

@Composable
private fun Modifier.bandageShadow(scratchedAmount: Dp): Modifier =
    drawBehind {
        if (scratchedAmount <= 32.dp) return@drawBehind

        drawRect(
            Brush.linearGradient(0.3f to Color.Black, 1f to Color.Transparent),
            Offset(this.size.width, 0f),
            size = Size(20.dp.toPx(), size.height)
        )
    }