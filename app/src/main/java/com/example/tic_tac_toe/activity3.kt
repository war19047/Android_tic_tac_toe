package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Activity3 : AppCompatActivity() {

    var player = Player()
    var board = Board(3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)


        // Get references to each button
        val button00 = findViewById<Button>(R.id.position_00) as Button
        val button01 = findViewById<Button>(R.id.position_01) as Button
        val button02 = findViewById<Button>(R.id.position_02) as Button
        val button10 = findViewById<Button>(R.id.position_10) as Button
        val button11 = findViewById<Button>(R.id.position_11) as Button
        val button12 = findViewById<Button>(R.id.position_12) as Button
        val button20 = findViewById<Button>(R.id.position_20) as Button
        val button21 = findViewById<Button>(R.id.position_21) as Button
        val button22 = findViewById<Button>(R.id.position_22) as Button

        // Set onclick listener for button00
        button00.setOnClickListener {
            player.takeTurns()
            val x = 0
            val y = 0

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button00.text = "X"
            }else{
                button00.text = "O"
            }
        }

        //Set onclick listener for button01
        button01.setOnClickListener {
            player.takeTurns()

            val x = 0
            val y = 1

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button01.text = "X"
            }else{
                button01.text = "O"
            }
        }

        //Set onclick listener for button02
        button02.setOnClickListener {
            player.takeTurns()

            val x = 0
            val y = 2

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button02.text = "X"
            }else{
                button02.text = "O"
            }
        }

        //Set onclick listener for button10
        button10.setOnClickListener {
            player.takeTurns()

            val x = 1
            val y = 0

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button10.text = "X"
            }else{
                button10.text = "O"
            }
        }

        //Set onclick listener for button11
        button11.setOnClickListener {
            player.takeTurns()

            val x = 1
            val y = 1

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button11.text = "X"
            }else{
                button11.text = "O"
            }
        }

        //Set onclick listener for button12
        button12.setOnClickListener {
            player.takeTurns()

            val x = 1
            val y = 2

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button12.text = "X"
            }else{
                button12.text = "O"
            }
        }

        //Set onclick listener for button20
        button20.setOnClickListener {
            player.takeTurns()

            val x = 2
            val y = 0

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button20.text = "X"
            }else{
                button20.text = "O"
            }
        }

        //Set onclick listener for button 21
        button21.setOnClickListener {
            player.takeTurns()

            val x = 2
            val y = 1

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button21.text = "X"
            }else{
                button21.text = "O"
            }
        }

        //Set onclick listener for button 22
        button22.setOnClickListener {
            player.takeTurns()

            val x = 2
            val y = 2

            board.makeMove(x, y, player.currentPlayer)

            if (player.currentPlayer == "X"){
                button22.text = "X"
            }else{
                button22.text = "O"
            }
        }

    }
}