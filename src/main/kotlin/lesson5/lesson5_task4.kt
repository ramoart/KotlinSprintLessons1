package lesson5

fun main() {
    println(
        "Робот-андроид Марвин отошел в сторону, пропуская вас к терминалу. Вы земетили табличку," +
                " на которой было написано: Введите свой логин"
    )
    val currentUserLogin = readln()
    var currentUserPassword: String
    when {
        currentUserLogin == USER_NAME -> {
            println("Такой логин существует, введите пароль:")
            currentUserPassword = readln()
            if (currentUserPassword == PASSWORD) println("Mr.$currentUserPassword, вы успешны зашли в систему")
            else println("Пароль неверный, завершение программы")
        }

        currentUserLogin != USER_NAME -> {
            println("Пользователь $currentUserLogin не найден, введи пароль для регистрации")
            currentUserPassword = readln()
            println("Регистрация прошла успешно, завершение программы")
        }

    }
}

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"