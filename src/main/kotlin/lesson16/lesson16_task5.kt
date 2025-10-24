package lesson16

import kotlin.system.exitProcess

fun main() {
    val player1 = Player()
    player1.damage()
    player1.healing()
    player1.damage()
    player1.healing()
    player1.damage()
    player1.healing()
}

class Player(
    val name: String = "volandemort",
    private var health: Int = 100,
    var force: Int = 100,
) {
    fun damage() {
        if (health <= 0) {
            death()
            return
        }

        val damage = (50..80).random()
        health = health - damage

        if (health <= 0) death()
    }

    fun healing() {
        if (health <= 0) {
            death()
            return
        }

        val healing = (0..20).random()
        health = health + healing
    }

    private fun death() {
        health = 0
        force = 0
        println("Игрок погиб")
        exitProcess(0)
    }
}