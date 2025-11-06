package lesson18

fun main() {
    val dice1: Dice = EdgeFour()
    val dice2: Dice = EdgeSix()
    val dice3: Dice = EdgeEight()
    val diceList = listOf<Dice>(dice1, dice2, dice3)
    showAll(diceList)
}

fun showAll(dice: List<Dice>) {
    dice.forEach {
        it.rollDice()
    }
}

abstract class Dice(
) {
    abstract val countOfEdges: Int
    fun rollDice() {
        println("Бросили кубок с $countOfEdges гранями: результат ${(1..countOfEdges).random()}")
    }
}

class EdgeFour() : Dice() {
    override val countOfEdges: Int = 4
}

class EdgeSix() : Dice() {
    override val countOfEdges: Int = 6
}

class EdgeEight() : Dice() {
    override val countOfEdges: Int = 8
}