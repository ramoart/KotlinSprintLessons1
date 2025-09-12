package lesson9

fun main() {
    println("Введите 5 ингредиентов, перечислив их через запятую:")
    val inputItems = readln()
    val burgerList = inputItems.split(", ").toMutableList()
    val burgerSorted = burgerList.sorted()

    println("Отсортированный список ингредиентов: $burgerSorted")
}