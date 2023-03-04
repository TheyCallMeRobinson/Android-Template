package ru.surf.practice.template.hackathon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import cs.vsu.ru.data.envorinment.ServiceProvider
import cs.vsu.ru.data.mapper.LampResponseMapper
import cs.vsu.ru.data.model.LampResponseDto
import cs.vsu.ru.domain.model.BarcodeRequestEntity
import cs.vsu.ru.domain.repository.LampRepository
import org.koin.android.ext.android.inject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.surf.practice.template.hackathon.R
import ru.surf.practice.template.hackathon.databinding.ActivityDetailOutputBinding

class DetailOutputActivity : AppCompatActivity() {

    private val repository: LampRepository by inject()
    private val responseMapper: LampResponseMapper by inject()
    private val serviceProvider: ServiceProvider by inject()
    private lateinit var binding: ActivityDetailOutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_output)
        val lampService = serviceProvider.lampService

        val response = lampService.getData(savedInstanceState?.getString("barcode").toString()).enqueue(object :
            Callback<LampResponseDto> {
            override fun onResponse(call: Call<LampResponseDto>, response: Response<LampResponseDto>) {
                Log.i("Lamp Request", "Success")
                fillBriefTable(response.body()!!)
            }

            override fun onFailure(call: Call<LampResponseDto>, t: Throwable) {
                Log.e("Lamp Request", t.message!!)
            }
        })
    }

    private fun fillBriefTable(dto: LampResponseDto) {
        binding.detailOutputRatingTv.setText(dto.rating!!)
        binding.detailOutputPowerTv.setText(dto.power!!)
        binding.detailOutputPriceTv.setText(dto.price!!)
        binding.detailOutputLumenTv.setText(dto.lumen!!)
        binding.detailOutputRatingTv.setText(dto.rating!!)
        binding.detailOutputDescriptionTv.setText(dto.description!!)
        binding.detailOutputBrandTv.setText(dto.brand!!)
        binding.detailOutputModelTv.setText(dto.model!!)
        binding.detailOutputColorTv.setText(dto.color!!)
        binding.detailOutputPowerEquivalentTv.setText(dto.powerEquivalent!!)
        binding.detailOutputCriTv.setText(dto.cri!!)
        binding.detailOutputAngleTv.setText(dto.angle!!)
        binding.detailOutputFlickerTv.setText(dto.flicker!!.toString())
        binding.detailOutputSwitchTv.setText(dto.switch!!.toString())
        binding.detailOutputWarrantyTv.setText(dto.warranty!!)
        binding.detailOutputActiveTv.setText(dto.active!!.toString())
    }
}