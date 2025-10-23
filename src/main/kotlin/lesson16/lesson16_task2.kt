package lesson16

import kotlin.math.pow

fun main() {
    val circle1 = Circle(5.15)
    circle1.circumferenceCalculate()
    circle1.areaCalculate()
}

class Circle(
    private val radius: Double,
) {
    fun circumferenceCalculate() {
        println("Длина окружности круга = ${PI * COEFFICIENT * radius}")
    }

    fun areaCalculate() {
        println("Площадь круга = ${PI * radius.pow(2)}")
    }
}

private const val PI = 3.14
private const val COEFFICIENT = 2