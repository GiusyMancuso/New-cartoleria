package com.android.example.mycartoleria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
val categoryName: TextView

init {
    categoryName = view.findViewById(R.id.category_name)
}
}
class CategoryAdapter (val categories: List<Category>) : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val categoryView =
            LayoutInflater.from(parent.context).inflate(R.layout.categorylistitem, parent, false)
        return CategoryViewHolder(categoryView)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.categoryName.text = categories[position].name
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}