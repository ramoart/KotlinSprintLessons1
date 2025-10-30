package lesson18

fun main() {
    val game1: Game = EdgeFour()
    val game2: Game = EdgeSix()
    val game3: Game = EdgeEight()
    val gamesArray = listOf<Game>(game1, game2, game3)
    showAll(gamesArray)
}

fun showAll(games: List<Game>) {
    games.forEach {
        it.rollDice()
    }
}

open class Game {
    open fun rollDice() {
    }
}

class EdgeFour : Game() {
    override fun rollDice() {
        println("Бросили кубок с 4 гранями: результат ${(1..4).random()}")
    }
}

class EdgeSix : Game() {
    override fun rollDice() {
        println("Бросили кубок с 6 гранями: результат ${(1..6).random()}")
    }
}

class EdgeEight : Game() {
    override fun rollDice() {
        println("Бросили кубок с 8 гранями: результат ${(1..8).random()}")
    }
}