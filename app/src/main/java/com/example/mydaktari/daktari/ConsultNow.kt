package com.example.mydaktari.daktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.mydaktari.R
import com.example.mydaktari.daktari2.AllGeneral
import com.example.mydaktari.daktari2.AllSpecialists
import com.example.mydaktari.daktari2.DrSpecialist
import com.example.mydaktari.daktari2.Inbox
import com.example.mydaktari.daktari2.MedicalOfficer
import com.example.mydaktari.daktari2.Notifications
import com.example.mydaktari.daktari2.Nutritionist
import com.example.mydaktari.daktari2.OnlineAppointments
import com.example.mydaktari.daktari2.Psychologist
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ConsultNow : AppCompatActivity() {
    private lateinit var sms: ImageView
    private lateinit var notif: ImageView

    private lateinit var bt1: Button
    private lateinit var bt2: Button
    private lateinit var bt3: Button
    private lateinit var bt4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consult_now)
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
            val intent = Intent(this, AllGeneral::class.java)
            startActivity(intent)
        }
        bt3.setOnClickListener {
            val intent = Intent(this, AllSpecialists::class.java)
            startActivity(intent)
        }
        bt4.setOnClickListener {
            val intent = Intent(this, Psychologists::class.java)
            startActivity(intent)
        }
        bt2.setOnClickListener {
            val intent = Intent(this, Nutritionists::class.java)
            startActivity(intent)
        }

    }
}