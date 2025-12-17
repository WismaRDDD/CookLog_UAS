package com.example.cooklog.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cooklog.data.local.entity.RecipeEntity

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipes")
    suspend fun getAllRecipes(): List<RecipeEntity>

    @Query("SELECT tags FROM recipes")
    suspend fun getAllTags(): List<String>

    @Query("SELECT * FROM recipes WHERE id = :id")
    suspend fun getRecipeById(id: Int): RecipeEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(recipes: List<RecipeEntity>)
}
