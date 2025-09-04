package lesson6

import java.lang.Thread.sleep
import kotlin.concurrent.thread

fun main() {
    println("Введите количество секунд, на которое необходимо установить таймер:")
    val inputSeconds = readln().toInt()
    var timeCounter = inputSeconds

    while (timeCounter > 0) {
        println("Осталось секунд: ${timeCounter--}")
        Thread.sleep(1000)
        if (timeCounter == 0) println("Время вышло")
    }
}