package lesson2

const val MINUTES_IN_HOUR = 60

fun main() {
    val trainStart = "09:39"
    val parts = trainStart.split(":")
    val trainStartHour = parts[0].toInt()
    val trainStartMinutes = parts[1].toInt()
    val trainRunMinutes = 457

    val totalTrainStartMinutes = trainStartHour * MINUTES_IN_HOUR + trainStartMinutes
    val trainArriveHours = (totalTrainStartMinutes + trainRunMinutes) / MINUTES_IN_HOUR
    val trainArriveMinutes = (totalTrainStartMinutes + trainRunMinutes) % MINUTES_IN_HOUR
    val formattedTimeArrive = "%02d:%02d".format(trainArriveHours, trainArriveMinutes)

    println("Внимание! Поезд прибывает в $formattedTimeArrive")
}