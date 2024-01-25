package com.example.mydaktari.daktari

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Self : AppCompatActivity() {
    private lateinit var storeImg: ImageView
    private lateinit var gallerBtn: ImageView

    private lateinit var bac: ImageView
    private lateinit var graph: Button

    private lateinit var bio: TextView
    private lateinit var info: TextView
    private lateinit var read: TextView

    private lateinit var BioLinear: LinearLayout
    private lateinit var InfoLinear: LinearLayout
    private lateinit var ReadLinear: LinearLayout

    private lateinit var chos: AutoCompleteTextView
    private lateinit var chose: AutoCompleteTextView
    private lateinit var choos: AutoCompleteTextView
    private lateinit var choose: AutoCompleteTextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_self)
        storeImg = findViewById(R.id.imageStore)
        gallerBtn = findViewById(R.id.imgPick)

        bac = findViewById(R.id.back)
        graph = findViewById(R.id.Graphs)

        bio = findViewById(R.id.Biodata)
        info = findViewById(R.id.MedicalInfo)
        read = findViewById(R.id.Readings)

        BioLinear = findViewById(R.id.BiodataLayout)
        InfoLinear = findViewById(R.id.MedicalInfoLayout)
        ReadLinear = findViewById(R.id.ReadingsLayout)


        chos = findViewById(R.id.autoCompleteTextView3)
        chose = findViewById(R.id.autoCompleteTextView2)
        choos = findViewById(R.id.autoCompleteTextView1)
        choose = findViewById(R.id.autoCompleteTextView)


        // dropdown menu for yes/no

        val choices = resources.getStringArray(R.array.choose_one)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, choices)
        val autoCompleteTV = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        autoCompleteTV.setAdapter(arrayAdapter)

        // dropdown menu for yes/no1

        val choice = resources.getStringArray(R.array.choose_one)
        val arayAdapter = ArrayAdapter(this, R.layout.dropdown_item, choice)
        val autoComplete = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView1)
        autoComplete.setAdapter(arayAdapter)

        // dropdown menu for yes/no2

        val choce = resources.getStringArray(R.array.choose_one)
        val araAdapter = ArrayAdapter(this, R.layout.dropdown_item, choce)
        val autoCompleteT = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView2)
        autoCompleteT.setAdapter(araAdapter)


        // dropdown menu for yes/no3

        val choc = resources.getStringArray(R.array.choose_one)
        val arAdapter = ArrayAdapter(this, R.layout.dropdown_item, choc)
        val autoComplet = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView3)
        autoComplet.setAdapter(arAdapter)

        bio.setOnClickListener {
            read.background = null
            info.background = null
            read.setTextColor(resources.getColor(R.color.textColor))
            info.setTextColor(resources.getColor(R.color.textColor))
            bio.background = resources.getDrawable(R.drawable.switch_trcks, null)
            BioLinear.visibility = View.VISIBLE
            InfoLinear.visibility = View.GONE
            ReadLinear.visibility = View.GONE
            bio.setTextColor(resources.getColor(R.color.white))
        }
        info.setOnClickListener {
            read.background = null
            bio.background = null
            read.setTextColor(resources.getColor(R.color.textColor))
            bio.setTextColor(resources.getColor(R.color.textColor))
            info.background = resources.getDrawable(R.drawable.switch_trcks, null)
            InfoLinear.visibility = View.VISIBLE
            BioLinear.visibility = View.GONE
            ReadLinear.visibility = View.GONE
            info.setTextColor(resources.getColor(R.color.white))
        }
        read.setOnClickListener {
            bio.background = null
            info.background = null
            bio.setTextColor(resources.getColor(R.color.textColor))
            info.setTextColor(resources.getColor(R.color.textColor))
            read.background = resources.getDrawable(R.drawable.switch_trcks, null)
            ReadLinear.visibility = View.VISIBLE
            InfoLinear.visibility = View.GONE
            BioLinear.visibility = View.GONE
            read.setTextColor(resources.getColor(R.color.white))
        }

        bac.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }




        graph.setOnClickListener {
            val intent = Intent(this, Self3::class.java)
            startActivity(intent)
        }



        gallerBtn.setOnClickListener {
            pickImageGallery()
        }

    }

    private fun pickImageGallery() {
        val intent = Intent()
        intent.action = Intent.ACTION_GET_CONTENT
        intent.type = "image/*"
        startActivityForResult(intent, 100)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100){
            storeImg.setImageURI(data?.data)
        }
    }
}