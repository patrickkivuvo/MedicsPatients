package com.example.mydaktari.daktari2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mydaktari.R
import com.example.mydaktari.daktari.ResumeSession

class SymptomCheckerRequest : AppCompatActivity() {
    private lateinit var viewD: Button
    private lateinit var accep: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptom_checker_request)
        viewD = findViewById(R.id.View)
        accep = findViewById(R.id.Accept)


        viewD.setOnClickListener {
            val intent = Intent(this, ViewProfile::class.java)
            startActivity(intent)
        }
        accep.setOnClickListener {
            val intent = Intent(this, ReviewSymptoms::class.java)
            startActivity(intent)
        }
    }
}