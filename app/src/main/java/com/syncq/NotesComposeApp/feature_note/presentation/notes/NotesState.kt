package com.syncq.NotesComposeApp.feature_note.presentation.notes

import com.syncq.NotesComposeApp.feature_note.domain.model.Note
import com.syncq.NotesComposeApp.feature_note.domain.util.NoteOrder
import com.syncq.NotesComposeApp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false,
)
