package com.takeabreak.breaktab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        val jump = findViewById<Button>(R.id.jump)
        jump.setOnClickListener{
            val brkjumpact = Intent( this@Homescreen, Tab::class.java)
            startActivity(brkjumpact )
        }
    }
}