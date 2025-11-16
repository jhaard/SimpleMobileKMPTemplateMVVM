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

@Composable
fun SecondScreen(
    screenArgs: String,
    navController: NavController,
    navOptions: NavOptions
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Second Screen",
            color = Color.Red,
        )

        // Passing a string
        Text(text = screenArgs)

        Button(onClick = {
            navController.popBackStack()

        }) {
            Text(text = "Go Back")
        }

    }

}