package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PrizeAdapter(private val prizeValues: List<Prize>) : RecyclerView.Adapter<PrizeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrizeViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.prize_list_item, parent, false)
        return PrizeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PrizeViewHolder, position: Int) {
        val value = prizeValues[position]
        holder.bind(value)
    }

    override fun getItemCount(): Int {
        return prizeValues.size
    }

}