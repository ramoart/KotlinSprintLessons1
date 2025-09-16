package lesson10

fun main() {
    println("Введите логин и пароль по очередно, не менее 4 символов: ")
    val inputLogin = readln()
    val inputPassword = readln()
    lengthCheckPass(inputLogin, inputPassword)
}

fun lengthCheckPass(inputLogin: String, inputPassword: String) {
    if (inputLogin.length < MIN_LENGTH || inputPassword.length < MIN_LENGTH) println("Логин или пароль недостаточно длинные")
    else println("Всё ок")
}

const val MIN_LENGTH = 4