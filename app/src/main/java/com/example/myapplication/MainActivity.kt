package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Словесность русская больна.")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Лежит в истерике она\n")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "И бредит языком мечтаний,\n")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "И хладный между тем зоил\n")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Ей Каченовский застудил\n")
    }

    override fun onRestart() {
        super.onRestart()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Теченье месячных изданий.\n")
    }
}