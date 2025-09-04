package lesson6

import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.exitProcess

fun main() {
    println("Добро пожаловать в Угадайку!")
    println("Было загадано число от 1 до 9, у Вас есть 5 попыток, чтобы отгадать:")
    var inputNumber = readln().toInt()
    val randomNumber = Random.nextInt(1..9)
    var countOfAttempts = COUNT_OF_ATTEMPTS
    if (inputNumber == randomNumber) {
        println("Это была великолепная игра!")
        println("Было задано число $randomNumber")
    }

    while (inputNumber != randomNumber) {
        if (inputNumber != randomNumber) {
            println("Неверно, попробуйте еще раз")
            println("Количество попыток = ${--countOfAttempts}")
            inputNumber = readln().toInt()
        }
        if (inputNumber == randomNumber) {
            println("Это была великолепная игра!")
            println("Было задано число $randomNumber")
        }
        if (countOfAttempts == 0) {
            println("Вы проиграли!")
            exitProcess(0)
        }
    }
}

const val COUNT_OF_ATTEMPTS = 5