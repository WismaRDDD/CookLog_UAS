package com.example.cooklog.data.model

data class Recipe(
    val id: Int,
    val title: String,
    val tags: List<String>,
    val cookingTime: String,
    val ingredients: String,
    val steps: String,
    val imageRes: Int
)
