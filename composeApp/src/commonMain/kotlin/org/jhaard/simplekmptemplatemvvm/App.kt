package org.jhaard.simplekmptemplatemvvm

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jhaard.simplekmptemplatemvvm.navigation.Navigation

@Composable
@Preview
fun App() {
    MaterialTheme {

        Navigation()

    }
}