package cs.vsu.ru.domain.model

import java.math.BigDecimal


/*
штрихкод - barcode
фото - lamp_image (https://lamptest.ru/images/photo/{lamp_image}.jpg)
бренд - brand
модель - model
описание - lamp_desc
цена - rub/usd
Вт - p
Лм - lm
эфф - p / lm
экв - eq
К - color
CRI - cri
угол - angle
пул - flicker
ВИ - switch
итог - rating
гар - war
акт - act
 */

data class LampDataResponseEntity(
    val barcode: String?,
    val image: String?,
    val brand: String?,
    val model: String?,
    val description: String?,
    val price: Int?,
    val currency: CurrencyModel?,
    val power: Int?,
    val lumen: Int?,
    val efficiency: Int?,
    val powerEquivalent: Int?,
    val color: Int?,
    val cri: Int?,
    val angle: Int?,
    val flicker: BigDecimal?,
    val switch: SwitchTypeModel?,
    val rating: Int?,
    val warranty: Int?,
    val active: Boolean?
)