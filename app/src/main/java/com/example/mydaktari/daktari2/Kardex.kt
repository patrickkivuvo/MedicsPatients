package com.example.mydaktari.daktari2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mydaktari.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Kardex : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var save: FloatingActionButton

    private lateinit var PreLinear: LinearLayout
    private lateinit var ClickLinear: LinearLayout
    private lateinit var PostLinear: LinearLayout
    private lateinit var RecLinear: LinearLayout

    private lateinit var pre: TextView
    private lateinit var click: TextView
    private lateinit var post: TextView
    private lateinit var reco: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kardex)
        bac = findViewById(R.id.back)
        save = findViewById(R.id.addContinue)

        PreLinear = findViewById(R.id.PreLayout)
        ClickLinear = findViewById(R.id.ClickedLayout)
        PostLinear = findViewById(R.id.PostLayout)
        RecLinear = findViewById(R.id.RecommendationsLayout)


        pre = findViewById(R.id.Pre)
        post = findViewById(R.id.Post)
        click = findViewById(R.id.Clicked)
        reco = findViewById(R.id.Recommendations)

        pre.setOnClickListener {
            post.background = null
            click.background = null
            reco.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            click.setTextColor(resources.getColor(R.color.textColor))
            reco.setTextColor(resources.getColor(R.color.textColor))
            pre.background = resources.getDrawable(R.drawable.switch_trcks, null)
            PreLinear.visibility = View.VISIBLE
            ClickLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            RecLinear.visibility = View.GONE
            pre.setTextColor(resources.getColor(R.color.white))
        }
        post.setOnClickListener {
            pre.background = null
            click.background = null
            reco.background = null
            pre.setTextColor(resources.getColor(R.color.textColor))
            click.setTextColor(resources.getColor(R.color.textColor))
            reco.setTextColor(resources.getColor(R.color.textColor))
            post.background = resources.getDrawable(R.drawable.switch_trcks, null)
            PostLinear.visibility = View.VISIBLE
            ClickLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
            RecLinear.visibility = View.GONE
            post.setTextColor(resources.getColor(R.color.white))
        }
        click.setOnClickListener {
            post.background = null
            pre.background = null
            reco.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            pre.setTextColor(resources.getColor(R.color.textColor))
            reco.setTextColor(resources.getColor(R.color.textColor))
            click.background = resources.getDrawable(R.drawable.switch_trcks, null)
            ClickLinear.visibility = View.VISIBLE
            PreLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            RecLinear.visibility = View.GONE
            click.setTextColor(resources.getColor(R.color.white))
        }

        reco.setOnClickListener {
            post.background = null
            click.background = null
            pre.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            click.setTextColor(resources.getColor(R.color.textColor))
            pre.setTextColor(resources.getColor(R.color.textColor))
            reco.background = resources.getDrawable(R.drawable.switch_trcks, null)
            RecLinear.visibility = View.VISIBLE
            ClickLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
            reco.setTextColor(resources.getColor(R.color.white))
        }


    }
}