package com.cdp.parcial4_programacion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // Referencias a los elementos del layout
        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val result = findViewById<TextView>(R.id.result)

        // Botones para las operaciones
        val sumButton = findViewById<Button>(R.id.sumButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        // Listener para el botón de suma
        sumButton.setOnClickListener {
            val num1 = number1.text.toString().toIntOrNull()
            val num2 = number2.text.toString().toIntOrNull()

            if (num1 != null && num2 != null) {
                val sum = num1 + num2
                result.text = getString(R.string.result_text, sum)
            } else {
                Toast.makeText(this, getString(R.string.error_invalid_numbers), Toast.LENGTH_SHORT).show()
            }
        }

        // Listener para el botón de resta
        subtractButton.setOnClickListener {
            val num1 = number1.text.toString().toIntOrNull()
            val num2 = number2.text.toString().toIntOrNull()

            if (num1 != null && num2 != null) {
                val difference = num1 - num2
                result.text = getString(R.string.result_text, difference)
            } else {
                Toast.makeText(this, getString(R.string.error_invalid_numbers), Toast.LENGTH_SHORT).show()
            }
        }

        // Listener para el botón de multiplicación
        multiplyButton.setOnClickListener {
            val num1 = number1.text.toString().toIntOrNull()
            val num2 = number2.text.toString().toIntOrNull()

            if (num1 != null && num2 != null) {
                val product = num1 * num2
                result.text = getString(R.string.result_text, product)
            } else {
                Toast.makeText(this, getString(R.string.error_invalid_numbers), Toast.LENGTH_SHORT).show()
            }
        }

        // Listener para el botón de división
        divideButton.setOnClickListener {
            val num1 = number1.text.toString().toIntOrNull()
            val num2 = number2.text.toString().toIntOrNull()

            if (num1 != null && num2 != null) {
                if (num2 != 0) {
                    val quotient = num1 / num2
                    result.text = getString(R.string.result_text, quotient)
                } else {
                    Toast.makeText(this, getString(R.string.error_divide_by_zero), Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, getString(R.string.error_invalid_numbers), Toast.LENGTH_SHORT).show()
            }
        }

        // Listener para el botón "Salir"
        exitButton.setOnClickListener {
            finish()
        }
    }
}