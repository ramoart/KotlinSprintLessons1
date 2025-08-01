package lesson5

fun main() {
    println("Добро пожаловать в калькулятор стоимости топлива")
    println(
        "Введите по очередно: расстояние поездки (в км);" +
                " расход топлива на 100 км (в литрах);" +
                " текущую цену за литр топлива (в рублях)."
    )
    val lengthTrip = readln().toDouble()
    val consumptionFuel = readln().toDouble()
    val costFuel = readln().toDouble()
    val volumeFuel = (lengthTrip * consumptionFuel) / COEFFICIENT
    val costForTrip = volumeFuel * costFuel
    val formattedVolumeFuel = "%.2f".format(volumeFuel)
    val formattedVCostForTrip = "%.2f".format(costForTrip)
    println("Общее количество необходимого топлива: $formattedVolumeFuel")
    println("Итоговая стоимость поездки: $formattedVCostForTrip")
}

const val COEFFICIENT = 100