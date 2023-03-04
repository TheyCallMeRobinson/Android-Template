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

class LampRepositoryImpl(
    private val responseMapper: LampResponseMapper,
    private val serviceProvider: ServiceProvider
) : LampRepository {

    override fun getData(request: BarcodeRequestEntity): LampDataResponseEntity? {
        val lampService = serviceProvider.lampService

        var entity: LampDataResponseEntity

        //entity = responseMapper.fromDto(lampService.getData(request.barcode).execute().body())

        val response = lampService.getData(request.barcode).enqueue(object : Callback<LampResponseDto> {
            override fun onResponse(call: Call<LampResponseDto>, response: Response<LampResponseDto>) {
                Log.i("Lamp Request", "Success")
                entity = responseMapper.fromDto(response.body())
            }

            override fun onFailure(call: Call<LampResponseDto>, t: Throwable) {
                Log.e("Lamp Request", t.message!!)
            }
        })

        return null
    }
}