package com.example.recycleview.adapter

import android.view.View

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycleview.Product
import com.example.recycleview.databinding.ItemProductsBinding


class ProductsViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val binding=ItemProductsBinding.bind(view)


    fun render(productsModel: Product){
        binding.tvNameProduct.text=productsModel.name
        binding.tvPreceProduct.text=productsModel.prece.toString()
        binding.tvExistProduct.text=productsModel.existence.toString()
        binding.tvCategoryProduct.text=productsModel.category
        Glide.with(binding.ivProducts.context)
            .load(productsModel.photo)
            .into(binding.ivProducts)

        binding.ivProducts.setOnClickListener{
            Toast.makeText(binding.ivProducts.context,productsModel.name,Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener{
            Toast.makeText(binding.ivProducts.context,productsModel.prece.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}