package com.example.mydaktari.daktari2

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R
import com.example.mydaktari.daktari.Biodata
import com.example.mydaktari.daktari.ConsultNow
import com.example.mydaktari.daktari.DoctorProfile
import com.example.mydaktari.daktari.MyAppointments
import com.example.mydaktari.daktari.ResumeSession1
import com.example.mydaktari.daktari.Self
import com.example.mydaktari.daktari.SymptomChecker

class AllGeneral : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var sot: ImageView
    private lateinit var txt: TextView
    private lateinit var txt1: TextView
    private lateinit var txt2: TextView

    private lateinit var bt1: TextView
    private lateinit var bt2: TextView
    private lateinit var bt3: TextView
    private lateinit var bt4: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_general)

        bt1 = findViewById(R.id.textdo)
        bt2 = findViewById(R.id.textdo1)
        bt3 = findViewById(R.id.profile)
        bt4 = findViewById(R.id.profile1)
        bac = findViewById(R.id.back)
        sot = findViewById(R.id.sort)



        txt = findViewById(R.id.text)
        txt1 = findViewById(R.id.text1)
        txt2 = findViewById(R.id.text2)


        sot.setOnClickListener {
            var dialog=Dialog( this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setContentView(R.layout.bottom_sheet1)

            dialog.show()
            dialog.window!!.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.WHITE))
            dialog.window!!.setGravity(Gravity.BOTTOM)
        }

        txt.setOnClickListener {
            txt2.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.textColor))

        }
        txt1.setOnClickListener {
            txt2.setTextColor(resources.getColor(R.color.secondary))
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.textColor))
            val intent = Intent(this, MedicalOfficers::class.java)
            startActivity(intent)
        }

        txt2.setOnClickListener {
            txt.setTextColor(resources.getColor(R.color.secondary))
            txt1.setTextColor(resources.getColor(R.color.secondary))
            txt2.setTextColor(resources.getColor(R.color.textColor))
            val intent = Intent(this, ClinicalOfficers::class.java)
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