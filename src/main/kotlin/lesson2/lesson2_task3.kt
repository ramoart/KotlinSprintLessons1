package lesson2

const val MINUTES_IN_HOUR = 60

fun main() {
    val trainStartMinutes = 563
    val trainRunMinutes = 457
    val trainArriveHours = (trainStartMinutes + trainRunMinutes) / MINUTES_IN_HOUR
    val trainArriveMinutes = (trainStartMinutes + trainRunMinutes) % MINUTES_IN_HOUR
    val formattedTimeArrive = "%02d:%02d".format(trainArriveHours, trainArriveMinutes)

    println("Внимание! Поезд прибывает в $formattedTimeArrive")
}