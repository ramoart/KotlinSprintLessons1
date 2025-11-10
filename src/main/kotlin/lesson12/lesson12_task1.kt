package lesson12

fun main() {
    val day1 = Weather()
    val day2 = Weather()
    day1.dayTemp = 30
    day2.dayTemp = 35
    day1.nightTemp = 20
    day2.nightTemp = 25
    day1.bePrecipitation = true
    day2.bePrecipitation = false
    day1.printData()
    day2.printData()
}

class Weather() {
    var dayTemp: Int = 0
    var nightTemp: Int = 0
    var bePrecipitation: Boolean = false

    fun printData() {
        println(
            "Дневная температура: $dayTemp, ночная температура: $nightTemp, " +
                    "наличие осадаков $bePrecipitation"
        )
    }
}