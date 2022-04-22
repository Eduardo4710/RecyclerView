package com.example.recycleview.adapter

import android.view.View

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycleview.Product
import com.example.recycleview.databinding.ItemProductsBinding


class ProductsViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val binding=ItemProductsBinding.bind(view)


    fun render(productsModel: Product,  OnClickListener:(Product)-> Unit){
        binding.tvNameProduct.text=productsModel.name
        binding.tvPreceProduct.text=productsModel.prece.toString()
        binding.tvExistProduct.text=productsModel.existence.toString()
        binding.tvCategoryProduct.text=productsModel.category
        Glide.with(binding.ivProducts.context)
            .load(productsModel.photo)
            .into(binding.ivProducts)


        itemView.setOnClickListener{
          OnClickListener(productsModel)
        }
    }
}