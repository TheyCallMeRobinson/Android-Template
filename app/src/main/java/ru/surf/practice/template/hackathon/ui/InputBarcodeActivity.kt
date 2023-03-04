package ru.surf.practice.template.hackathon.ui

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import ru.surf.practice.template.hackathon.R
import ru.surf.practice.template.hackathon.databinding.InputBarcodeActivityBinding

class InputBarcodeActivity : AppCompatActivity() {

    private lateinit var binding: InputBarcodeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InputBarcodeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.barcodeNextButton.setOnClickListener {
            val intent = Intent(this, DetailOutputActivity::class.java)
            intent.putExtra("barcode", binding.barcodeEt.text.toString())
            startActivity(intent)
        }
    }
}