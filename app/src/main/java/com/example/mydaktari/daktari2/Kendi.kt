package com.example.mydaktari.daktari2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.mydaktari.R
import com.example.mydaktari.daktari.ResumeSession

class Kendi : AppCompatActivity() {
    private lateinit var txt: TextView
    private lateinit var txt1: TextView
    private lateinit var txt2: TextView

    private lateinit var back: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kendi)

        back = findViewById(R.id.back)

        txt = findViewById(R.id.text)
        txt1 = findViewById(R.id.text1)
        txt2 = findViewById(R.id.text2)


        txt.setOnClickListener {
            txt2.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.textColor))
            val intent = Intent(this, SeeDoctorNow::class.java)
            startActivity(intent)
        }
        txt1.setOnClickListener {
            txt2.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.textColor))

        }

        txt2.setOnClickListener {
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.textColor))
            val intent = Intent(this, ResumeSession::class.java)
            startActivity(intent)
        }
    }


    fun call(view: View){
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:+254 7123456789")
        startActivity(dialIntent)
    }
}