package lesson2

const val TO_FRACTION = 100

fun main() {
    val buffPercentDouble: Double = 20.0
    val buffPercent = buffPercentDouble / TO_FRACTION
    val crystallOre = 7
    val metallOre = 11

    val buffCrystallOre = crystallOre * buffPercent
    val buffMetallOre = metallOre * buffPercent

    println("Количество забафнутой кристаллической руды - ${buffCrystallOre.toInt()}")
    println("Количество забафнутой железной руды - ${buffMetallOre.toInt()}")
}