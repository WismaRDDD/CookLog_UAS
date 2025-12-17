package com.example.cooklog.data.repository

import com.example.cooklog.data.local.dao.RecipeDao
import com.example.cooklog.data.local.entity.RecipeEntity
import com.example.cooklog.data.model.Recipe
import com.example.cooklog.data.seed.RecipeSeedData

class RecipeRepository(
    private val recipeDao: RecipeDao
) {

    /**
     * Ambil semua resep
     * Digunakan untuk Home (grid, search, random feed)
     */
    suspend fun getAllRecipes(): List<Recipe> {
        return recipeDao.getAllRecipes().map { entity ->
            mapEntityToModel(entity)
        }
    }
    suspend fun getAllUniqueTags(): List<String> {
        return recipeDao.getAllTags()
            .flatMap { it.split(",") }
            .map { it.trim() }
            .distinct()
            .sorted()
    }

    /**
     * Ambil satu resep berdasarkan ID
     * Digunakan untuk Recipe Detail Page
     */
    suspend fun getRecipeById(id: Int): Recipe? {
        return recipeDao.getRecipeById(id)?.let { entity ->
            mapEntityToModel(entity)
        }
    }

    /**
     * Seed data awal (HANYA JALAN JIKA DATABASE KOSONG)
     */
    suspend fun seedIfEmpty() {
        if (recipeDao.getAllRecipes().isEmpty()) {
            recipeDao.insertAll(RecipeSeedData.recipes)
        }
    }

    /**
     * Mapper: Entity → UI Model
     * SATU-SATUNYA tempat konversi data
     */
    private fun mapEntityToModel(entity: RecipeEntity): Recipe {
        return Recipe(
            id = entity.id,
            title = entity.title,
            tags = entity.tags.split(","),
            cookingTime = entity.cookingTime,
            ingredients = entity.ingredients,
            steps = entity.steps,
            imageRes = entity.imageRes
        )
    }
}
