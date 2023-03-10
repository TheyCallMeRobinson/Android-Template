package ru.surf.practice.template.hackathon.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.surf.practice.template.hackathon.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.openInputBarcodeBtn.setOnClickListener {
            startActivity(Intent(this, InputBarcodeActivity::class.java))
        }
    }
}