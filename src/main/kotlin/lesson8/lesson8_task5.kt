package lesson8

fun main() {
    println("Mr.Plankton, введите количество ингредиентов, из которых будет составлен КрастиБургер:")
    val inputPieces = readln().toInt()
    val krustyKrabsBurgerArray = Array(inputPieces) { "" }

    for (i in krustyKrabsBurgerArray.indices) {
        println("Введите №${i + 1} ингредиента, по очереди")
        krustyKrabsBurgerArray[i] = readln()
    }

    println("Рецепт вашего КрастиБургера готов: ${krustyKrabsBurgerArray.joinToString(", ")}")
}