package lesson5

fun main() {
    println("DeepThoughtCAPTCHA: введите целочисленный результат сложения двух чисел 24 + 18 =")
    val inputData = readln().toInt()
    val outputData = if (inputData == 42) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }

    println(outputData)
}