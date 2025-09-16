package lesson10

fun main() {
    val resultOfUser = resultsOfThrow()
    val resultOfComputer = resultsOfThrow()
    println("Игрок бросил кость, выпавшее значение на кубике: $resultOfUser")
    println("Компьютер бросил кость, выпавшее значение на кубике: $resultOfComputer")
    when {
        resultOfUser > resultOfComputer -> println("Победило человечество")
        resultOfComputer > resultOfUser -> println("Победила машина")
        else -> println("Победила дружба")
    }

}

fun resultsOfThrow(): Int {
    val resultsOfThrow = (MIN_VALUE..MAX_VALUE).random()
    return resultsOfThrow
}

const val MIN_VALUE = 1
const val MAX_VALUE = 6