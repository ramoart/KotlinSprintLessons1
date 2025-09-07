package lesson7

import kotlin.random.Random

fun main() {
    do {
        val randomNumber = Random.nextInt(1000, 9999)
        println("Ваш код авторизации: $randomNumber")
        println("Введите код авторизации:")
        val inputNumber = readln().toInt()

        if (inputNumber != randomNumber) println("Код введен неверно!")

    } while (inputNumber != randomNumber)

    println("Добро пожаловать, код авторизации введен верно.")
}