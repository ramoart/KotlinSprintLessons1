package lesson20

fun main() {
    val player1 = PlayerKey(true)
    val player2 = PlayerKey(false)
    val openDoor: (PlayerKey) -> String = { playerKey ->
        if (playerKey.isHaveKey) "Игрок открыл дверь"
        else "Дверь заперта"
    }
    println(openDoor(player1))
    println(openDoor(player2))
}

class PlayerKey(
    val isHaveKey: Boolean = false,
)