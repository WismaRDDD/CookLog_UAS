package com.example.cooklog.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cooklog.data.local.dao.RecipeDao
import com.example.cooklog.data.local.entity.RecipeEntity

@Database(
    entities = [RecipeEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun recipeDao(): RecipeDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "cooklog_db"
                ).build().also { INSTANCE = it }
            }
        }
    }
}
