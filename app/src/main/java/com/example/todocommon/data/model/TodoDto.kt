package com.example.todocommon.data.model

data class TodoDto (
    val id: String,
    val title: String,
    val description: String,
    val data: String,
    val deadline: String,
    val isDone: Boolean
)
