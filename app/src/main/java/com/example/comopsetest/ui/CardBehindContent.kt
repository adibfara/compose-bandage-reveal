package com.example.comopsetest.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.example.comopsetest.R

@Composable
internal fun CardBehindContent(scrolledAmount: Float) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(64.dp)
            .clip(RoundedCornerShape(24.dp))
            .background(Color(0xFFF35950))
            .padding(16.dp),
        contentAlignment = Alignment.CenterEnd,

        ) {
        Image(
            painter = painterResource(id = R.drawable.stop),
            contentDescription = "Delete",
            modifier = Modifier
                .size(20.dp)
                .offset {
                    IntOffset((-scrolledAmount * 128.dp.roundToPx()).toInt(), 0)
                },
            colorFilter = ColorFilter.tint(Color.White),
        )
    }
}
