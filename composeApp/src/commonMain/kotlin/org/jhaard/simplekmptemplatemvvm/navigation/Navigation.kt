package org.jhaard.simplekmptemplatemvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navOptions
import org.jhaard.simplekmptemplatemvvm.screens.FirstScreen
import org.jhaard.simplekmptemplatemvvm.screens.SecondScreen

/**
 * Navigation with NavHost to the screen routes of the game.
 */
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.FirstScreen.route,
        modifier = Modifier
    ) {
        composable(route = Screens.FirstScreen.route) {
            FirstScreen(
                navController = navController,
                navOptions = navOptions()
            )
        }
        composable(route = Screens.SecondScreen.route + "/{key}",
            arguments = listOf(navArgument("key") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("key")?.let { screenArgs ->
                SecondScreen(
                    screenArgs = screenArgs,
                    navController = navController,
                    navOptions = navOptions()
                )
            }
        }

    }

}

fun navOptions(): NavOptions {
    return navOptions {
        launchSingleTop = true
        restoreState = false
        popUpTo("start_screen") {
            inclusive = false
            saveState = false
        }
    }
}