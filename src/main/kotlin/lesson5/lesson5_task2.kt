package lesson5

fun main() {
    println("Введите год своего рождения, например, 1983:")
    val yearBirth = readln().toInt()
    val outputData = if ((CURRENT_YEAR - yearBirth) >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Доступ запрещен"
    }
    println(outputData)
}

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025