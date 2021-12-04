package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


//lateinit var userRecyclerView: RecyclerView
lateinit var bottomNavigationMenu: BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)
        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.page_1 -> {
                    fragment = FirstFragment()
                }
                R.id.page_2 -> {
                    fragment = SecondFragment()
                }
                R.id.page_3 -> {
                    fragment = ThirdFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }
        bottomNavigationMenu.selectedItemId = R.id.page_1
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
//        val userList: List<User> = listOf(
//            User("Ivan", 20),
//            User("Helen", 19),
//            User("Anna", 21),
//            User("Max", 25)
//        )
//
//        userRecyclerView = findViewById(R.id.user_recycle_view)
//        userRecyclerView.layoutManager = LinearLayoutManager(
//            this,
//            LinearLayoutManager.VERTICAL,
//            false
//        )
//        userRecyclerView.adapter = UserAdapter(userList)
}


