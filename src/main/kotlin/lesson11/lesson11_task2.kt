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