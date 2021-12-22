package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class activity_movies : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)


        val textView = findViewById<TextView>(R.id.info)

        textView.setOnClickListener{
            startActivity(Intent(this,activity_info::class.java))

            val textView = findViewById<ImageView>(R.id.scream_1)

            textView.setOnClickListener{
                startActivity(Intent(this,Scream_1::class.java))

                val textView = findViewById<ImageView>(R.id.scream_2)

                textView.setOnClickListener{
                    startActivity(Intent(this,Scream_2::class.java))

                    val textView = findViewById<ImageView>(R.id.Scream_3)

                    textView.setOnClickListener{
                        startActivity(Intent(this,activity_scream3::class.java))

                        val textView = findViewById<ImageView>(R.id.scream_4)

                        textView.setOnClickListener{
                            startActivity(Intent(this,scream4::class.java))


                            }


    }


}}}}}