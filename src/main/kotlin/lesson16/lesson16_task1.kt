package lesson16

fun main() {
    val cube1 = Cube()
    cube1.printNumber()
}

private class Cube {
    val numberRandom: Int = (1..6).random()
    fun printNumber() {
        println("Выпавшее число $numberRandom")
    }
}