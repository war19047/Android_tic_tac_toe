package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Button on first Screen to enter game.
    lateinit var startNewGameButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Get startNewGameButton id.
        startNewGameButton = findViewById(R.id.startNewGameButton)

        // Set on click listener to change screen when button is pressed.
        startNewGameButton.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }




    }
}