package com.example.comopsetest

import BandageReveal
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.comopsetest.ui.Card
import com.example.comopsetest.ui.CardBehindContent
import com.example.comopsetest.ui.ImageCard
import com.example.comopsetest.ui.theme.ComopseTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComopseTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column(Modifier.padding(16.dp), verticalArrangement = spacedBy(8.dp)) {


                        BandageReveal(behindContent = {
                            CardBehindContent(it)
                        }, content = {
                            Card("JETPACK COMPOSE", R.drawable.icon1, 3.dp)
                        })


                        BandageReveal(behindContent = {
                            CardBehindContent(it)
                        }, content = {
                            Card("Adib Faramarzi", R.drawable.puzzle, 3.dp)
                        })


                        BandageReveal(behindContent = {
                            CardBehindContent(it)
                        }, content = {
                            ImageCard(4.dp)
                        })


                    }
                }
            }
        }
    }
}