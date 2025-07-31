package lesson4

fun main() {
    println("Отсутствуют ли повреждения корпуса корбла? Ответ необходим в виде true/false:")
    val currentShipStatus = readln().toBoolean()
    println("Напишите целочисленным числом текущий состав экипажа:")
    val currentCrewCount = readln().toInt()
    println("Напишите целочисленным количество ящиков с провизией на борту:")
    val currentBoxesCount = readln().toInt()
    println("Благоприятные ли метеусловия? Ответ необходим в виде true/false:")
    val currentWeatherStatus = readln().toBoolean()


    println(
        "По основому блоку условий научно-исследовательский корабль готов к плаванию: ${
            (currentShipStatus == IS_SHIP_DONT_HAVE_DAMAGE) && (currentCrewCount != null && currentCrewCount in MIN_CREW..MAX_CREW)
                    and (currentBoxesCount != null && currentBoxesCount > MIN_COUNT_BOXES) && (currentWeatherStatus == IS_WEATHER_HAVE_GOOD_STATUS)
        }"
    )

    println(
        "По альтернативному блоку условий научно-исследовательский корабль готов к плаванию: ${
            (currentCrewCount != null && currentCrewCount == ALT_COUNT_CREW) && (currentWeatherStatus == IS_ALT_WEATHER_GOOD_STATUS)
                    && (currentBoxesCount != null && currentBoxesCount >= ALT_MIN_COUNT_BOXES)
        }"
    )
}

//Основной блок условий
const val IS_SHIP_DONT_HAVE_DAMAGE = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_COUNT_BOXES = 50
const val IS_WEATHER_HAVE_GOOD_STATUS = true

//Альтернативный блок условий
const val ALT_COUNT_CREW = 70
const val IS_ALT_WEATHER_GOOD_STATUS = true
const val ALT_MIN_COUNT_BOXES = 50