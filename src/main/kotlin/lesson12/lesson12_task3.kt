package lesson12

fun main() {
    val day1 = Weather3(310, 295, true)
    day1.printData()
}

class Weather3(
    dayKelvinTemp: Int, nightKelvinTemp: Int, isPrecipitation: Boolean
) {
    val dayTemp: Int = dayKelvinTemp - COEFFICIENT
    val nightTemp: Int = nightKelvinTemp - COEFFICIENT
    val bePrecipitation: Boolean = isPrecipitation

    fun printData() {
        println(
            "Дневная температура: $dayTemp, ночная температура: $nightTemp, " +
                    "наличие осадаков $bePrecipitation"
        )
    }
}

const val COEFFICIENT = 273