package lesson18

fun main() {
    val dice1: Dice = EdgeFour(4)
    val dice2: Dice = EdgeSix(6)
    val dice3: Dice = EdgeEight(8)
    val gamesArray = listOf<Dice>(dice1, dice2, dice3)
    showAll(gamesArray)
}

fun showAll(dice: List<Dice>) {
    dice.forEach {
        it.rollDice()
    }
}

abstract class Dice(
    val countOfEdges: Int,
) {
    open fun rollDice() {
        println("Бросили кубок с $countOfEdges гранями: результат ${(1..countOfEdges).random()}")
    }
}

class EdgeFour(countOfEdges: Int) : Dice(countOfEdges) {
}

class EdgeSix(countOfEdges: Int) : Dice(countOfEdges) {
}

class EdgeEight(countOfEdges: Int) : Dice(countOfEdges) {
}