package lesson2

import kotlin.math.pow

fun main() {
    val years = 20
    val moneyPut = 70000
    val percentRate = 0.167f

    val summaryMoney = moneyPut * (1 + percentRate).pow(years)
    val formattedSummaryMoney = "%.3f".format(summaryMoney)

    println("Ваш размер вклада через $years лет составит: $formattedSummaryMoney")
}
