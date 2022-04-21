package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.adapter.ProductsAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
    }


    private fun setupRecyclerView(){
        val recyclerView= findViewById<RecyclerView>(R.id.recyclerProduct)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=ProductsAdapter(ProductsList.produts)

    }
}