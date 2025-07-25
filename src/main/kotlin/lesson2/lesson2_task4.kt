package lesson2

const val baff = 1.2f

fun main() {
    val crystallOre = 7
    val metallOre = 11
    val baffCrystallOre = (crystallOre * baff) - crystallOre
    val baffMetallOre = (metallOre * baff) - metallOre

    println("Количество забафнутой кристаллической руды - ${baffCrystallOre.toInt()}")
    println("Количество забафнутой железной руды - ${baffMetallOre.toInt()}")
}