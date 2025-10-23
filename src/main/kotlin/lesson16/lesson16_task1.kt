package lesson16

fun main() {
    val cube1 = Cube()
    cube1.printNumber()
}

class Cube {
   private val numberRandom: Int = (1..6).random()
    fun printNumber() {
        println("Выпавшее число $numberRandom")
    }
}