package lesson11

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