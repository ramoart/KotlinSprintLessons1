package lesson7

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    var inputTimer = readln().toInt()
    for (i in inputTimer downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}