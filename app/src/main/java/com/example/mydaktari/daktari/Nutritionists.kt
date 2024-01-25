package com.example.mydaktari.daktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.mydaktari.R
import com.example.mydaktari.daktari2.SeeDoctorNow

class Nutritionists : AppCompatActivity() {
    private lateinit var bac: ImageView

    private lateinit var bt1: TextView
    private lateinit var bt2: TextView
    private lateinit var bt3: TextView
    private lateinit var bt4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutritionists)

        bt1 = findViewById(R.id.textdo)
        bt2 = findViewById(R.id.textdo1)
        bt3 = findViewById(R.id.profile)
        bt4 = findViewById(R.id.profile1)
        bac = findViewById(R.id.back)

        bt1.setOnClickListener {
            val intent = Intent(this, SeeDoctorNow::class.java)
            startActivity(intent)
        }
        bt2.setOnClickListener {
            val intent = Intent(this, SeeDoctorNow::class.java)
            startActivity(intent)
        }
        bt3.setOnClickListener {
            val intent = Intent(this, DoctorProfile::class.java)
            startActivity(intent)
        }


        bt4.setOnClickListener {
            val intent = Intent(this, DoctorProfile::class.java)
            startActivity(intent)
        }
        bac.setOnClickListener {
            val intent = Intent(this, ConsultNow::class.java)
            startActivity(intent)
        }
    }
}