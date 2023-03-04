package cs.vsu.ru.domain.usecase

import cs.vsu.ru.domain.model.BarcodeRequestEntity
import cs.vsu.ru.domain.model.LampDataResponseEntity
import cs.vsu.ru.domain.repository.LampRepository

class GetLampDataUseCase(private val lampRepository: LampRepository) {
    fun execute(barcode: String): LampDataResponseEntity {
        return lampRepository.getData(BarcodeRequestEntity(barcode))
    }
}