package com.nicos.samplewearoscomposewithlist.compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.nicos.samplewearoscomposewithlist.compose.list_of_ships.ListOfShipsScreen
import com.nicos.samplewearoscomposewithlist.compose.navigation.navigation_3.Navigator
import com.nicos.samplewearoscomposewithlist.compose.navigation.navigation_3.navigationState
import com.nicos.samplewearoscomposewithlist.compose.navigation.screens.ListOfShipsScreen
import com.nicos.samplewearoscomposewithlist.compose.navigation.screens.ShipScreen

@Composable
fun Navigation() {
    // this is the state of the navigation
    val navigationState = ListOfShipsScreen.navigationState()

    // this is the navigator
    val navigator = remember { Navigator(navigationState) }
    NavDisplay(
        backStack = navigationState.stacksInUse,
        onBack = {
            navigator.goBack()
        },
        entryProvider = entryProvider {
            entry<ListOfShipsScreen> {
                ListOfShipsScreen(
                    navigator = navigator
                )
            }
            entry<ShipScreen> {
                ShipScreen(
                    id = it.id,
                )
            }
        })
}