package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun PrintScreen(view: View, number: Int){
        val history = screen.text.toString()
        val numberS = number.toString()
        screen.text = history + numberS
    }
    var opType = ""
    var totalAddition : Double= 0.0
    var totalSubtraction : Double = 0.0
    var totalMultiplication : Double = 0.0
    var totalDivision : Double = 0.0

    fun hit0(view: View){
        PrintScreen(screen,0)
    }
    fun hit1(view: View){
        PrintScreen(screen,1)
    }
    fun hit2(view: View){
        PrintScreen(screen,2)
    }
    fun hit3(view: View){
        PrintScreen(screen,3)
    }
    fun hit4(view: View){
        PrintScreen(screen,4)
    }
    fun hit5(view: View){
        PrintScreen(screen,5)
    }
    fun hit6(view: View){
        PrintScreen(screen,6)
    }
    fun hit7(view: View){
        PrintScreen(screen,7)
    }
    fun hit8(view: View){
        PrintScreen(screen,8)
    }
    fun hit9(view: View){
        PrintScreen(screen,9)
    }
    fun hitComma(view: View){
        val history = screen.text.toString()
        screen.text = "${history}."
    }

    fun changeSign(view: View){
        if (screen.text != ""){
            var history = screen.text.toString()
            var myNumber : Double = history.toDouble()
            var changed : Double = myNumber - (2 * myNumber)
            screen.text = changed.toString()
        }

    }

    fun clear(view: View){
        screen.text = ""
    }

    fun delLast(view: View){

        val history = screen.text.toString()
        if(history.length > 0){
            screen.text = history.substring(0, history.length-1)
        }
    }

    fun addition(view: View){
        if (screen.text != ""){
            opType = "add"
            var history = screen.text.toString()
            var myNumber : Double = history.toDouble()
            totalAddition += myNumber
            clear(screen)
        }
    }

    fun subtraction(view: View){
        if (screen.text != ""){
            if (opType == ""){
                opType = "sub"
                var history = screen.text.toString()
                var myNumber : Double = history.toDouble()
                totalSubtraction = myNumber
                clear(screen)
            } else {
                opType = "sub"
                var history = screen.text.toString()
                var myNumber : Double = history.toDouble()
                totalSubtraction -= myNumber
                clear(screen)
            }

        }
    }

    fun division(view: View){
        if (screen.text != ""){
            if (opType == ""){
                opType = "div"
                var history = screen.text.toString()
                var myNumber : Double = history.toDouble()
                totalDivision = myNumber
                clear(screen)
            } else {
                opType = "div"
                var history = screen.text.toString()
                var myNumber : Double = history.toDouble()
                totalDivision /= myNumber
                clear(screen)
            }

        }
    }

    fun multiplication(view: View){
        if (screen.text != ""){
            if (opType == ""){
                opType = "mul"
                var history = screen.text.toString()
                var myNumber : Double = history.toDouble()
                totalMultiplication = myNumber
                clear(screen)
            } else {
                opType = "mul"
                var history = screen.text.toString()
                var myNumber : Double = history.toDouble()
                totalMultiplication *= myNumber
                clear(screen)
            }

        }
    }

    fun result(view: View){
        if (opType == "add"){
            var history = screen.text.toString()
            var myNumber : Double = history.toDouble()
            totalAddition += myNumber
            screen.text = totalAddition.toString()
            totalAddition = 0.0
            opType = ""
        }
        else if (opType == "sub"){
            var history = screen.text.toString()
            var myNumber : Double = history.toDouble()
            totalSubtraction -= myNumber
            screen.text = totalSubtraction.toString()
            totalSubtraction = 0.0
            opType = ""
        }
        else if (opType == "div"){
            var history = screen.text.toString()
            var myNumber : Double = history.toDouble()
            totalDivision /= myNumber
            screen.text = totalDivision.toString()
            totalDivision = 0.0
            opType = ""
        }
        else if (opType == "mul"){
            var history = screen.text.toString()
            var myNumber : Double = history.toDouble()
            totalMultiplication *= myNumber
            screen.text = totalMultiplication.toString()
            totalMultiplication = 0.0
            opType = ""
        }
    }
}