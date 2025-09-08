package lesson7

fun main() {
    println("Добро пожаловать в генератор паролей!")
    val rangeChar = 'a'..'z'
    val rangeInt = 0..9
    var password = ""

    repeat(3) {
        password += rangeChar.random() + rangeInt.random().toString()
    }
    println("Ваш пароль: $password")
}