package lesson5

fun main() {
    println("Добро пожаловать в лотерею Автостопом по галактике!")
    println("Отгадайте два целочисленных числа, вводя их по очереди и получите приз:")
    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()

    when {
        numberOne == ONE_WIN_NUMBER && numberTwo == TWO_WIN_NUMBER -> println("Поздравляем! Вы выиграли главный приз!")
        numberTwo == ONE_WIN_NUMBER && numberOne == TWO_WIN_NUMBER -> println("Поздравляем! Вы выиграли главный приз!")
        numberOne == ONE_WIN_NUMBER || numberTwo == TWO_WIN_NUMBER -> println("Вы выиграли утешительный приз!")
        numberTwo == ONE_WIN_NUMBER || numberOne == TWO_WIN_NUMBER -> println("Вы выиграли утешительный приз!")
        numberOne != ONE_WIN_NUMBER && numberTwo != TWO_WIN_NUMBER -> println("Неудача!")
        numberTwo != ONE_WIN_NUMBER && numberOne != TWO_WIN_NUMBER -> println("Неудача!")
    }
}

const val ONE_WIN_NUMBER = 42
const val TWO_WIN_NUMBER = 25