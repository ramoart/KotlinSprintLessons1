package lesson8

fun main() {
    var viewsOfDay: Int
    val countArray = Array(DAYS_IN_WEEK) { 0 }

    for (i in 0..COEFFICIENT) {
        viewsOfDay = (0..99).random()
        countArray[i] = viewsOfDay
    }
    countArray[1]
    println("Количество просмотров за неделю: ${countArray.sum()}")
}

const val DAYS_IN_WEEK = 7
const val COEFFICIENT = 6