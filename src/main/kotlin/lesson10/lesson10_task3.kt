package lesson10

fun main() {
    println("Задайте длину пароля для генерации:")
    val inputLengthPassword = readln().toInt()
    val password = generatePassword(inputLengthPassword)
    println("Ваш пароль: $password")
}

fun generatePassword(inputLengthPassword: Int): String {
    val numbers = '0'..'9'
    val symbols = ' '..'/'
    val passwordList = mutableListOf<Char>()

    for (i in 0 until inputLengthPassword) {
        val char = if (i % TO_EVEN_NUMBER == REMAINDER_NUMBER) numbers.random() else symbols.random()
        passwordList.add(char)
    }
    val password = passwordList.joinToString("")
    return password
}

const val TO_EVEN_NUMBER = 2
const val REMAINDER_NUMBER = 0

