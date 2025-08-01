package lesson5

fun main() {
    println("Для входа в систему, сложите два целочисленных числа, поочередно вводя данные и затем напишите результат сложениw")
    val inputDataA = readln().toInt()
    val inputDataB = readln().toInt()
    val inputDataC = readln().toInt()
    val outputData = if (inputDataC == inputDataA + inputDataB) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }

    println(outputData)
}