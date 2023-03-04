package cs.vsu.ru.domain.repository

import cs.vsu.ru.domain.model.BarcodeRequestEntity
import cs.vsu.ru.domain.model.LampDataResponseEntity

interface LampRepository {
    fun getData(request: BarcodeRequestEntity): LampDataResponseEntity?
}