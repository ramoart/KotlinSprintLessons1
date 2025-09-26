package lesson12

fun main() {
    val day1 = Weather2(35, 25, true)
    day1.printData()
}

class Weather2(
    val dayTemp: Int,
    val nightTemp: Int,
    val bePrecipitation: Boolean,
) {
    fun printData() {
        println(
            "Дневная температура: $dayTemp, ночная температура: $nightTemp, " +
                    "наличие осадаков $bePrecipitation"
        )
    }
}