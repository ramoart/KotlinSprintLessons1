package lesson15

fun main() {
    val fish1 = Crucian("Карась")
    fish1.printName()
    fish1.swimmingDown()
    fish1.swimmingForward()

    println()

    val duck1 = Duck("Дональд Дак")
    duck1.printName()
    duck1.swimmingDown()
    duck1.swimmingForward()
    duck1.flying()

    println()

    val gull1 = Gull("Чайка")
    gull1.printName()
    gull1.flying()
}

interface Swimming {
    fun swimmingDown() {
        println("Нырнуло вглубь")
    }

    fun swimmingForward() {
        println("Плывет вперед")
    }

}

interface Flying {
    fun flying() {
        println("Взлетел в небо")
    }
}

class Crucian(val name: String) : Swimming {
    fun printName() {
        println(name)
    }
}

class Duck(val name: String) : Swimming, Flying {
    fun printName() {
        println(name)
    }
}

class Gull(val name: String) : Flying {
    fun printName() {
        println(name)
    }
}