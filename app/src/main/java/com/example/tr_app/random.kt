package com.example.tr_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class random : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber(){
        val textView: TextView = findViewById(R.id.textView)
        val textView3: TextView = findViewById(R.id.textView3)
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val rand = Random()
        var randomInt = 0
        if (count > 0) {
            randomInt = rand.nextInt(count + 1)
        }
        textView3.text = randomInt.toString()
        textView.text = getString(R.string.random_heading, count)

    }
}