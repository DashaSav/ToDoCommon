package com.example.todocommon.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {
    @Insert
    suspend fun insertTodo(todo: TodosEntity)

    @Delete
    suspend fun deleteTodo(id: Int)

    @Query("SELECT * FROM todos")
    suspend fun getAllTodos(): List<TodosEntity>

    @Query("SELECT * FROM todos WHERE id=:id")
    suspend fun getTodo(id: Int): TodosEntity
}
