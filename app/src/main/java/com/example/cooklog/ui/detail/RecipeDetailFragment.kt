package com.example.cooklog.ui.detail

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.cooklog.R
import com.example.cooklog.data.local.database.AppDatabase
import com.example.cooklog.data.repository.RecipeRepository
import kotlinx.coroutines.launch

class RecipeDetailFragment : Fragment(R.layout.fragment_recipe_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgRecipe = view.findViewById<ImageView>(R.id.imgRecipe)
        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        val tvTime = view.findViewById<TextView>(R.id.tvTime)
        val tvIngredients = view.findViewById<TextView>(R.id.tvIngredients)
        val tvSteps = view.findViewById<TextView>(R.id.tvSteps)

        val recipeId = arguments?.getInt(ARG_RECIPE_ID) ?: return

        val db = AppDatabase.getInstance(requireContext())
        val repository = RecipeRepository(db.recipeDao())

        lifecycleScope.launch {
            val recipe = repository.getRecipeById(recipeId) ?: return@launch

            imgRecipe.setImageResource(recipe.imageRes)
            tvTitle.text = recipe.title
            tvTime.text = "Waktu memasak: ${recipe.cookingTime}"
            tvIngredients.text = recipe.ingredients
            tvSteps.text = recipe.steps
        }
    }

    companion object {
        private const val ARG_RECIPE_ID = "recipe_id"

        fun newInstance(recipeId: Int): RecipeDetailFragment {
            val fragment = RecipeDetailFragment()
            fragment.arguments = Bundle().apply {
                putInt(ARG_RECIPE_ID, recipeId)
            }
            return fragment
        }
    }
}
