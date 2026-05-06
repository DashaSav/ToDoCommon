package com.example.todocommon.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [TodosEntity::class]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todosDao(): TodoDao

    companion object {
        private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return instance ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "todos_database"
            ).build()
                .also { instance = it }
        }
    }
}
