package com.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    lateinit var txtTotal: TextView
    lateinit var txtInput: TextView
    lateinit var txt1: TextView
    lateinit var txt2: TextView
    lateinit var txt3: TextView
    lateinit var txt4: TextView
    lateinit var txt5: TextView
    lateinit var txt6: TextView
    lateinit var txt7: TextView
    lateinit var txt8: TextView
    lateinit var txt9: TextView
    lateinit var txt0: TextView
    lateinit var txtAdd: TextView
    lateinit var txtSub: TextView
    lateinit var txtMul: TextView
    lateinit var txtDiv: TextView
    lateinit var txtClear: TextView
    var total: Double = 0.00
    var input: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtTotal = findViewById(R.id.txtSum)
        txtInput = findViewById(R.id.txtNumber)
        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)
        txt3 = findViewById(R.id.txt3)
        txt4 = findViewById(R.id.txt4)
        txt5 = findViewById(R.id.txt5)
        txt6 = findViewById(R.id.txt6)
        txt7 = findViewById(R.id.txt7)
        txt8 = findViewById(R.id.txt8)
        txt9 = findViewById(R.id.txt9)
        txt0 = findViewById(R.id.txt0)
        txtAdd = findViewById(R.id.txtAdd)
        txtSub = findViewById(R.id.txtSub)
        txtMul = findViewById(R.id.txtMulti)
        txtDiv = findViewById(R.id.txtDiv)
        txtClear = findViewById(R.id.txtClear)

        txtClear.setOnClickListener{
            total = 0.00
            input = ""
        }

        txt1.setOnClickListener {
            input += 1
            txtInput.text = input
        }
        txt2.setOnClickListener {
            input += 2
            txtInput.text = input
        }

        txt3.setOnClickListener {
            input += 3
            txtInput.text = input
        }
        txt4.setOnClickListener {
            input += 4
            txtInput.text = input
        }
        txt5.setOnClickListener {
            input += 5
            txtInput.text = input
        }
        txt6.setOnClickListener {
            input += 6
            txtInput.text = input
        }
        txt7.setOnClickListener {
            input += 7
            txtInput.text = input
        }
        txt8.setOnClickListener {
            input += 8
            txtInput.text = input
        }

        txt9.setOnClickListener {
            input += 9
            txtInput.text = input
        }

        txt0.setOnClickListener {
            input += 0
            txtInput.text = input
        }

        txtAdd.setOnClickListener {
            total+= input.toDouble()
            txtTotal.text = total.toString()
            txtInput.text = ""
            input = ""
        }
        txtSub.setOnClickListener {
            total -= input.toDouble()
            txtTotal.text = total.toString()
            txtInput.text = ""
            input = ""
        }
        txtMul.setOnClickListener {
            total *= input.toDouble()
            txtTotal.text = total.toString()
            txtInput.text = ""
            input = ""
        }
        txtDiv.setOnClickListener {
            total/= input.toDouble()
            txtTotal.text = total.toString()
            txtInput.text = ""
            input = ""
        }
        txtClear.setOnClickListener {
            total = 0.00
            txtTotal.text = "0"
            txtInput.text = ""
            input = ""
        }
    }
}