package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private var userList: List<User>) : RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        TODO("Not yet implemented")
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.user_list_item,
            parent, false
        )
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        TODO("Not yet implemented")
        val user = userList[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return userList.size
    }
}