package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    fun bind(user:User) {
        val nameTextView:TextView = itemView.findViewById(R.id.name_text_view)
        val ageTextView:TextView = itemView.findViewById(R.id.age_text_view)

        nameTextView.text = "Name - ${user.name}"
        ageTextView.text = "Age - ${user.age}"
    }
}