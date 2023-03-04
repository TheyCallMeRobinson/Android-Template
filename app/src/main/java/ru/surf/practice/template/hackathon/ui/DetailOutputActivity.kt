package ru.surf.practice.template.hackathon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cs.vsu.ru.data.envorinment.ServiceProvider
import cs.vsu.ru.data.mapper.LampResponseMapper
import cs.vsu.ru.data.model.LampResponseDto
import cs.vsu.ru.domain.repository.LampRepository
import org.koin.android.ext.android.inject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.surf.practice.template.hackathon.databinding.ActivityDetailOutputBinding

class DetailOutputActivity : AppCompatActivity() {

    private val repository: LampRepository by inject()
    private val responseMapper: LampResponseMapper by inject()
    private val serviceProvider: ServiceProvider by inject()
    private lateinit var binding: ActivityDetailOutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lampService = serviceProvider.lampService
        val response = lampService.getData("4607136943841").enqueue(object :
            Callback<LampResponseDto> {
            override fun onResponse(call: Call<LampResponseDto>, response: Response<LampResponseDto>) {
                Log.i("Lamp Request", "Success")
                response.body()?.let {
                    fillBriefTable(it)
                }
            }

            override fun onFailure(call: Call<LampResponseDto>, t: Throwable) {
                Log.e("Lamp Request", t.message!!)
            }
        })
    }

    private fun fillBriefTable(dto: LampResponseDto) {
        binding.detailOutputRatingTv.setText(dto.rating!!.toString())
        binding.detailOutputPowerTv.setText(dto.power!!.toString())
        binding.detailOutputPriceTv.setText(dto.price!!.toString())
        binding.detailOutputLumenTv.setText(dto.lumen!!.toString())
        binding.detailOutputRatingTv.setText(dto.rating!!.toString())
        binding.detailOutputDescriptionTv.setText(dto.description!!.toString())
        binding.detailOutputBrandTv.setText(dto.brand!!.toString())
        binding.detailOutputModelTv.setText(dto.model!!.toString())
        binding.detailOutputColorTv.setText(dto.color!!.toString())
        binding.detailOutputPowerEquivalentTv.setText(dto.power_equivalent!!.toString())
        binding.detailOutputCriTv.setText(dto.cri!!.toString())
        binding.detailOutputAngleTv.setText(dto.angle!!.toString())
        binding.detailOutputFlickerTv.setText(dto.flicker!!.toString())
        binding.detailOutputSwitchTv.setText(dto.switch_type!!.toString())
        binding.detailOutputWarrantyTv.setText(dto.warranty!!.toString())
        binding.detailOutputActiveTv.setText(dto.active!!.toString())
    }
}