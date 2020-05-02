package com.faisalmirza.viewbindingsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.faisalmirza.viewbindingsample.databinding.ItemListBinding

class RecyclerViewAdapter : RecyclerView.Adapter<ItemViewHolder>() {

    private val itemList : ArrayList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemListBinding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(itemListBinding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    fun addListItem(newItems: ArrayList<String>){
        itemList.addAll(newItems)
        notifyDataSetChanged()
    }
}