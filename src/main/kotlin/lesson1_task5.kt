package org.example

const val SECONDS_IN_HOUR: Int = 3600
const val SECONDS_IN_MINUTE: Int = 60

fun main() {
    val secondsAll: Int = 6480
    val hours: Int = secondsAll / SECONDS_IN_HOUR
    val minutes: Int = (secondsAll % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val secondsRest: Int = secondsAll % SECONDS_IN_MINUTE
    val formattedTime: String = "%02d:%02d:%02d".format(hours, minutes, secondsRest)
    println("Время в космосе - $formattedTime")
}