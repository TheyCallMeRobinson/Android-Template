package ru.surf.practice.template.hackathon.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.surf.practice.template.hackathon.R
import ru.surf.practice.template.hackathon.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}