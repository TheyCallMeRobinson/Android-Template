package ru.surf.practice.template.hackathon.di

import cs.vsu.ru.data.envorinment.ServiceProvider
import cs.vsu.ru.data.mapper.LampResponseMapper
import cs.vsu.ru.data.repository.LampRepositoryImpl
import cs.vsu.ru.domain.repository.LampRepository
import org.koin.dsl.module

val dataModule = module {

    single<ServiceProvider> {
        ServiceProvider()
    }

    single<LampResponseMapper> {
        LampResponseMapper()
    }

    single<LampRepository> {
        LampRepositoryImpl(serviceProvider = get(), responseMapper = get())
    }
}