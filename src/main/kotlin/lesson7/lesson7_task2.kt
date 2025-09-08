package lesson7

fun main() {
    var randomNumber: Int
    var inputNumber: Int

    do {
        randomNumber = (1000..9999).random()
        println("Ваш код авторизации: $randomNumber")
        println("Введите код авторизации:")
        inputNumber = readln().toInt()
        if (inputNumber != randomNumber) println("Код введен неверно!")
    } while (inputNumber != randomNumber)

    println("Добро пожаловать, код авторизации введен верно.")
}