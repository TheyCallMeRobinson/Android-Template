package cs.vsu.ru.domain.model


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
    private val brand: String = "",
    private val model: String = "",
    private val description: String = "",
    private val price: String = "",
)