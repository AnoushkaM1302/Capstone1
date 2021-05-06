package com.takeabreak.breaktab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        //yoga activity
        val yogaB = findViewById<Button>(R.id.yogaB)
        yogaB.setOnClickListener {
            val yogaact = Intent(this@Tab, Yoga::class.java)
            startActivity(yogaact)
        }

        //meditation activity
        val meditateB = findViewById<Button>(R.id.meditateB)
        meditateB .setOnClickListener {
            val meditationact = Intent(this@Tab, Meditation::class.java)
            startActivity(meditationact)
        }

        //exercise activity
        val exerciseB = findViewById<Button>(R.id.exerciseB)
        exerciseB  .setOnClickListener {
            val exerciseact = Intent(this@Tab, Exercise::class.java)
            startActivity(exerciseact)
        }


    }
}