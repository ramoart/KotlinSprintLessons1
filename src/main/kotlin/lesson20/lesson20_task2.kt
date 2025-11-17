package lesson20

fun main() {
    val player1 = Player("volandemort", 42)
    val healing: (Player) -> Unit = { player: Player ->
        player.currentHealth = player.maxHealth
        println("Здоровье игрока вылечено до ${player.currentHealth}")
    }
    healing(player1)
}

class Player(
    val playerName: String,
    var currentHealth: Int,
    val maxHealth: Int = 100,
)