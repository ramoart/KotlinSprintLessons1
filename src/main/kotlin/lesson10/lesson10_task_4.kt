package lesson10

fun main() {
    var resultOfUser = resultsOfThrow()
    var resultOfComputer = resultsOfThrow()
    var counterOfWin = 0

    counterOfWin = round(resultOfUser, resultOfComputer, counterOfWin)
    var inputAnswer: String
    do {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        inputAnswer = readln()
        if (inputAnswer.equals("Да", ignoreCase = true)) {
            resultOfUser = resultsOfThrow()
            resultOfComputer = resultsOfThrow()
            counterOfWin = round(resultOfUser, resultOfComputer, counterOfWin)
        } else {
            println("Количество побед $counterOfWin")
        }
    } while (inputAnswer.equals("Да", ignoreCase = true))

}

fun resultsOfThrow(): Int {
    val resultsOfThrow = (MIN_VALUE..MAX_VALUE).random()
    return resultsOfThrow
}

fun round(resultOfUser: Int, resultOfComputer: Int, counterOfWin: Int): Int {
    var counter = counterOfWin
    println("Игрок бросил кость, выпавшее значение на кубике: $resultOfUser")
    println("Компьютер бросил кость, выпавшее значение на кубике: $resultOfComputer")
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