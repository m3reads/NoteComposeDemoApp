package com.syncq.NotesComposeApp.feature_note.domain.use_case

import com.syncq.NotesComposeApp.feature_note.domain.model.InvalidNoteException
import com.syncq.NotesComposeApp.feature_note.domain.model.Note
import com.syncq.NotesComposeApp.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNoteUseCase(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title cant be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Content cant be empty")
        }
        repository.insertNote(note)
    }
}