package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Scream_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scream2)

        val textView = findViewById<TextView>(R.id.Back)

        textView.setOnClickListener{
            startActivity(Intent(this,activity_movies::class.java))
        }

    }
}