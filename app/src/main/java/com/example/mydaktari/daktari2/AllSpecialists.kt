package com.example.mydaktari.daktari2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.mydaktari.R
import com.example.mydaktari.daktari.ConsultNow
import com.example.mydaktari.daktari.DoctorProfile

class AllSpecialists : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var txt: TextView
    private lateinit var txt1: TextView
    private lateinit var txt2: TextView
    private lateinit var txt3: TextView
    private lateinit var txt4: TextView
    private lateinit var txt5: TextView
    private lateinit var txt6: TextView

    private lateinit var bt1: TextView
    private lateinit var bt2: TextView
    private lateinit var bt3: TextView
    private lateinit var bt4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_specialists)


        bt1 = findViewById(R.id.textdo)
        bt2 = findViewById(R.id.textdo1)
        bt3 = findViewById(R.id.profile)
        bt4 = findViewById(R.id.profile1)
        bac = findViewById(R.id.back)



        txt = findViewById(R.id.text)
        txt1 = findViewById(R.id.text1)
        txt2 = findViewById(R.id.text2)
        txt3 = findViewById(R.id.text3)
        txt4 = findViewById(R.id.text4)
        txt5 = findViewById(R.id.text5)
        txt6 = findViewById(R.id.text6)


        txt.setOnClickListener {
            txt2.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt3.setTextColor(resources.getColor(R.color.secondary))
            txt4.setTextColor(resources.getColor(R.color.secondary))
            txt5.setTextColor(resources.getColor(R.color.secondary))
            txt6.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.textColor))
            val intent = Intent(this, AllSpecialists::class.java)
            startActivity(intent)
        }
        txt1.setOnClickListener {
            txt3.setTextColor(resources.getColor(R.color.secondary))
            txt4.setTextColor(resources.getColor(R.color.secondary))
            txt5.setTextColor(resources.getColor(R.color.secondary))
            txt6.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.textColor))
            val intent = Intent(this, Brain::class.java)
            startActivity(intent)
        }

        txt2.setOnClickListener {
            txt3.setTextColor(resources.getColor(R.color.secondary))
            txt4.setTextColor(resources.getColor(R.color.secondary))
            txt5.setTextColor(resources.getColor(R.color.secondary))
            txt6.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.textColor))
            val intent = Intent(this, Eye::class.java)
            startActivity(intent)
        }

        txt3.setOnClickListener {
            txt3.setTextColor(resources.getColor(R.color.textColor))
            txt4.setTextColor(resources.getColor(R.color.secondary))
            txt5.setTextColor(resources.getColor(R.color.secondary))
            txt6.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.secondary))
            val intent = Intent(this, Heart::class.java)
            startActivity(intent)
        }

        txt4.setOnClickListener {
            txt3.setTextColor(resources.getColor(R.color.secondary))
            txt4.setTextColor(resources.getColor(R.color.textColor))
            txt5.setTextColor(resources.getColor(R.color.secondary))
            txt6.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.secondary))
            val intent = Intent(this, Ear::class.java)
            startActivity(intent)
        }

        txt5.setOnClickListener {
            txt3.setTextColor(resources.getColor(R.color.secondary))
            txt4.setTextColor(resources.getColor(R.color.secondary))
            txt5.setTextColor(resources.getColor(R.color.textColor))
            txt6.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.secondary))
            val intent = Intent(this, Chest::class.java)
            startActivity(intent)
        }

        txt6.setOnClickListener {
            txt3.setTextColor(resources.getColor(R.color.secondary))
            txt4.setTextColor(resources.getColor(R.color.secondary))
            txt5.setTextColor(resources.getColor(R.color.secondary))
            txt6.setTextColor(resources.getColor(R.color.textColor))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.secondary))
            val intent = Intent(this, Borne::class.java)
            startActivity(intent)
        }

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