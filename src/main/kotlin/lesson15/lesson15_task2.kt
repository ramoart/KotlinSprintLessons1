package lesson15

fun main() {
    val temperatureDay1 = Temperature(15, 60, 10)
    val precipitationDay1 = PrecipitationAmount(15, 60, 10)
    val weatherData = WeatherServer(temperatureDay1.averageTemperature, precipitationDay1.averagePrecipitation)
    weatherData.printData(temperatureDay1.averageTemperature, precipitationDay1.averagePrecipitation)
}

abstract class WeatherStationStats(
    val temperature: Int,
    val precipitationAmount: Int,
)

class Temperature(
    temperature: Int,
    precipitationAmount: Int,
    val averageTemperature: Int,
) : WeatherStationStats(temperature, precipitationAmount)

class PrecipitationAmount(
    temperature: Int,
    precipitationAmount: Int,
    val averagePrecipitation: Int,
) : WeatherStationStats(temperature, precipitationAmount)

class WeatherServer(
    val printAverageTemperature: Int,
    val printAveragePrecipitation: Int,
) {
    fun printData(printAverageTemperature: Int, printAveragePrecipitation: Int) {
        println("Средняя температура составляет $printAverageTemperature градусов")
        println("Среднее количество осадкой составляет $printAverageTemperature мм")
    }
}

