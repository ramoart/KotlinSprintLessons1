package lesson10

fun main() {
    println("Введите логин и пароль пользователя:")
    val userLogin = readln()
    val userPassword = readln()
    val token = checkUser(userLogin, userPassword)
    generateBasket(token)

}

fun checkUser(userLogin: String, userPassword: String) : String? {
    val userLogin = userLogin
    val userPassword = userPassword
    val token = if (userLogin == LOGIN && userPassword == PASSWORD) "G7aZ1kLm9TqP0yXcW8sD4hUvE2rJ5nBb"
                else null
    return token
}

fun generateBasket(token: String?) {
    val token = token
    if (token == VALID_TOKEN) println("В вашей корзине находится следующий товар: Приставка Panasonic GoldStar 3DO") else println("Авторизация неудачна")
}

const val LOGIN = "ramoart"
const val PASSWORD = "MyPassword"
const val VALID_TOKEN = "G7aZ1kLm9TqP0yXcW8sD4hUvE2rJ5nBb"