package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PrizeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(prize: Prize) {

        val combinationTextView: TextView = itemView.findViewById(R.id.combination_text_view)


        combinationTextView.text =
            "${prize.cell_1} ${prize.cell_2} ${prize.cell_3} ----->  ${prize.sum} Руб"

    }
}