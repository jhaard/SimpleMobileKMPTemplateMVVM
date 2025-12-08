package org.jhaard.simplekmptemplatemvvm.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.jhaard.simplekmptemplatemvvm.models.Note
import org.jhaard.simplekmptemplatemvvm.models.UiState

/**
 * Build your viewModel for the screen.
 * See modules for the Koin implementation.
 */
class FirstScreenViewModel(): ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()


    fun saveNote(note: Note) {
        _uiState.update { it.copy(notes = it.notes + note, currentNote = note) }
    }



}