package com.example.mydaktari.daktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R
import com.example.mydaktari.daktari2.SeeDoctorNow
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DoctorProfile : AppCompatActivity() {
    private lateinit var now: Button
    private lateinit var book: Button
    private lateinit var bac: ImageView
    private lateinit var abut: TextView
    private lateinit var serv: TextView
    private lateinit var review: TextView

    private lateinit var AbotLinear: LinearLayout
    private lateinit var ServLinear: LinearLayout
    private lateinit var RevLinear: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_profile)
        now = findViewById(R.id.ConsultNow)
        book = findViewById(R.id.Appointments)

        abut = findViewById(R.id.About)
        serv = findViewById(R.id.Services)
        review = findViewById(R.id.Reviews)

        AbotLinear = findViewById(R.id.AboutLayout)
        ServLinear = findViewById(R.id.ServicesLayout)
        RevLinear = findViewById(R.id.ReviewsLayout)

        abut.setOnClickListener {
            serv.background = null
            review.background = null
            serv.setTextColor(resources.getColor(R.color.textColor))
            review.setTextColor(resources.getColor(R.color.textColor))
            abut.background = resources.getDrawable(R.drawable.switch_trcks, null)
            AbotLinear.visibility = View.VISIBLE
            ServLinear.visibility = View.GONE
            RevLinear.visibility = View.GONE
            abut.setTextColor(resources.getColor(R.color.white))
        }
        serv.setOnClickListener {
            serv.background = resources.getDrawable(R.drawable.switch_trcks, null)
            serv.setTextColor(resources.getColor(R.color.white))
            abut.background = null
            review.background = null
            AbotLinear.visibility = View.GONE
            RevLinear.visibility = View.GONE
            ServLinear.visibility = View.VISIBLE
            abut.setTextColor(resources.getColor(R.color.textColor))
            review.setTextColor(resources.getColor(R.color.textColor))
        }
        review.setOnClickListener {
            review.background = resources.getDrawable(R.drawable.switch_trcks, null)
            review.setTextColor(resources.getColor(R.color.white))
            abut.background = null
            serv.background = null
            AbotLinear.visibility = View.GONE
            ServLinear.visibility = View.GONE
            RevLinear.visibility = View.VISIBLE
            abut.setTextColor(resources.getColor(R.color.textColor))
            serv.setTextColor(resources.getColor(R.color.textColor))
        }

        bac = findViewById(R.id.back)
        bac.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        now.setOnClickListener {
            val intent = Intent(this, SeeDoctorNow::class.java)
            startActivity(intent)
        }

        book.setOnClickListener {
            val intent = Intent(this, MyAppointments::class.java)
            startActivity(intent)
        }


    }
}