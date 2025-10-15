package lesson15

fun main() {
    val temperatureDay1 = Temperature(15, 60, 15)
    val precipitationDay1 = PrecipitationAmount(15, 60, 10)
    val serverWeather = WeatherServer()
    serverWeather.sendData(temperatureDay1)
    serverWeather.sendData(precipitationDay1)
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
) {
    fun sendData(data: WeatherStationStats) {
        when (data) {
            is Temperature -> {
                println("Средняя температура составляет ${data.averageTemperature} градусов")
            }

            is PrecipitationAmount -> {
                println("Средняя количество осадков составляет ${data.averagePrecipitation} мм")
            }
        }
    }
}

