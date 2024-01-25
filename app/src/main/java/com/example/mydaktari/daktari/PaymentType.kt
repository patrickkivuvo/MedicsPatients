package com.example.mydaktari.daktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R
import com.example.mydaktari.welcome.Congrats
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PaymentType : AppCompatActivity() {
    private lateinit var pays: Button
    private lateinit var pay: RadioGroup
    private lateinit var bac: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_type)
        pay = findViewById(R.id.Payment)
        pays = findViewById(R.id.Confirm)


        bac = findViewById(R.id.back)


        bac.setOnClickListener {
            val intent = Intent(this, ScheduledAppointments::class.java)
            startActivity(intent)
        }

        pays.setOnClickListener {
            val payments = pay.toString()

            if (TextUtils.isEmpty(payments)){
                Toast.makeText(this, "Please Add Data to Empty Fields!!", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Added Successfuly!!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }


    }
}