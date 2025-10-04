package lesson14

fun main() {
    val linerShip = LinerShip2()
    val cargoShip = CargoShip2()
    val icebreakerShip = IcebreakerShip2()

    linerShip.PrintData()
    cargoShip.PrintData()
    icebreakerShip.PrintData()
}

open class LinerShip2(
    open val speed: Int = 100,
    open val carryingCapacity: Int = 100,
    open val folkCapacity: Int = 100,
) {
    open fun PrintData() {
        println(
            "Корабль имеет следующие свойства:" +
                    "скорость $speed, " +
                    "грузоподьемноть $carryingCapacity, " +
                    "вместимость $folkCapacity"
        )
    }

    open fun linerLoading() {
        println("Лайнер выдвинул горизонтальный трап со шкафута")
    }
}

class CargoShip2(
    override val speed: Int = 50,
    override val carryingCapacity: Int = 200,
    override val folkCapacity: Int = 100,
) : LinerShip2(speed, carryingCapacity, folkCapacity) {

    fun cargoLoading() {
        println("Грузовой корабль активировал погрузочный кран")
    }
}

class IcebreakerShip2(
    override val speed: Int = 100,
    override val carryingCapacity: Int = 100,
    override val folkCapacity: Int = 200,
    val isIceBreaking: Boolean = true
) : LinerShip2(speed, carryingCapacity, folkCapacity) {
    override fun PrintData() {
        println(
            "Корабль имеет следующие свойства:" +
                    "скорость $speed, " +
                    "грузоподьемноть $carryingCapacity, " +
                    "вместимость $folkCapacity, " +
                    "корабль имеет свойтва ледокола - $isIceBreaking"
        )
    }

    fun icebreakerLoading() {
        println("Ледокол открыл ворота со стороны кормы")
    }
}