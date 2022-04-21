package com.example.recycleview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycleview.Product
import com.example.recycleview.R
import com.example.recycleview.databinding.ItemProductsBinding
import org.w3c.dom.Text

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



    }
}