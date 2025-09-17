fun main() {
    var counterOfWin = 0
    var inputAnswer: String

    do {
        val resultOfUser = throwDice()
        val resultOfComputer = throwDice()
        counterOfWin = startRound(resultOfUser, resultOfComputer, counterOfWin)

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        inputAnswer = readln()
    } while (inputAnswer.equals("Да", ignoreCase = true))

    println("Количество побед: $counterOfWin")
}

fun throwDice() = (MIN_VALUE..MAX_VALUE).random()

fun startRound(resultOfUser: Int, resultOfComputer: Int, counterOfWin: Int): Int {
    var counter = counterOfWin
    println("Игрок бросил кость: $resultOfUser")
    println("Компьютер бросил кость: $resultOfComputer")

    when {
        resultOfUser > resultOfComputer -> {
            println("Победило человечество")
            counter++
        }

        resultOfComputer > resultOfUser -> println("Победила машина")
        else -> println("Победила дружба")
    }

    return counter
}

const val MIN_VALUE = 1
const val MAX_VALUE = 6
