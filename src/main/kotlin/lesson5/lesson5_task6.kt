package lesson5

import java.lang.Math.pow
import kotlin.math.pow

fun main() {
    println("Для расчета вашего ИМТ введите по очередно ваш вес (кг) и рост (см):")
    val weightUser = readln().toDouble()
    val heightUser = readln().toDouble()
    val imtCalc = weightUser / (heightUser / IN_METERS).pow(2)
    val formattedImt = "%.2f".format(imtCalc)
    when {
        imtCalc < LOW_IMT -> println("Недостаточная масса тела, ваш ИМТ: $formattedImt")
        imtCalc in LOW_IMT..NORMAL_IMT -> println("Нормальная масса тела, ваш ИМТ: $formattedImt")
        imtCalc in NORMAL_IMT..HIGH_IMT -> println("Избыточная масса тела, ваш ИМТ: $formattedImt")
        imtCalc > HIGH_IMT -> println("Ожирение, ваш ИМТ: $formattedImt")
    }

}

const val IN_METERS = 100
const val LOW_IMT = 18.5
const val NORMAL_IMT: Double = 25.0
const val HIGH_IMT: Double = 30.0