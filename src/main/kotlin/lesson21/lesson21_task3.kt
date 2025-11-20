package lesson21

fun main() {
    val player1 = Player("ramoart", 100)
    val player2 = Player("volandemort", 42)
    println("Здоровье игрока ${player1.playerName} максимальное? ${player1.isHealthy()}")
    println("Здоровье игрока ${player2.playerName} максимальное? ${player2.isHealthy()}")
}

class Player(
    val playerName: String,
    var currentHealth: Int,
    val maxHealth: Int = 100,
)

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}