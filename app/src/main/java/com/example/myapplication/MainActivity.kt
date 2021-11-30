package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


lateinit var userRecyclerView: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userList: List<User> = listOf(
            User("Ivan", 20),
            User("Helen", 19),
            User("Anna", 21),
            User("Max", 25)
        )

        userRecyclerView = findViewById(R.id.user_recycle_view)
        userRecyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        userRecyclerView.adapter = UserAdapter(userList)
    }


    //RecyclerView

}