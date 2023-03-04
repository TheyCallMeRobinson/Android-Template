package cs.vsu.ru.data.envorinment

import cs.vsu.ru.data.service.LampService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceProvider {

    private val baseUrl = "http://event.surfstudio.ru:8081/"
    private var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient.Builder().build())
        .build()

    var lampService: LampService = retrofit.create(LampService::class.java)
}