package cs.vsu.ru.data.mapper

import cs.vsu.ru.data.model.Currency
import cs.vsu.ru.data.model.LampResponseDto
import cs.vsu.ru.data.model.SwitchType
import cs.vsu.ru.domain.model.CurrencyModel
import cs.vsu.ru.domain.model.LampDataResponseEntity
import cs.vsu.ru.domain.model.SwitchTypeModel

class LampResponseMapper {
    fun fromEntity(entity: LampDataResponseEntity?): LampResponseDto {
        if (entity == null) {
            TODO("Throw custom exception")
        }

        val dto: LampResponseDto = LampResponseDto(
            barcode = entity.barcode,
            image = entity.image,
            brand = entity.brand,
            model = entity.model,
            description = entity.description,
            price = entity.price,
            currency = Currency.valueOf(entity.currency.toString()),
            power = entity.power,
            lumen = entity.lumen,
            efficiency = entity.efficiency,
            power_equivalent = entity.powerEquivalent,
            color = entity.color,
            cri = entity.cri,
            angle = entity.angle,
            flicker = entity.flicker,
            switch_type = SwitchType.valueOf(entity.switch.toString()),
            rating = entity.rating,
            warranty = entity.warranty,
            active = entity.active
        )

        return dto
    }

    fun fromDto(dto: LampResponseDto?): LampDataResponseEntity {
        if (dto == null) {
            TODO("Throw custom exception")
        }

        val entity = LampDataResponseEntity(
            barcode = dto.barcode,
            image = dto.image,
            brand = dto.brand,
            model = dto.model,
            description = dto.description,
            price = dto.price,
            currency = CurrencyModel.valueOf(dto.currency.toString()),
            power = dto.power,
            lumen = dto.lumen,
            efficiency = dto.efficiency,
            powerEquivalent = dto.power_equivalent,
            color = dto.color,
            cri = dto.cri,
            angle = dto.angle,
            flicker = dto.flicker,
            switch = SwitchTypeModel.valueOf(dto.switch_type.toString()),
            rating = dto.rating,
            warranty = dto.warranty,
            active = dto.active
        )

        return entity
    }
}