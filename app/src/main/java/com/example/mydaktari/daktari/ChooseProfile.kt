package com.example.mydaktari.daktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R
import com.example.mydaktari.welcome.Congrats

class ChooseProfile : AppCompatActivity() {
    private lateinit var txt: TextView
    private lateinit var txt1: TextView
    private lateinit var txt2: TextView

    private lateinit var contin: Button
    private lateinit var back: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_profile)

        back = findViewById(R.id.back)

        txt = findViewById(R.id.text)
        txt1 = findViewById(R.id.text1)
        txt2 = findViewById(R.id.text2)

        contin = findViewById(R.id.btnHome)

        txt.setOnClickListener {
            txt2.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.primary))
        }
        txt1.setOnClickListener {
            txt2.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.primary))
        }

        txt2.setOnClickListener {
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.primary))
        }


        back.setOnClickListener {
            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
        contin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}