package lesson9

fun main() {
    val burgerList = mutableListOf<String>()
    println("Введите названия пяти ингредиентов:")
    repeat(COUNT_OF_PIECES) {
         burgerList.add(readln())
    }

    burgerList.sort()
    burgerList[0] = burgerList[0].replaceFirstChar { it.uppercase() }
    val burgerSet = java.util.TreeSet(burgerList)
    println("Ингредиенты блюда: ${burgerSet.joinToString(", ")}")
}

const val COUNT_OF_PIECES = 5