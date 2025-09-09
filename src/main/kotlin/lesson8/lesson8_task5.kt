package lesson8

fun main() {
    println("Mr.Plankton, введите количество ингредиентов, из которых будет составлен КрастиБургер:")
    var inputPieces = readln().toInt()
    val krustyKrabsBurgerArray = arrayOfNulls<String>(inputPieces)
    var inputItem: String
    for (i in 0..krustyKrabsBurgerArray.size - 1) {
        println("Введите ${inputPieces--} ингредиентов, по очереди")
        inputItem = readln()
        krustyKrabsBurgerArray[i] = inputItem
    }

    val onPrintBurger = krustyKrabsBurgerArray.joinToString(", ")
    println("Рецепт вашего КрастиБургера готов: $onPrintBurger")
}