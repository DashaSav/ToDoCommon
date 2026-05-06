package com.example.todocommon.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class TodosEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String,
    val data: String,
    val deadline: String,
    val isDone: Boolean,
)
