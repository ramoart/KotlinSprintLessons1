package lesson16

fun main() {
    val user1 = UserData()
    println("Пароль ${user1.checkPassword("ffff")}")
    println("Пароль ${user1.checkPassword("qwerty123")}")
}

class UserData(
    private val userName: String = "ramoart",
    private val userPassword: String = "qwerty123"
) {
    fun checkPassword(inputPassword: String): Boolean {
        return inputPassword == userPassword
    }
}

