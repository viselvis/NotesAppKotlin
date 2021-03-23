package com.viselvis.notesappkotlin.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDatabaseDao {
    @Insert
    fun insertNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Query("SELECT * FROM note_table ORDER BY noteId DESC")
    fun getAllNotes(): Flow<List<Note>>
}