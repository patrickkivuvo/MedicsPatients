package com.example.mydaktari.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.example.mydaktari.MainActivity
import com.example.mydaktari.R
import com.example.mydaktari.daktari.Biodata
import com.example.mydaktari.daktari.ConsultNow
import com.example.mydaktari.daktari.DoctorProfile
import com.example.mydaktari.daktari.MyAppointments
import com.example.mydaktari.daktari.PaymentType
import com.example.mydaktari.daktari.ScheduledAppointments
import com.example.mydaktari.daktari.Self
import com.example.mydaktari.daktari.Self3
import com.example.mydaktari.daktari.SymptomChecker
import com.example.mydaktari.daktari2.AllGeneral
import com.example.mydaktari.daktari2.Blog
import com.example.mydaktari.daktari2.Details
import com.example.mydaktari.daktari2.FullDetails
import com.example.mydaktari.daktari2.Inbox
import com.example.mydaktari.daktari2.Kardex
import com.example.mydaktari.daktari2.Notifications
import com.example.mydaktari.daktari2.OnlineAppointments
import com.example.mydaktari.daktari2.PhysicalAppointments
import com.example.mydaktari.daktari2.ReviewSymptoms
import com.example.mydaktari.daktari2.SeeDoctorNow
import com.example.mydaktari.daktari2.ViewFullDescription
import com.example.mydaktari.daktari2.WaitingRoom

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAGS_CHANGED
        )
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SliderActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}