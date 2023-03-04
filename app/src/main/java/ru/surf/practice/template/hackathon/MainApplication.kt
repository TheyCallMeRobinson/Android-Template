package ru.surf.practice.template.hackathon

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.logger.AndroidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.surf.practice.template.hackathon.di.appModule
import ru.surf.practice.template.hackathon.di.dataModule
import ru.surf.practice.template.hackathon.di.domainModule

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            AndroidLogger(Level.DEBUG)
            androidContext(this@MainApplication)
            modules(listOf(appModule, dataModule, domainModule))
        }
    }
}