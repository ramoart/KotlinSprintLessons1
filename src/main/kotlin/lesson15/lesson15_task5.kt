package lesson15

fun main() {
    val truck1 = Trucks(1, 2)
    val car1 = Cars(2)
    val car2 = Cars(3)
    truck1.loadCargo()
    truck1.loadPassengers()
    truck1.drive()
    truck1.unloadPassengers()
    truck1.unLoadCargo()

    println()

    car1.loadPassengers()
    car1.drive()
    car1.unloadPassengers()

    println()

    car2.loadPassengers()
    car2.drive()
    car2.unloadPassengers()
}

class Trucks(
    val amountPassengers: Int = 1,
    val amountCargo: Int = 2,
) : Drive, Cargo, Passengers

class Cars(
    val amountPassengers: Int = 3,
) : Drive, Passengers

interface Cargo {
    fun loadCargo() {
        println("Загрузить груз")
    }

    fun unLoadCargo() {
        println("Разгрузить груз")
    }
}

interface Passengers {
    fun loadPassengers() {
        println("Погрузка пассажиров")
    }

    fun unloadPassengers() {
        println("Разгрузка пассажиров")
    }
}

interface Drive {
    fun drive() {
        println("Транспорт начал перевозку")
    }
}

