package com.faisalmirza.viewbindingsample

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.faisalmirza.viewbindingsample.databinding.ItemListBinding

class ItemViewHolder(private val itemListBinding: ItemListBinding): RecyclerView.ViewHolder(itemListBinding.root) {

    fun bind(itemData: String){
        itemListBinding.tvItem.text = itemData
        itemListBinding.tvItem.setBackgroundColor(Color.parseColor(itemData))
    }
}