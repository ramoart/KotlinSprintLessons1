package lesson6

fun main() {
    println("Для регистрации в программе придумайте и введите логин:")
    val userLogin = readln()
    println("Придумайте и введите пароль:")
    val userPassword = readln()

    println("Для входа в программу введите логин:")
    val inputLogin = readln()
    println("Для входа в программу введите пароль:")
    val inputPassword = readln()
    var check = inputLogin == userLogin && userPassword == inputPassword

    when {
        check -> println("Авторизация прошла успешно")
        else -> while (check == false) {
            println("Логин и/или пароль были введены неверно, попробуйте снова. Введите логин:")
            val inputLogin = readln()
            println("Введите пароль:")
            val inputPassword = readln()
            if (inputLogin == userLogin && userPassword == inputPassword) {
                println("Авторизация прошла успешно")
                check = true
            }
        }
    }
}