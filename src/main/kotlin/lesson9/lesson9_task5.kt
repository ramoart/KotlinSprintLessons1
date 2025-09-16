package lesson9

fun main() {
    val burgerList = mutableListOf<String>()
    println("Введите названия пяти ингредиентов:")
    repeat(COUNT_OF_PIECES) {
        burgerList.add(readln())
    }

    val sortedBurgerList = burgerList.toSortedSet().toMutableList()
    sortedBurgerList[0] = sortedBurgerList[0].replaceFirstChar { it.uppercase() }

    println("Ингредиенты блюда: ${sortedBurgerList.joinToString(", ")}")
}

const val COUNT_OF_PIECES = 5