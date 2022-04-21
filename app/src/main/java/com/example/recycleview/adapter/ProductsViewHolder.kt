package com.example.recycleview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Product
import com.example.recycleview.R
import org.w3c.dom.Text

class ProductsViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val namePdt=view.findViewById<TextView>(R.id.tvName_product)
    val precePdt=view.findViewById<TextView>(R.id.tvPrece_product)
    val existPdt=view.findViewById<TextView>(R.id.tvExist_product)
    val categoryPdt=view.findViewById<TextView>(R.id.tvCategory_product)
    val photoPdt=view.findViewById<ImageView>(R.id.iv_products)

    fun render(productsModel: Product){
        namePdt.text=productsModel.name
        precePdt.text=productsModel.prece.toString()
        existPdt.text=productsModel.existence.toString()
        categoryPdt.text=productsModel.category



    }
}