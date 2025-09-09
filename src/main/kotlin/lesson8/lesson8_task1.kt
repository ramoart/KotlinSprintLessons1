package lesson8

fun main() {
    val countArray = Array(DAYS_IN_WEEK) { 0 }

    for (i in 0..COEFFICIENT) {
        countArray[i] = (0..99).random()
    }
    println("Количество просмотров за неделю: ${countArray.sum()}")
}

const val DAYS_IN_WEEK = 7
const val COEFFICIENT = 6