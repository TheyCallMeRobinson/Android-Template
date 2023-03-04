package cs.vsu.ru.data.mapper

import cs.vsu.ru.data.model.LampResponseDto
import cs.vsu.ru.domain.model.LampDataResponseEntity

class LampResponseMapper {
    fun fromEntity(entity: LampDataResponseEntity?): LampResponseDto {
        if (entity == null) {
            TODO("Throw custom exception")
        }

        val dto = LampResponseDto()

        return dto
    }

    fun fromDto(dto: LampResponseDto?): LampDataResponseEntity {
        if (dto == null) {
            TODO("Throw custom exception")
        }

        val entity = LampDataResponseEntity()

        return entity
    }
}