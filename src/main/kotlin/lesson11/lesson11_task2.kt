package lesson11

fun main() {
    val user1 = User2(
        id = 1,
        login = "ramoart",
        password = "MyPassword",
        email = "rmz.art@protonmail.kt",
    )

    user1.printUserData()
    println("Напишите информацию о пользователе")
    user1.writeBio()
    user1.changePassword()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {
    fun printUserData() {
        println("Найден пользователь $login с почтой email $email")
    }

    fun writeBio() {
        bio = readln()
    }

    fun changePassword() {
        println("Для изменения пароля введите старый пароль:")
        val inputPassword = readln()
        if (inputPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Новый пароль успешно сохранен")
        } else {
            println("Старый пароль неверен")
        }
    }
}