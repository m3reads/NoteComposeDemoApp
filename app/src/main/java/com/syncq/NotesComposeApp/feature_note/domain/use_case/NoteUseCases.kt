package com.syncq.NotesComposeApp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNoteByIDUseCase: GetNoteByIDUseCase,
)
