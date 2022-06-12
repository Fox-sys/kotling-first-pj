package com.example.tr_app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Ты опять выходишь на связь мудила???", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun countMe(view: View) {
        val textView2: TextView = findViewById(R.id.textView2)
        val countStr = textView2.text.toString()
        val count = countStr.toInt() + 1
        textView2.text = count.toString()
    }

    fun randomMe(view: View) {
        val textView2: TextView = findViewById(R.id.textView2)
        val randomIntent = Intent(this, random::class.java)
        val count = textView2.text.toString().toInt()
        randomIntent.putExtra(random.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}