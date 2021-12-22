package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class More_movies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_movies)

        val textView = findViewById<ImageView>(R.id.description)

        textView.setOnClickListener{
            startActivity(Intent(this,The_thing_page::class.java))

    }
}}