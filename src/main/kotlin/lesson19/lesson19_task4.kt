package lesson19

fun main() {
    val tank1 = Tank()
    tank1.shoot()
    tank1.arming(Ammunition.BLUE)
    tank1.shoot()

    tank1.arming(Ammunition.GREEN)
    tank1.shoot()

    tank1.arming(Ammunition.RED)
    tank1.shoot()
}

enum class Ammunition(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var currentAmmo: Ammunition? = null

    fun arming(ammunition: Ammunition) {
        currentAmmo = ammunition
        println("Танк заряжен патронами: $currentAmmo")
    }

    fun shoot() {
        if (currentAmmo == null) println("Танк пустой, зарядите патроны!")
        else println(
            "Танк выстрелил, нанесенный урон ${currentAmmo?.damage}, использованный тип" +
                    " патронов $currentAmmo"
        )
    }
}