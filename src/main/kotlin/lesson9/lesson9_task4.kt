package lesson9

fun main() {
    println("Введите 5 ингредиентов, перечислив их через запятую:")
    val burgerSorted = readln().split(", ").sorted()

    println("Отсортированный список ингредиентов: $burgerSorted")
}