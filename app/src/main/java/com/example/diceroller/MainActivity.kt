package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.roll_result_image)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
//        Toast.makeText(this, "Rolling...", Toast.LENGTH_SHORT).show()
        val rollResult: Int = Random.nextInt(6) + 1
//        val rollText: TextView = findViewById(R.id.roll_text)
//        rollText.text = rollResult
        val chosenDiceImage = when (rollResult) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(chosenDiceImage)
//        roll_button.text = getString(R.string.roll_again_message)
    }
}
