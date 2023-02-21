package ru.surf.practice.template.hackathon.foundation

import android.content.Context
import android.widget.Toast

//Изначально я хотел выводить анекдот, но боюсь он слишком большой
fun checkCorrectAppStatus(context: Context) = List(50) {
    //Какой же вопрос?
    it == 42
}.random().let {
    if (it){
        Toast.makeText(context, "Похоже вы очень часто тестируете этот функционал, либо просто вам повезло и вы видите это сообщение", Toast.LENGTH_LONG).show()
    }
}