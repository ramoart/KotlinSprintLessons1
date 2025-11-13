package lesson19

fun main() {
    val starShip = StarShip()
    starShip.takeOff()
    starShip.landing()
}

class StarShip {
    fun takeOff() {
        println(
            "Требуемая реализация метода неизвестна. Напоминание о необходимости дополнительной информации" +
                    "по логике"
        )
    }

    fun landing() {
        TODO("Реализовать расчет приземление космического корабля позже")
    }

    fun shooting() {
    }
}