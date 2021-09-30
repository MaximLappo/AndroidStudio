package com.example.lab1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    private var result: TextView? = null
    private var entry: AutoCompleteTextView? = null
    private var butt: Button? = null
    private var radio: RadioGroup? = null
    private var butt2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result = findViewById(R.id.result)
        entry = findViewById(R.id.autoCompleteTextView)
        butt = findViewById(R.id.button)
        radio = findViewById(R.id.radio)
        butt2 = findViewById(R.id.button2)


        butt2?.setOnClickListener{
            result?.text = " ".toString()
        }

        butt?.setOnClickListener {
            if (entry?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this, "Введіть текст", Toast.LENGTH_LONG).show()
            else {
                var radioCheck = radio?.checkedRadioButtonId
                val color = when (radioCheck) {
                    R.id.rd1 -> Color.GREEN
                    R.id.rd2 -> Color.RED
                    R.id.rd3 -> Color.BLUE
                    R.id.rd4 -> Color.YELLOW
                    else -> Color.BLACK
                }
                result?.text = entry?.getText().toString()
                result?.setTextColor(color)
            }
        }
        }
    }


