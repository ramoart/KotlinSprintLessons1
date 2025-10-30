package lesson17

fun main() {
    val user1 = User("ramoart", "qwerty123")
    user1.userPassword = "321ytrewq"
    println(user1.userPassword)
    user1.userLogin = "volandemort"
    println("Текущий логин ${user1.userLogin}")
}

class User(
    private val login: String,
    private val password: String,
) {
    var userLogin: String = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var userPassword: String = password
        get() {
            val stars = "*".repeat(field.length)
            return stars
        }
        set(value) {
            println("Вы не можете менять пароль")
        }
}