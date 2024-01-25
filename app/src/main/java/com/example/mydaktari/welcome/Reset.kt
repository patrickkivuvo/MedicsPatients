package com.example.mydaktari.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mydaktari.R

class Reset : AppCompatActivity() {

    private lateinit var contin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset)

        contin = findViewById(R.id.btnHome)



        contin.setOnClickListener {
            val intent = Intent(this, Congrats::class.java)
            startActivity(intent)
        }
    }
}