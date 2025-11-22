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
import org.jhaard.simplekmptemplatemvvm.viewmodels.FirstScreenViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun FirstScreen(
    viewModel: FirstScreenViewModel = koinViewModel(),
    onNavigate: (String) -> Unit
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
        Button(onClick = { onNavigate("second_screen") }) {
            Text(text = "Route to Second Screen")
        }
    }

}
