package com.takeabreak.breaktab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BufferafterTimer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breaktabbtn = findViewById<Button>(R.id.breaktabbtn)
        breaktabbtn.setOnClickListener{
            val breaktabact = Intent( this@BufferafterTimer, Tab::class.java)
            startActivity(breaktabact)
        }
    }
}