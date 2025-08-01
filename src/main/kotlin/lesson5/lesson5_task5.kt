package lesson5

import java.awt.List
import kotlin.random.Random

fun main() {
    val randomNumberList = List(3) { Random.nextInt(0, 3) }
    println("Добро пожаловать в лотерею Автостопом по галактике!")
    println("Отгадайте три целочисленных числа, вводя их по очереди и получите приз:")
    val inputNumberList = List(3) {
        readln().toInt()
    }
    val intersection = randomNumberList.intersect(inputNumberList)

    when {
        intersection.size == 3 -> println("Вы выиграли джекпот!")
        intersection.size == 2 -> println("Вы выиграли крупный приз!")
        intersection.size == 1 -> println("Вы выиграли утешительный приз!")
        intersection.size == 0 -> println("Вы не угадали ни одного числа")
    }
    println("Выигрышные числа: $intersection")
}
