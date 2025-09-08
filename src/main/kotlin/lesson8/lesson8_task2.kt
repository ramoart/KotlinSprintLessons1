package lesson8

fun main() {
    val krustyKrabsBurgerArray = arrayOf("bulka", "kotleta", "salat", "syr", "pomidor", "lyk", "ogurec", "secret sauce")
    println("Mr. Plankton, введите название ингредиента Красти Бургера:")
    val inputIndgredient = readln()
    var found = false

    for (i in 0..krustyKrabsBurgerArray.size - 1) {
        if (inputIndgredient == krustyKrabsBurgerArray[i]) {
            println("Ингредиент ${krustyKrabsBurgerArray[i]} в рецепте есть")
            found = true
        }
    }

    if (found == false) println("Такого ингредиента в рецепте нет")
}