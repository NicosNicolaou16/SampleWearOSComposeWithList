package com.nicos.samplewearoscomposewithlist.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.nicos.samplewearoscomposewithlist.ButtonScreen
import com.nicos.samplewearoscomposewithlist.ListOfDummyData
import com.nicos.samplewearoscomposewithlist.TEXT_KEY
import com.nicos.samplewearoscomposewithlist.utils.Screens

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.DUMMY_BUTTONS_SCREEN
    ) {
        composable(Screens.DUMMY_BUTTONS_SCREEN) {
            ListOfDummyData(navController = navController)
        }
        composable(
            "${Screens.BUTTON_SCREEN}/{$TEXT_KEY}", arguments = listOf(
                navArgument(TEXT_KEY) {
                    type = NavType.StringType
                    defaultValue = null
                    nullable = true
                })
        ) {
            ButtonScreen(text = it.arguments?.getString(TEXT_KEY, null)!!)
        }
    }
}