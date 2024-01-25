package com.example.mydaktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.mydaktari.daktari.ConsultNow
import com.example.mydaktari.daktari.DoctorProfile
import com.example.mydaktari.daktari.DoctorVisitRequestForm
import com.example.mydaktari.daktari.HomeBasedCareRequestForm
import com.example.mydaktari.daktari.MyAppointments
import com.example.mydaktari.daktari.ResumeSession
import com.example.mydaktari.daktari.ResumeSession1
import com.example.mydaktari.daktari.Self
import com.example.mydaktari.daktari.SymptomChecker
import com.example.mydaktari.daktari2.Inbox
import com.example.mydaktari.daktari2.Kendi
import com.example.mydaktari.daktari2.Notifications
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var sms: ImageView
    private lateinit var notif: ImageView

    private lateinit var bt1: Button
    private lateinit var bt2: Button
    private lateinit var bt3: Button
    private lateinit var bt4: Button
    private lateinit var bt5: Button
    private lateinit var bt6: Button
    private lateinit var bt7: Button
    private lateinit var bt8: Button
    private lateinit var bt9: Button
    private lateinit var bt10: Button
    private lateinit var bt11: Button
    private lateinit var bt12: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sms = findViewById(R.id.Messages)
        notif = findViewById(R.id.Notifications)


        bt1 = findViewById(R.id.btn1)
        bt2 = findViewById(R.id.btn2)
        bt3 = findViewById(R.id.btn3)
        bt4 = findViewById(R.id.btn4)
        bt5 = findViewById(R.id.btn5)
        bt6 = findViewById(R.id.btn6)
        bt7 = findViewById(R.id.btn7)
        bt8 = findViewById(R.id.btn8)
        bt9 = findViewById(R.id.btn9)
        bt10 = findViewById(R.id.btn10)
        bt11 = findViewById(R.id.btn11)
        bt12 = findViewById(R.id.btn12)

        bt1.setOnClickListener {
            val intent = Intent(this, ConsultNow::class.java)
            startActivity(intent)
        }
        bt2.setOnClickListener {
            val intent = Intent(this, ResumeSession1::class.java)
            startActivity(intent)
        }
        bt3.setOnClickListener {
            val intent = Intent(this, SymptomChecker::class.java)
            startActivity(intent)
        }


        bt4.setOnClickListener {
            val intent = Intent(this, Self::class.java)
            startActivity(intent)
        }
        bt5.setOnClickListener {
            val intent = Intent(this, MyAppointments::class.java)
            startActivity(intent)
        }

        bt6.setOnClickListener {
            val intent = Intent(this, DoctorVisitRequestForm::class.java)
            startActivity(intent)
        }


        bt7.setOnClickListener {
            val intent = Intent(this, HomeBasedCareRequestForm::class.java)
            startActivity(intent)
        }

        sms.setOnClickListener {
            val intent = Intent(this, Inbox::class.java)
            startActivity(intent)
        }
        notif.setOnClickListener {
            val intent = Intent(this, Notifications::class.java)
            startActivity(intent)
        }

    }
}