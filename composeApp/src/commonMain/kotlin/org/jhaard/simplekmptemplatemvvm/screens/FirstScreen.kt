package org.jhaard.simplekmptemplatemvvm.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jhaard.simplekmptemplatemvvm.components.EditNote
import org.jhaard.simplekmptemplatemvvm.components.NoteList
import org.jhaard.simplekmptemplatemvvm.models.Note
import org.jhaard.simplekmptemplatemvvm.models.UiState
import org.jhaard.simplekmptemplatemvvm.viewmodels.FirstScreenViewModel
import org.koin.compose.viewmodel.koinViewModel


/**
 * First Example Screen.
 * @param viewModel Use the Koin viewmodel created from modules.
 * @param onNavigate The navigation route.
 */
@Composable
fun FirstScreen(
    viewModel: FirstScreenViewModel = koinViewModel(),
    onNavigate: (String) -> Unit
) {

    val uiState by viewModel.uiState.collectAsState(initial = UiState())
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .safeContentPadding()
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
        ) {
            EditNote(text = text, onTextChange = {
                text = it
            }, onSaveClick = {
                viewModel.addNote(note = Note(text = text))
            })

        }

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(2f)
        ) {

            NoteList(notes = uiState.notes)

        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)

        ) {
            Button(onClick = { onNavigate("second_screen") }) {
                Text(text = "Go to second screen")
            }

        }

    }

}
