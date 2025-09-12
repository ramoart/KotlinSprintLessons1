package lesson9

fun main() {
    val countIngredients = listOf<Int>(2, 50, 15)
    println("Введите количество порций:")
    val inputPieces = readln().toInt()
    val usersIngredients = countIngredients.map { it * inputPieces }
    println(
        "На $inputPieces порций вам понадобится: " +
                "Яиц - ${usersIngredients[0]}, " +
                "молока - ${usersIngredients[1]}, " +
                "сливочного масла - ${usersIngredients[2]}"
    )
}