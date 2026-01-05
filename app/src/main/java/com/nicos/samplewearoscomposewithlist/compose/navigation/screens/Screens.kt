package com.nicos.samplewearoscomposewithlist.compose.navigation.screens

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object ListOfShipsScreen : NavKey

@Serializable
data class ShipScreen(
    val id: String
) : NavKey