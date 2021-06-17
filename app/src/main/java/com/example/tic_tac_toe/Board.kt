package com.example.tic_tac_toe

import kotlin.math.pow

class Board(private val n: Int) {

    private val empty = "___"
    private var turnCounter = 0
    var isGameOver = false
    var board = Array(n) { Array(n) {empty} }

    fun resetBoard(){
        // This function makes a fresh board.
        board = Array(n) { Array(n) {empty} }
    }

    private fun winningMove(x: Int, y: Int, move: String): Boolean{
        // This function will detect if a player has won the game.

        // Check row.
        for (i in 0 until n) {
            if (board[x][i] != move) {
                break
            }

            if (i == n - 1) {
                return true
            }
        }

        // Check for column.
        for (i in 0 until n) {
            if (board[i][y] != move) {
                break
            }

            if (i == n - 1) {
                return true
            }
        }

        // Check for diagonal win from left to right.
        if (x == y){
            for (i in 0 until n){
                if (board[i][i] != move){
                    break
                }

                if (i == n - 1) {
                    return true
                }
            }
        }

        // Check for diagonal win from right to left.
        if (x + y == n - 1) {
            for (i in 0 until n){
                if (board[i][(n - 1) - i] != move){
                    break
                }
                if (i == n - 1) {
                    return true
                }
            }
        }

        return false
    }

    fun makeMove(x: Int, y: Int, move: String) {
        if (!isGameOver && board[x][y] == empty) {

            // Increment a turn counter by 1.
            turnCounter++

            // Update the board in position array[x][y]
            board[x][y] = move

            // Check if game is over.
            isGameOver = winningMove(x, y, move) || isTie()

            if (isGameOver && !isTie()) {
                println("$move is the winner!")
            } else if (isTie()){
                println("The game is a tie!")
            }

        }
    }

    fun isTie(): Boolean {
        // This function will return True when there is a tie.
        return( turnCounter == (n.toDouble().pow(2) - 1).toInt())
    }

    fun newGame(){
        //This function resets the game to its original state.
        resetBoard()
        isGameOver = false
        turnCounter = 0
    }

}
