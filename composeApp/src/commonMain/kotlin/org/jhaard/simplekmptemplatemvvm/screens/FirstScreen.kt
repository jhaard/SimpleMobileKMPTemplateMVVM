package org.jhaard.simplekmptemplatemvvm.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import org.jhaard.simplekmptemplatemvvm.navigation.Screens

@Composable
fun FirstScreen(
    navController: NavController,
    navOptions: NavOptions
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "First Screen",
            color = Color.Blue
        )
        Button(onClick = {
            val route = Screens.SecondScreen.withArguments("...With some args")
            navController.navigate(route = route, navOptions = navOptions)

        }) {
            Text(text = "Route to Second Screen")
        }
    }

}
