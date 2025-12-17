package com.example.cooklog.ui.home

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cooklog.R
import com.example.cooklog.data.local.RecentRecipeManager
import com.example.cooklog.data.local.database.AppDatabase
import com.example.cooklog.data.model.Recipe
import com.example.cooklog.data.repository.RecipeRepository
import com.example.cooklog.ui.adapter.RecipeAdapter
import com.example.cooklog.ui.detail.RecipeDetailFragment
import android.content.Context
import kotlinx.coroutines.launch

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var recentRecycler: RecyclerView
    private lateinit var allRecycler: RecyclerView
    private lateinit var searchInput: AutoCompleteTextView

    private lateinit var recipeAdapter: RecipeAdapter
    private lateinit var recentAdapter: RecipeAdapter

    private lateinit var allRecipes: List<Recipe>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Bind views
        recentRecycler = view.findViewById(R.id.rvRecent)
        allRecycler = view.findViewById(R.id.rvRecipes)
        searchInput = view.findViewById(R.id.etSearch)

        // Layout managers
        recentRecycler.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        allRecycler.layoutManager = GridLayoutManager(requireContext(), 2)

        val db = AppDatabase.getInstance(requireContext())
        val repository = RecipeRepository(db.recipeDao())
        val recentManager = RecentRecipeManager(requireContext())

        // Shared adapter logic
        val onRecipeClick: (Recipe) -> Unit = { recipe ->
            recentManager.saveRecipe(recipe.id)

            parentFragmentManager.beginTransaction()
                .replace(R.id.container, RecipeDetailFragment.newInstance(recipe.id))
                .addToBackStack(null)
                .commit()
        }

        // Adapters (same class)
        recipeAdapter = RecipeAdapter(emptyList(), onRecipeClick)
        recentAdapter = RecipeAdapter(emptyList(), onRecipeClick)

        recentRecycler.adapter = recentAdapter
        allRecycler.adapter = recipeAdapter

        // Load data
        lifecycleScope.launch {
            repository.seedIfEmpty()

            allRecipes = repository.getAllRecipes()
            recipeAdapter.updateData(allRecipes)

            loadRecentRecipes(recentManager)

            // Tag auto-suggestions
            val tags = repository.getAllUniqueTags()
            val tagAdapter = android.widget.ArrayAdapter(
                requireContext(),
                android.R.layout.simple_dropdown_item_1line,
                tags
            )
            searchInput.setAdapter(tagAdapter)
            searchInput.threshold = 1
        }

        // Pixiv-style search (multi-tag)
        searchInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val query = s.toString().lowercase().trim()

                if (query.isBlank()) {
                    recipeAdapter.updateData(allRecipes)
                    return
                }

                val tokens = query.split(",", " ")
                    .map { it.trim() }
                    .filter { it.isNotEmpty() }

                val filtered = allRecipes.filter { recipe ->
                    tokens.all { token ->
                        recipe.title.lowercase().contains(token) ||
                                recipe.tags.any { tag ->
                                    tag.lowercase().contains(token)
                                }
                    }
                }

                recipeAdapter.updateData(filtered)

                val guideOverlay = view.findViewById<View>(R.id.homeGuide)

                if (shouldShowHomeGuide()) {
                    guideOverlay.visibility = View.VISIBLE
                }

                guideOverlay.setOnClickListener {
                    guideOverlay.visibility = View.GONE
                    markHomeGuideShown()
                }

            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }
    private fun shouldShowHomeGuide(): Boolean {
        val prefs = requireContext()
            .getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
        return !prefs.getBoolean("home_guide_shown", false)
    }

    private fun markHomeGuideShown() {
        val prefs = requireContext()
            .getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
        prefs.edit().putBoolean("home_guide_shown", true).apply()
    }
    private fun loadRecentRecipes(recentManager: RecentRecipeManager) {
        val ids = recentManager.getRecentRecipes()
        val recent = allRecipes.filter { ids.contains(it.id) }
        recentAdapter.updateData(recent)
    }
}
