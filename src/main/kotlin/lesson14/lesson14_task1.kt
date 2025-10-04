package lesson14

fun main() {
    val linerShip = LinerShip()
    val cargoShip = CargoShip()
    val icebreakerShip = IcebreakerShip()
}

open class LinerShip(
    open val speed: Int = 100,
    open val carryingCapacity: Int = 100,
    open val folkCapacity: Int = 100,
) {

}

class CargoShip(
    override val speed: Int = 50,
    override val carryingCapacity: Int = 200,
    override val folkCapacity: Int = 100,
) : LinerShip(speed, carryingCapacity, folkCapacity) {

}

class IcebreakerShip(
    override val speed: Int = 100,
    override val carryingCapacity: Int = 100,
    override val folkCapacity: Int = 200,
    val isIceBreaking: Boolean = true
) : LinerShip(speed, carryingCapacity, folkCapacity) {
}