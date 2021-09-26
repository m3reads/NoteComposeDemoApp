package com.syncq.NotesComposeApp.feature_note.presentation.util

sealed class ScreenClass(val route: String) {
    object NotesScreen: ScreenClass("notes_screen")
    object AddEditNoteScreen: ScreenClass("add_edit_note_screen")
}
