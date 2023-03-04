package cs.vsu.ru.data.model

import java.math.BigDecimal

data class LampResponseDto(
    val barcode: String?,
    val image: String?,
    val brand: String?,
    val model: String?,
    val description: String?,
    val price: BigDecimal?,
    val currency: Currency?,
    val power: BigDecimal?,
    val lumen: BigDecimal?,
    val efficiency: BigDecimal?,
    val power_equivalent: BigDecimal?,
    val color: BigDecimal?,
    val cri: BigDecimal?,
    val angle: BigDecimal?,
    val flicker: BigDecimal?,
    val switch_type: SwitchType?,
    val rating: BigDecimal?,
    val warranty: Int?,
    val active: Boolean?
)