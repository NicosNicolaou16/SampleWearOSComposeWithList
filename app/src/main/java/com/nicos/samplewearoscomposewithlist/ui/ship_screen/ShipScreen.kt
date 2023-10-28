package com.nicos.samplewearoscomposewithlist.ui.ship_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.wear.compose.material.Text
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import kotlinx.coroutines.flow.asSharedFlow

const val SHIP_ID_KEY = "ship_id_key"

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ButtonScreen(
    id: String,
    shipViewModel: ShipViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    shipViewModel.queryShipById(id)
    val shipsModel = shipViewModel.ship.asSharedFlow().collectAsState(initial = null).value
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Red),
        contentAlignment = Alignment.Center,
    ) {
        GlideImage(
            model = shipsModel?.image ?: "",
            contentDescription = null,
            contentScale = ContentScale.Inside,
        )
        Text(
            text = shipsModel?.ship_name ?: "",
            textAlign = TextAlign.Center,
            modifier = modifier.padding(top = 100.dp),
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            fontSize = 21.sp,
            color = Color.Green
        )
    }
}