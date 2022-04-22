package com.example.recycleview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.adapter.ProductsAdapter
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater )
        setContentView(binding.root)
        setupRecyclerView()
    }


    private fun setupRecyclerView(){
    //    val manager =GridLayoutManager(this,2)
        val manager =LinearLayoutManager(this)
        //val decoration=DividerItemDecoration(this,manager.orientation)
        val recyclerView= binding.recyclerProduct
        recyclerView.layoutManager=manager
        recyclerView.adapter=ProductsAdapter(ProductsList.produts) { product ->
            onItemSelected(
                product
            )
        }
       // binding.recyclerProduct.addItemDecoration(decoration)
    }

    fun onItemSelected(product: Product){
        Toast.makeText(this,product.name,Toast.LENGTH_SHORT).show()
    }
}