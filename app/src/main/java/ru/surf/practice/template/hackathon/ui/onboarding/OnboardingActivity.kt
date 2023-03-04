package ru.surf.practice.template.hackathon.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import ru.surf.practice.template.hackathon.ui.MainActivity
import ru.surf.practice.template.hackathon.R

class OnboardingActivity : AppCompatActivity() {

    private val viewPagerAdapter = OnboardingAdapter(onboardingPages)
    private var viewPager2: ViewPager2? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_activity)
        initViewPager()
        val button = findViewById<Button>(R.id.next_btn)
        button.setOnClickListener {
            viewPager2?.let { pager ->
                if (pager.currentItem == onboardingPages.size - 1) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    viewPager2?.currentItem = pager.currentItem + 1
                }
            }
        }

    }

    private fun initViewPager() {
        viewPager2 = findViewById<ViewPager2>(R.id.view_pager).apply { adapter = viewPagerAdapter }
    }

    private companion object {
        val onboardingPages = listOf(
            OnboardingData("1", "Это приложения для февральского хакатона в Surf"),
            OnboardingData("2", "В приложении вы можете отсканировать штрих-код интересующей вас лампочки"),
            OnboardingData("3", "Мы предоставим вам всю имеющуюся информацию по необходимой лампочке"),
            OnboardingData("4", "Вы можете ввести штрих-код вручную или использовать камеру для сканирования"),
        )
    }
}