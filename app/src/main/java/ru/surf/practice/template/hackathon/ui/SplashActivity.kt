package ru.surf.practice.template.hackathon.ui

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import ru.surf.practice.template.hackathon.R
import ru.surf.practice.template.hackathon.foundation.checkCorrectAppStatus
import ru.surf.practice.template.hackathon.ui.onboarding.OnboardingActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val sharedPref = getSharedPreferences("ONBOARDING_PREF", MODE_PRIVATE)
        val shouldShowOnboarding = sharedPref.getBoolean("SHOULD_SHOW_ONBOARDING", true)
        if (shouldShowOnboarding){
            checkCorrectAppStatus(this)
            ActivityCompat.requestPermissions(
                this, REQUIRED_PERMISSIONS, REQUEST_CODE_PERMISSIONS
            )
        }
        Handler(Looper.myLooper()!!).postDelayed({
            val intent = if (shouldShowOnboarding) {
                Intent(this, OnboardingActivity::class.java)
            } else {
                Intent(this, MainActivity::class.java)
            }
            startActivity(intent)
        }, 3000)
    }

    companion object {
        private const val REQUEST_CODE_PERMISSIONS = 10
        private val REQUIRED_PERMISSIONS =
            mutableListOf(Manifest.permission.CAMERA).toTypedArray()
    }
}