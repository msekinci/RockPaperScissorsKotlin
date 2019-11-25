package com.example.rockpaperscissors

import java.util.*

object Generator {
    fun generateRandomNumber(): Int = Random().nextInt(3)
    fun getImage(): Int{
        val image = listOf(R.drawable.rock,R.drawable.paper,R.drawable.scissors)
        return image[generateRandomNumber()]
    }

}