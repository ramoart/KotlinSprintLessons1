package lesson7

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("Добро пожаловать в генератор паролей!")
    val rangeChar = 'a'..'z'
    val rangeInt = 0..9
    val random = Random.nextInt(1, 4)

    var randomChar = mutableListOf<Char>()
    var randomInt = mutableListOf<Int>()

    for (symbol in rangeChar step random) {
        randomChar.add(symbol)
    }

    for (i in rangeInt step random) {
        randomInt.add(i)
    }

    println("Ваш пароль: ${randomChar[1]}${randomInt[1]}${randomChar[2]}${randomInt[2]}${randomChar[3]}${randomInt[3]}")
}