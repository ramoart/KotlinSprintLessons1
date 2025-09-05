package lesson6

fun main() {
    println("Для регистрации в программе придумайте и введите логин:")
    val userLogin = readln()
    println("Придумайте и введите пароль:")
    val userPassword = readln()
    var check: Boolean

    do {
        println("Для входа в систему введите логин:")
        val inputLogin = readln()
        println("Для входа в систему введите пароль:")
        val inputPassword = readln()
        check = inputLogin == userLogin && inputPassword == userPassword

        if (check == false) println("Логин и/или пароль были введены неверно, попробуйте снова.")
    } while (check == false)

    println("Авторизация прошла успешно")
}