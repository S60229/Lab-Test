package com.example.mindsharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val easyButton = findViewById<RadioButton>(R.id.radioButton)
        val mediumButton = findViewById<RadioButton>(R.id.radioButton2)
        val hardButton = findViewById<RadioButton>(R.id.radioButton3)
        val number1 = findViewById<TextView>(R.id.textView3)
        val number2 = findViewById<TextView>(R.id.textView5)

        easyButton.setOnClickListener {
            val myRandomValues = List(9) {
                Random.nextInt(0, 9)
                number1.text
            }

            mediumButton.setOnClickListener {
                val myRandomValues = List(9) {
                    Random.nextInt(0, 10)
                }

                hardButton.setOnClickListener {
                    val myRandomValues = List(9) {
                        Random.nextInt(0, 10)
                    }

                }
            }
        }
    }
}