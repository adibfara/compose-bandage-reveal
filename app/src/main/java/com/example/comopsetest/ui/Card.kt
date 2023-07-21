package com.example.comopsetest.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.comopsetest.R

@Composable
fun Card(title: String, icon: Int, shadow: Dp, modifier: Modifier = Modifier) {
    val startColor = Color(0xFFC5AB8B)
    val endColor = Color(0xFFF2DECC)
    Row(
        modifier
            .shadow(shadow, RoundedCornerShape(32.dp), clip = false)
            .clip(RoundedCornerShape(24.dp))
            .background(
                Brush.horizontalGradient(
                    0.0f to startColor,
                    1.0f to endColor,
                )
            )
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            Modifier
                .clip(RoundedCornerShape(16.dp))
                .size(42.dp)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(
                    icon
                ),
                contentDescription = "logo",
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(endColor)
            )
        }

        Spacer(Modifier.width(12.dp))
        Text(title, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Spacer(Modifier.weight(1f))
        Image(
            painter = painterResource(R.drawable.chevron),
            contentDescription = "logo",
            modifier = Modifier.size(16.dp),
            colorFilter = ColorFilter.tint(Color.Black)
        )
    }
}