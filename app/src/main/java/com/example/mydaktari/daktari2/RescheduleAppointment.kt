package com.example.mydaktari.daktari2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.mydaktari.R
import com.example.mydaktari.daktari.ConsultNow

class RescheduleAppointment : AppCompatActivity() {
    private lateinit var bt1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reschedule_appointment)
        bt1 = findViewById(R.id.btnSave)

        bt1.setOnClickListener {
            Toast.makeText(this, "Rescheduled Successful!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ConsultNow::class.java)
            startActivity(intent)
        }
    }
}