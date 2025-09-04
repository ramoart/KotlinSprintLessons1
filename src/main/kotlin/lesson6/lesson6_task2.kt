package lesson6

import java.lang.Thread.sleep
import kotlin.concurrent.thread

fun main() {
    println("Введите количество секунд, на которое необходимо установить таймер:")
    val inputSeconds = readln().toInt()
    val secondsLong = (inputSeconds * RATIO_TO_MILLIS).toLong()
    Thread.sleep(secondsLong)
    println("Прошло $inputSeconds секунд")
}

const val RATIO_TO_MILLIS = 1000