package lesson12

fun main() {
    val daysWeatherList = mutableListOf<Weather5>()
    repeat(NUMBER_OF_DAYS) {
        val precipitationRandom = if ((MIN_RANDOM..MAX_EVEN_RANDOM).random() % 2 == 0) true else false
        val day = Weather5((MIN_RANDOM..MAX_TEMP_RANDOM).random(), (0..40).random(), precipitationRandom)
        daysWeatherList.add(day)
    }
    val dayTempAverage = daysWeatherList.map { it.dayTemp }.average()
    val nightTempAverage = daysWeatherList.map { it.nightTemp }.average()
    val precipitaionCount = daysWeatherList.count { it.bePrecipitation }
    println(
        "Средняя дневная температура = ${"%.2f".format(dayTempAverage)}, " +
                "средняя ночная температура = ${"%.2f".format(nightTempAverage)}, " +
                "количество дней c осадками = $precipitaionCount"
    )

}

class Weather5(
    val dayTemp: Int,
    val nightTemp: Int,
    val bePrecipitation: Boolean,
)

const val NUMBER_OF_DAYS = 30
const val MIN_RANDOM = 0
const val MAX_TEMP_RANDOM = 40
const val MAX_EVEN_RANDOM = 10

