package lesson6

import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.exitProcess

fun main() {
    var attempts = ATTEMPTS
    var numberOne = Random.nextInt(1..9)
    var numberTwo = Random.nextInt(1..9)

    println("Для входа в систему необходимо доказать, что Вы не бот")
    println("Для этого последовательно решите простой математический пример.")
    println("Cколько будет $numberOne + $numberTwo=")
    var inputAnswer = readln().toInt()

    while (attempts > 0) {
        if (inputAnswer == numberOne + numberTwo) {
            println("Добро пожаловать!")
            exitProcess(0)
        } else {
            println("Введенный ответ неверный! Осталось ${attempts--} попыток")
            numberOne = Random.nextInt(1..9)
            numberTwo = Random.nextInt(1..9)
            println("Cколько будет $numberOne + $numberTwo=")
            inputAnswer = readln().toInt()
        }

    }
}

const val ATTEMPTS = 3
