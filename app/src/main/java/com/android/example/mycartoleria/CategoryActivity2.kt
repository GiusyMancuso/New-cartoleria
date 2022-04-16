package com.android.example.mycartoleria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryActivity2 : AppCompatActivity() {

    val categories = listOf(Category("Penne"), Category("Matite"), Category("Gomme"), Category("Colori"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val list = findViewById<RecyclerView>(R.id.category_list)
        val adapter = CategoryAdapter(categories)
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(this)
    }
}