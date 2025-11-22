package org.jhaard.simplekmptemplatemvvm.navigation

/**
 * The different screens.
 *
 * @param route The string route to navigate to.
 */
sealed class Screens(val route: String) {

    data object FirstScreen: Screens("first_screen")
    data object SecondScreen: Screens("second_screen")

    fun withArguments(vararg args: String): String {
        val argRoute = buildString {
            append(route)
            args.forEach {
                append("/$it")
            }
        }
        return argRoute
    }
}