package ru.surf.practice.template.hackathon.di

import cs.vsu.ru.domain.usecase.GetLampDataUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetLampDataUseCase> {
        GetLampDataUseCase(lampRepository = get())
    }
}