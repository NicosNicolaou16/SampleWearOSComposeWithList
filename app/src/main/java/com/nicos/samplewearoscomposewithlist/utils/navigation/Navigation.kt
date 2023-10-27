package com.nicos.samplewearoscomposewithlist.utils.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.nicos.samplewearoscomposewithlist.ui.button_screen.ButtonScreen
import com.nicos.samplewearoscomposewithlist.ui.list_of_button.ListOfDummyData
import com.nicos.samplewearoscomposewithlist.ui.button_screen.TEXT_KEY
import com.nicos.samplewearoscomposewithlist.utils.screens.Screens

@Composable
fun Navigation() {
    val navController = rememberSwipeDismissableNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.DUMMY_BUTTONS_SCREEN
    ) {
        composable(Screens.DUMMY_BUTTONS_SCREEN) {
            ListOfDummyData(navController = navController)
        }
        composable(
            "${Screens.BUTTON_SCREEN}/{$TEXT_KEY}",
        ) {
            ButtonScreen(text = it.arguments?.getString(TEXT_KEY, null)!!)
        }
    }
}