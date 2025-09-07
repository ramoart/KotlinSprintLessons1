package lesson7

fun main() {
    val rangeChar = 'a'..'z'
    val rangeCharCapital = 'A'..'Z'
    val rangeNumbers = '0'..'9'
    var inputNumber: Int
    val passwordList = mutableListOf<Char>()

    do {
        println("Добро пожаловать в генератор паролей!")
        println("Введите необходимую длину пароля (от $MINIMUM_VALUE символов):")
        inputNumber = readln().toInt()

    } while (inputNumber < MINIMUM_VALUE)

    repeat(inputNumber) {
        passwordList.add(rangeChar.random())
        passwordList.add(rangeCharCapital.random())
        passwordList.add(rangeNumbers.random())
    }

    passwordList.shuffle()
    val password = passwordList.take(inputNumber).joinToString("")

    println("Ваш пароль $password")
}

const val MINIMUM_VALUE = 6