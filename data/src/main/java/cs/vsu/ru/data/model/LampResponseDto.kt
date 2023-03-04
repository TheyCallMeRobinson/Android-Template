package cs.vsu.ru.data.model

import java.math.BigDecimal

data class LampResponseDto(
    val barcode: String,
    val image: String,
    val brand: String,
    val model: String,
    val description: String,
    val price: Int,
    val currency: Currency,
    val power: Int,
    val lumen: Int,
    val efficiency: Int,
    val powerEquivalent: Int,
    val color: Int,
    val cri: Int,
    val angle: Int,
    val flicker: BigDecimal,
    val switch: SwitchType,
    val rating: Int,
    val warranty: Int,
    val active: Boolean
)