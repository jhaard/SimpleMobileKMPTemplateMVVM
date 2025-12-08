package org.jhaard.simplekmptemplatemvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jhaard.simplekmptemplatemvvm.screens.FirstScreen
import org.jhaard.simplekmptemplatemvvm.screens.SecondScreen

/**
 * // TODO Review navigation and Koin
 * Navigation with NavHost to the screen routes.
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
                onNavigate = { route ->
                    navController.navigate(route)
                }
            )
        }

        composable(
            route = Screens.SecondScreen.route
        ) {
            SecondScreen(
                onNavigateBack = {
                    navController.navigateUp()
                }
            )
        }
    }

}

// NavOptions - Use if needed
/*
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
 */