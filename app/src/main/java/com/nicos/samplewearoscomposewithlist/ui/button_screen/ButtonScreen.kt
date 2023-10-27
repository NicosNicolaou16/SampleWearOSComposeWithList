package com.nicos.samplewearoscomposewithlist.ui.button_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.wear.compose.material.Text

const val TEXT_KEY = "text_key"

@Composable
fun ButtonScreen(text: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Red),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = text, textAlign = TextAlign.Center, color = Color.Black)
    }
}