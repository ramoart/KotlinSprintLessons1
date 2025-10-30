package lesson17

fun main() {
    val packageCargo = PackageCargo()
    packageCargo.location = "Санкт-Петербург"
    println("Новая локация: ${packageCargo.location}")
    println("Счетчик перемещений: ${packageCargo.countCargo}")
}

class PackageCargo(
    val packageNumber: Int = 15,
    initialLocation: String = "остров Котлин",
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