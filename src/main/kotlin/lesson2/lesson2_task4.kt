package lesson2

const val ONE_INT = 1

fun main() {
    val buffPercentInt = 20
    val crystallOre = 7
    val metallOre = 11

    val buffPercentToFloat = buffPercentInt.toFloat()
    val buffPercent = ONE_INT + buffPercentToFloat / 100
    val buffCrystallOre = (crystallOre * buffPercent) - crystallOre
    val buffMetallOre = (metallOre * buffPercent) - metallOre

    println("Количество забафнутой кристаллической руды - ${buffCrystallOre.toInt()}")
    println("Количество забафнутой железной руды - ${buffMetallOre.toInt()}")
}