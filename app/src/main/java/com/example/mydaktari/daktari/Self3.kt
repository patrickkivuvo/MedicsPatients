package com.example.mydaktari.daktari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Self3 : AppCompatActivity() {
    private lateinit var bac: ImageView

    private lateinit var grap: TextView
    private lateinit var book: TextView
    private lateinit var bok: TextView

    private lateinit var GraphLinear: LinearLayout
    private lateinit var BookLinear: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_self3)
        bac = findViewById(R.id.back)

        grap = findViewById(R.id.Graphs)
        book = findViewById(R.id.Appointment)
        bok = findViewById(R.id.Book)

        GraphLinear = findViewById(R.id.GraphsLayout)
        BookLinear = findViewById(R.id.BookLayout)

        grap.setOnClickListener {
            book.background = null
            book.setTextColor(resources.getColor(R.color.textColor))
            grap.background = resources.getDrawable(R.drawable.switch_trcks, null)
            GraphLinear.visibility = View.VISIBLE
            BookLinear.visibility = View.GONE
            grap.setTextColor(resources.getColor(R.color.white))
        }
        book.setOnClickListener {
            book.background = resources.getDrawable(R.drawable.switch_trcks, null)
            book.setTextColor(resources.getColor(R.color.white))
            grap.background = null
            GraphLinear.visibility = View.GONE
            BookLinear.visibility = View.VISIBLE
            grap.setTextColor(resources.getColor(R.color.textColor))
        }


        bac.setOnClickListener {
            val intent = Intent(this, Self::class.java)
            startActivity(intent)
        }


        bok.setOnClickListener {
            val intent = Intent(this, ScheduledAppointments::class.java)
            startActivity(intent)
        }
    }
}