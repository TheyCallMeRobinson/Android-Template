package ru.surf.practice.template.hackathon.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cs.vsu.ru.domain.usecase.GetLampDataUseCase
import ru.surf.practice.template.hackathon.R

class MainActivity: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}