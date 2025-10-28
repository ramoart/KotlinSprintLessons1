package lesson17

fun main() {
    val packageCargo1 = PackageCargo()
    packageCargo1.location = "Санкт-Петербург"
    println("Новая локация: ${packageCargo1.location}")
    println("Счетчик перемещений: ${packageCargo1.countCargo}")
}

class PackageCargo(
    val packageNumber: Int = 15,
    val initialLocation: String = "остров Котлин",
) {
    var countCargo: Int = 0
        private set
    var location: String = initialLocation
        set(value) {
            if (value != field) {
                field = value
                countCargo++
            }
        }
}