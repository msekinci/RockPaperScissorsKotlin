package com.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var myScore = 0
    private var riverScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        defaults()

    }

    fun defaults(){
        myScore = 0
        riverScore = 0
        my_score.setText(myScore.toString())
        river_score.setText(riverScore.toString())
        my_icon.setImageResource(R.drawable.rps)
        river_icon.setImageResource(R.drawable.rps)
    }

    fun playGame(view: View) {
        var result : Comparator.Winner = Comparator.Winner.DRAW

        var firstImage = 0
        var secondImage = 0

        when(view.id){
            R.id.rock_btn -> {
                firstImage = R.drawable.rock
                secondImage = Generator.getImage()
                my_icon.setImageResource(firstImage)
                river_icon.setImageResource(secondImage)
                addScore(firstImage,secondImage)
            }
            R.id.paper_btn -> {
                firstImage = R.drawable.paper
                secondImage = Generator.getImage()
                my_icon.setImageResource(firstImage)
                river_icon.setImageResource(secondImage)
                addScore(firstImage,secondImage)
            }
            R.id.scissor_btn -> {
                firstImage = R.drawable.scissors
                secondImage = Generator.getImage()
                my_icon.setImageResource(firstImage)
                river_icon.setImageResource(secondImage)
                addScore(firstImage,secondImage)
            }
            R.id.reset_btn -> {
                defaults()
            }
        }
    }

    fun addScore(firstImage: Int, secondImage: Int){
        var result : Comparator.Winner = Comparator.compare(firstImage,secondImage)
        if(result == Comparator.Winner.FIRST){
            myScore++
            my_score.setText(myScore.toString())

        }else if(result == Comparator.Winner.SECOND){
            riverScore++
            river_score.setText(riverScore.toString())
        }
    }

}
