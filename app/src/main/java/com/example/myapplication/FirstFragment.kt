package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.os.Vibrator
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class FirstFragment : Fragment() {

    lateinit var winTextView: TextView
    lateinit var leftImageView: ImageView
    lateinit var middleImageView: ImageView
    lateinit var rightImageView: ImageView
    lateinit var spinButton: Button

    private val berriesImageList: List<Int> = listOf(
        R.drawable.lemon, R.drawable.strawberry, R.drawable.apple
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        winTextView = view.findViewById(R.id.win_text_view)
        leftImageView = view.findViewById(R.id.left_image_view)
        middleImageView = view.findViewById(R.id.middle_image_view)
        rightImageView = view.findViewById(R.id.right_image_view)
        spinButton = view.findViewById(R.id.spin_button)

        spinButton.setOnClickListener {
            winTextView.text = "PRESS PLAY"
            val rand_1 = Random.nextInt(0, 3)
            val rand_2 = Random.nextInt(0, 3)
            val rand_3 = Random.nextInt(0, 3)

            leftImageView.setImageResource(berriesImageList[rand_1])
            middleImageView.setImageResource(berriesImageList[rand_2])
            rightImageView.setImageResource(berriesImageList[rand_3])

            if (rand_1 == rand_2 && rand_2 == rand_3) {
                winTextView.text = "BINGO!"
                vibrator.vibrate(500)
            }

        }
        winTextView.text = "PRESS PLAY!"
        leftImageView.setImageResource(berriesImageList.random())
        middleImageView.setImageResource(berriesImageList.random())
        rightImageView.setImageResource(berriesImageList.random())

        return view
    }


}