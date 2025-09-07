package lesson7

import kotlin.random.Random


fun main() {
    println("Добро пожаловать в генератор паролей!")
    val rangeChar = 'a'..'z'
    val rangeInt = 0..9

    val randomChar = mutableListOf<Char>()
    val randomInt = mutableListOf<Int>()

    repeat(3) {
        randomChar.add(rangeChar.random())
        randomInt.add(rangeInt.random())
    }
    println("Ваш пароль: ${randomChar[0]}${randomInt[0]}${randomChar[1]}${randomInt[1]}${randomChar[2]}${randomInt[2]}")
}