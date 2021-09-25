package ni.edu.uca.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFirstDice = Dice(6)
        println("Your ${myFirstDice.numSides} siced dice rolled ${myFirstDice.roll()}")

        val mySecondDice = Dice(20)
        println("Your ${mySecondDice.numSides} siced dice rolled ${mySecondDice.roll()}")
    }
}

class Dice (val numSides: Int){
    fun roll(): Int {
        return (1..numSides).random()
    }
}