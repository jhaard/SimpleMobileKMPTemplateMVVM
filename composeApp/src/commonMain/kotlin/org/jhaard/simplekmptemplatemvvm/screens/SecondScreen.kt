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
import org.jhaard.simplekmptemplatemvvm.viewmodels.SecondScreenViewModel
import org.koin.compose.viewmodel.koinViewModel

/**
 * Second Example Screen.
 * @param viewModel Use the Koin viewmodel created from modules.
 * @param onNavigateBack Go back to first screen.
 */
@Composable
fun SecondScreen(
    viewModel: SecondScreenViewModel = koinViewModel(),
    onNavigateBack: () -> Unit
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

        Button(onClick = onNavigateBack) {
            Text(text = "Go Back")
        }

    }

}