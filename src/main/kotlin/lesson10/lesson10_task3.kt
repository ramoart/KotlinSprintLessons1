package lesson10

fun main() {
    println("Задайте длину пароля для генерации:")
    val inputLengthPassword = readln().toInt()
    generatePassword(inputLengthPassword)
}

fun generatePassword(inputLengthPassword: Int) {
    val numbers = '0'..'9'
    val symbols = "!\"#\$%&'()*+,-./ "
    val specialCharArray = symbols.toCharArray()
    val passwordList = mutableListOf<Char>()

    for (i in 0 until inputLengthPassword) {
        val char = if (i % TO_EVEN_NUMBER == REMAINDER_NUMBER) numbers.random() else specialCharArray.random()
        passwordList.add(char)
    }

    println("Ваш пароль: ${passwordList.joinToString("")}")
}

const val TO_EVEN_NUMBER = 2
const val REMAINDER_NUMBER = 0

