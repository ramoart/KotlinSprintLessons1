package org.example
const val secondsInHour: Int = 3600
const val secondsInMinute: Int = 60

fun main() {
    val secondsAll: Int = 6480
    val hours: Int = secondsAll / secondsInHour
    val minutes: Int = (secondsAll - secondsInHour) / secondsInMinute
    val secondsRest: Int = secondsAll - secondsInHour - minutes*secondsInMinute
    val formattedTime: String = "%02d:%02d:%02d".format(hours, minutes, secondsRest)
    println("Время в космосе - $formattedTime")
}