package lesson17

fun main() {
    val ship1 = Ship()
    ship1.name = "fdfd"
}

class Ship() {
    var name: String = "Avrora"
        get() = field
        set(value) {
            println("Нельзя перезаписывать значение")
        }
    val averageSpeed = 42
    val port = "Saint-Petersbourg"
}