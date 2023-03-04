package cs.vsu.ru.data.service

import cs.vsu.ru.data.model.LampResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LampService {
    @GET("api/lamp/{barcode}")
    fun getData(@Path(value = "barcode") barcode: String): Call<LampResponseDto>
}