package org.jhaard.simplekmptemplatemvvm.models

data class UiState(
    val notes: List<Note> = emptyList(),
    val currentNote: Note? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
