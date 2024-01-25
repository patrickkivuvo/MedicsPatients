package com.example.mydaktari.daktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R

class DoctorVisitRequestForm : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var conti: Button


    private lateinit var bio: TextView
    private lateinit var info: TextView
    private lateinit var his: TextView

    private lateinit var BioLinear: LinearLayout
    private lateinit var InfoLinear: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_visit_request_form)

        bac = findViewById(R.id.back)
        conti = findViewById(R.id.btnHome)
        bio = findViewById(R.id.Biodata)
        info = findViewById(R.id.MedicalInfo)
        his = findViewById(R.id.History)

        BioLinear = findViewById(R.id.BiodataLayout)
        InfoLinear = findViewById(R.id.MedicalInfoLayout)

        bio.setOnClickListener {
            info.background = null
            his.background = null
            info.setTextColor(resources.getColor(R.color.textColor))
            his.setTextColor(resources.getColor(R.color.textColor))
            bio.background = resources.getDrawable(R.drawable.switch_trcks, null)
            BioLinear.visibility = View.VISIBLE
            InfoLinear.visibility = View.GONE
            bio.setTextColor(resources.getColor(R.color.white))
        }
        info.setOnClickListener {
            info.background = resources.getDrawable(R.drawable.switch_trcks, null)
            info.setTextColor(resources.getColor(R.color.white))
            bio.background = null
            his.background = null
            BioLinear.visibility = View.GONE
            InfoLinear.visibility = View.VISIBLE
            his.setTextColor(resources.getColor(R.color.textColor))
            bio.setTextColor(resources.getColor(R.color.textColor))
        }
        his.setOnClickListener {
            his.background = resources.getDrawable(R.drawable.switch_trcks, null)
            his.setTextColor(resources.getColor(R.color.white))
            bio.background = null
            info.background = null
            BioLinear.visibility = View.GONE
            InfoLinear.visibility = View.GONE
            info.setTextColor(resources.getColor(R.color.textColor))
            bio.setTextColor(resources.getColor(R.color.textColor))
        }

        bac.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        conti.setOnClickListener {
            val intent = Intent(this, PaymentType::class.java)
            startActivity(intent)
        }
    }
}