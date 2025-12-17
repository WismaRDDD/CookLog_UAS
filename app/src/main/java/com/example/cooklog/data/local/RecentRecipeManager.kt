package com.example.cooklog.data.local

import android.content.Context

class RecentRecipeManager(context: Context) {

    private val prefs =
        context.getSharedPreferences("recent_recipes", Context.MODE_PRIVATE)

    private val KEY_RECENT = "recent_ids"
    private val MAX_SIZE = 3

    fun saveRecipe(recipeId: Int) {
        val current = getRecentRecipes().toMutableList()

        // Remove if already exists
        current.remove(recipeId)

        // Add to top
        current.add(0, recipeId)

        // Keep max 3
        if (current.size > MAX_SIZE) {
            current.removeAt(current.lastIndex)
        }

        prefs.edit()
            .putString(KEY_RECENT, current.joinToString(","))
            .apply()
    }

    fun getRecentRecipes(): List<Int> {
        val saved = prefs.getString(KEY_RECENT, "") ?: ""
        if (saved.isEmpty()) return emptyList()

        return saved.split(",").mapNotNull { it.toIntOrNull() }
    }
}
