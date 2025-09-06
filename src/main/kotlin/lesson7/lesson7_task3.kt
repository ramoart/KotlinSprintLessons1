package lesson7

fun main() {
    println("Введите число, до которого необходимо вывести все четные числа:")
    val inputNumber = readln().toInt()

    for (i in 0..inputNumber step 2) {
        println(i)
    }
}