package ru.surf.practice.template.hackathon.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cs.vsu.ru.domain.usecase.GetLampDataUseCase
import org.koin.android.ext.android.inject
import ru.surf.practice.template.hackathon.R

class MainActivity: AppCompatActivity() {

    private val useCase: GetLampDataUseCase by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        useCase.execute("kek")
    }
}