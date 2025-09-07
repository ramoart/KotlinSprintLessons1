package lesson7

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    val seconds = readln().toInt()
    for (i in seconds downTo 0) {
        Thread.sleep(DELAY_MS)
        println("Осталось $i секунд")
    }
    println("Время вышло")
}

const val DELAY_MS: Long = 1000