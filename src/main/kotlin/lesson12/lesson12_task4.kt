package lesson12

fun main() {
    val day1 = Weather4(310, 295, true)
}

class Weather4(
    dayKelvinTemp: Int, nightKelvinTemp: Int, isPrecipitation: Boolean
) {
    init {
        println(
            "Дневная температура: ${dayKelvinTemp - COEFFICIENT}, ночная температура: ${nightKelvinTemp - COEFFICIENT}, " +
                    "наличие осадаков $isPrecipitation"
        )
    }
}

const val COEFFICIENT = 273