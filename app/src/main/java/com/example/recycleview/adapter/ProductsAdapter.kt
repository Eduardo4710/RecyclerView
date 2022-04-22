package com.example.recycleview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Product
import com.example.recycleview.R

class ProductsAdapter(private val nProduts:List<Product>,private  val OnClickListener:(Product)-> Unit): RecyclerView.Adapter<ProductsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
    val layoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.item_products,parent,false)
      return ProductsViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
       val item=nProduts[position]
        holder.render(item,OnClickListener)
    }

    override fun getItemCount(): Int=nProduts.size

}