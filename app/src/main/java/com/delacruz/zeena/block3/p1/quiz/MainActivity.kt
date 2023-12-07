package com.delacruz.zeena.block3.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber: EditText = findViewById(R.id.et_first_number)
        val secondNumber: EditText = findViewById(R.id.et_second_number)
        val btAdd: Button = findViewById(R.id.bt_add)
        val btMinus: Button = findViewById(R.id.bt_minus)
        val btDivide: Button = findViewById(R.id.bt_divide)
        val tvResult: TextView = findViewById(R.id.tv_result)

        tvResult.text = "Result"

        btAdd.setOnClickListener{
            tvResult.text = (firstNumber.text.toString().toInt() + secondNumber.text.toString().toInt()).toString()
        }
        btMinus.setOnClickListener{
            tvResult.text = (firstNumber.text.toString().toInt() - secondNumber.text.toString().toInt()).toString()
        }
        btDivide.setOnClickListener {
            tvResult.text = (firstNumber.text.toString().toInt() * secondNumber.text.toString().toInt()).toString()
        }
        btDivide.setOnClickListener {
            tvResult.text = (firstNumber.text.toString().toFloat() / secondNumber.text.toString().toFloat()).toString()
        }
    }
}