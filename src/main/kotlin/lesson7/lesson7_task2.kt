package lesson7

import kotlin.random.Random

fun main() {
    var randomNumber = Random.nextInt(1000, 9999)
    println("Ваш код авторизации: $randomNumber")
    println("Введит код авторизации:")
    var inputNumber = readln().toInt()

    do {
        if (inputNumber != randomNumber) {
            println("Код введен неверно!")
            randomNumber = Random.nextInt(1000, 9999)
            println("Ваш код авторизации: $randomNumber")
            println("Введит код авторизации:")
            inputNumber = readln().toInt()
        }
        if (inputNumber == randomNumber) println("Добро пожаловать, код авторизации введен верно.")
    } while (inputNumber != randomNumber)
}