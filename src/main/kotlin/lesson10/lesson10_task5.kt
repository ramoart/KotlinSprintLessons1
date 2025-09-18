package lesson10

fun main() {
    println("Введите логин и пароль пользователя:")
    val userLogin = readln()
    val userPassword = readln()
    val token = checkUser(userLogin, userPassword)

    if (token != null) {
        val basket = generateBasket(token)
        println("Содержимое корзины: $basket")
    } else println("Авторизация не пройдена")
}

fun checkUser(userLogin: String, userPassword: String): String? {
    val token = if (userLogin == LOGIN && userPassword == PASSWORD) {
        generationToken(userLogin, userPassword)
    } else null
    return token
}

fun generationToken(userLogin: String, userPassword: String): String {
    val source = "$userLogin:$userPassword"
    val base = source.hashCode().toUInt().toString(16)
    return base.padEnd(32, '0').take(32)
}

fun generateBasket(token: String): String {
    return "Приставка Panasonic GoldStar 3DO"
}

const val LOGIN = "ramoart"
const val PASSWORD = "MyPassword"
