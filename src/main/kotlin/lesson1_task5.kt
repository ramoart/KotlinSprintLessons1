package org.example

fun main() {
    val secondsAll: Int = 6480
    val hours: Int = secondsAll / 3600
    val minutes: Int = (secondsAll - 3600) / 60
    val secondsRest: Int = secondsAll - 3600 - 2880
    val formattedTime: String = String.format("%02d:%02d:%02d", hours, minutes, secondsRest)
    println("Время в космосе - $formattedTime")
}