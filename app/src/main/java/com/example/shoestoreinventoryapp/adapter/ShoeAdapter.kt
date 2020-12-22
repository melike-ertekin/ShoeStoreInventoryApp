package com.example.shoestoreinventoryapp.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.shoestoreinventoryapp.R
import com.example.shoestoreinventoryapp.databinding.ItemShoeBinding
import com.example.shoestoreinventoryapp.model.Shoe

/**
 * [RecyclerView.Adapter] that can display a [Shoe].
 */
class ShoeAdapter(val shoeList: List<Shoe>): RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder>() {


    class ShoeViewHolder(var view: ItemShoeBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemShoeBinding>(inflater, R.layout.item_shoe, parent, false)
        return ShoeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {

        holder.view.shoe = shoeList[position]


    }

    override fun getItemCount(): Int {
        return shoeList.size
    }



}