package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SecondFragment : Fragment() {

    lateinit var prizeRecycleView: RecyclerView
    lateinit var visitButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val prizeValues: List<Prize> = listOf(
            Prize("Lemon", "Straw", "Apple", 0),
            Prize("Lemon", "Apple", "Straw", 0), Prize("Straw", "Lemon", "Apple", 0),
            Prize("Straw", "Apple", "Lemon", 0), Prize("Apple", "Straw", "Lemon", 0),
            Prize("Apple", "Lemon", "Straw", 0), Prize("Lemon", "Lemon", "Lemon", 1000),
            Prize("Straw", "Straw", "Straw", 1000), Prize("Apple", "Apple", "Apple", 1000)
        )

        visitButton = view.findViewById(R.id.visit_button)
        prizeRecycleView = view.findViewById(R.id.prize_recycle_view)
        prizeRecycleView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        prizeRecycleView.adapter = PrizeAdapter(prizeValues)

        visitButton.setOnClickListener {
            val link = Uri.parse("https://google.ru")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }



        return view
    }


}