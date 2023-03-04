package cs.vsu.ru.data.model

import java.math.BigDecimal

data class LampResponseDto(
    private val barcode: String,
    private val image: String,
    private val brand: String,
    private val model: String,
    private val description: String,
    private val currency: Currency,
    private val power: Int,
    private val efficiency: Int,
    private val powerEquivalent: Int,
    private val color: Int,
    private val cri: Int,
    private val angle: Int,
    private val flicker: BigDecimal,
    private val switch: SwitchType,
    private val rating: Int,
    private val warranty: Int,
    private val active: Boolean
)