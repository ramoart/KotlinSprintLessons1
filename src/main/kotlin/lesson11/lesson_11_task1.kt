package lesson11

fun main() {
    val user1 = UserData(
        id = 1,
        login = "ramoart",
        password = "MyPassword",
        email = "rmz.art@protonmail.kt",
    )

    val user2 = UserData(
        id = 2,
        login = "ubuntu",
        password = "MyUbuntu",
        email = "linux@forever.com",
    )

    println(
        "Пользователь ${user1.login} c id=${user1.id} " +
                "найден с почтой ${user1.email} и его пароль ${user1.password}"
    )
    println(
        "Пользователь ${user2.login} c id=${user2.id} " +
                "найден с почтой ${user2.email} и его пароль ${user2.password}"
    )
}