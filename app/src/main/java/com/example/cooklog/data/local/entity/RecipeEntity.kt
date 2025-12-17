package com.example.cooklog.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class RecipeEntity(
    @PrimaryKey val id: Int,
    val title: String,
    val tags: String,          // untuk grid & search
    val cookingTime: String,   // contoh: "30 menit"
    val ingredients: String,   // dipisah newline
    val steps: String,         // dipisah newline
    val imageRes: Int
)
