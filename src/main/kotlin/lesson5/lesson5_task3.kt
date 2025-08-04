package lesson5

fun main() {
    println("Добро пожаловать в лотерею Автостопом по галактике!")
    println("Отгадайте два целочисленных числа, вводя их по очереди и получите приз:")
    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()
    val userNumbers = setOf(numberOne, numberTwo)
    val winNumbers = setOf(ONE_WIN_NUMBER, TWO_WIN_NUMBER)
    when {
        userNumbers == winNumbers -> println("Поздравляем! Вы выиграли главный приз!")
        userNumbers.any { it in winNumbers } -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }
}

const val ONE_WIN_NUMBER = 42
const val TWO_WIN_NUMBER = 25