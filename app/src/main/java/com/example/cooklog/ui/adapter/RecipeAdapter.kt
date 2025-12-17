package com.example.cooklog.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cooklog.R
import com.example.cooklog.data.model.Recipe

class RecipeAdapter(
    private var recipes: List<Recipe>,
    private val onClick: (Recipe) -> Unit
) : RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.tvTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.title.text = recipe.title
        holder.itemView.setOnClickListener {
            onClick(recipe)
        }
    }

    override fun getItemCount(): Int = recipes.size

    fun updateData(newList: List<Recipe>) {
        recipes = newList
        notifyDataSetChanged()
    }
}
