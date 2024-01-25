package com.example.mydaktari.daktari2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.mydaktari.R

class DrSpecialist : AppCompatActivity() {
    private lateinit var sms: ImageView
    private lateinit var notif: ImageView

    private lateinit var bt1: Button
    private lateinit var bt2: Button
    private lateinit var bt3: Button
    private lateinit var bt4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dr_specialist)

        sms = findViewById(R.id.Messages)
        notif = findViewById(R.id.Notifications)

        bt1 = findViewById(R.id.btn1)
        bt2 = findViewById(R.id.btn6)
        bt3 = findViewById(R.id.btn3)
        bt4 = findViewById(R.id.btn4)


        sms.setOnClickListener {
            val intent = Intent(this, Inbox::class.java)
            startActivity(intent)
        }
        notif.setOnClickListener {
            val intent = Intent(this, Notifications::class.java)
            startActivity(intent)
        }

        bt1.setOnClickListener {
            val intent = Intent(this, OnlineAppointments::class.java)
            startActivity(intent)
        }
        bt3.setOnClickListener {
            val intent = Intent(this, WaitingRoom::class.java)
            startActivity(intent)
        }
        bt4.setOnClickListener {
            val intent = Intent(this, SymptomCheckerRequest::class.java)
            startActivity(intent)
        }
        bt2.setOnClickListener {
            val intent = Intent(this, PhysicalAppointments::class.java)
            startActivity(intent)
        }
    }
}