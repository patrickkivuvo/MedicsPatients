package com.example.mydaktari.daktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R
import com.example.mydaktari.daktari2.Kendi

class ResumeSession1 : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var conti: TextView
    private lateinit var conti1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume_session1)

        bac = findViewById(R.id.back)
        conti = findViewById(R.id.text)
        conti1 = findViewById(R.id.text1)

        bac.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        conti.setOnClickListener {
            val intent = Intent(this, Kendi::class.java)
            startActivity(intent)
        }
        conti1.setOnClickListener {
            val intent = Intent(this, Kendi::class.java)
            startActivity(intent)
        }
    }
}