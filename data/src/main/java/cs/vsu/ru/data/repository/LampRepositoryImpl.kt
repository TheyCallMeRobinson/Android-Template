package cs.vsu.ru.data.repository

import android.util.Log
import cs.vsu.ru.data.envorinment.ServiceProvider
import cs.vsu.ru.data.mapper.LampResponseMapper
import cs.vsu.ru.data.model.LampResponseDto
import cs.vsu.ru.domain.model.BarcodeRequestEntity
import cs.vsu.ru.domain.model.LampDataResponseEntity
import cs.vsu.ru.domain.repository.LampRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

typealias LampRequest = (Result<LampResponseDto>) -> Unit

class LampRepositoryImpl(
    private val responseMapper: LampResponseMapper,
    private val serviceProvider: ServiceProvider
) : LampRepository {

    private val callbacks: MutableList<LampRequest> = mutableListOf()

    fun addObservers(lampRequest: LampRequest) {
        callbacks.add(lampRequest)
    }

    override fun getData(request: BarcodeRequestEntity): LampDataResponseEntity? {
        val lampService = serviceProvider.lampService

        var entity: LampDataResponseEntity

        val response = lampService.getData(request.barcode).enqueue(object : Callback<LampResponseDto> {
            override fun onResponse(call: Call<LampResponseDto>, response: Response<LampResponseDto>) {
                Log.i("Lamp Request", "Success")
                entity = responseMapper.fromDto(response.body())
                callbacks.forEach { it(Result.success(response.body()!!)) }
            }

            override fun onFailure(call: Call<LampResponseDto>, t: Throwable) {
                Log.e("Lamp Request", t.message!!)
                callbacks.forEach { it(Result.failure(t)) }
            }
        })

        return null
    }
}