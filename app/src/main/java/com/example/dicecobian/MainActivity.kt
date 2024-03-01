package com.example.dicecobian

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imagenDato: ImageView
    lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagenDato = findViewById(R.id.imagenDad)
        textView2 = findViewById(R.id.textView2)
    }

    fun lanzarDado(v: View) {
        Log.e("ErrorDato", "Se presionó el botón")

        // Generate a random number between 1 and 6
        val numeroAlAzar = Random.nextInt(6) + 1

        // Set the random number to the TextView
        textView2.text = numeroAlAzar.toString()

        // Set the corresponding dice image
        val recurso = when (numeroAlAzar) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imagenDato.setImageResource(recurso)
    }
}

