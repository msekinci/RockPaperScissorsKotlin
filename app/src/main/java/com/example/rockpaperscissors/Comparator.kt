package com.example.rockpaperscissors

object Comparator {
    fun compare(firstImage : Int, secondImage : Int): Winner{
        if(firstImage == R.drawable.rock && secondImage == R.drawable.paper) return Winner.SECOND
        else if(firstImage == R.drawable.rock && secondImage == R.drawable.scissors) return Winner.FIRST
        else if(firstImage == R.drawable.paper && secondImage == R.drawable.rock) return Winner.FIRST
        else if(firstImage == R.drawable.paper && secondImage == R.drawable.scissors) return Winner.SECOND
        else if(firstImage == R.drawable.scissors && secondImage == R.drawable.rock) return Winner.SECOND
        else if(firstImage == R.drawable.scissors && secondImage == R.drawable.paper) return Winner.FIRST
        else return Winner.DRAW
    }

    enum class Winner{
        DRAW, FIRST, SECOND
    }
}