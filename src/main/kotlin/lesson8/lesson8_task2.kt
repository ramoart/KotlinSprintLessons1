package lesson8

fun main() {
    val krustyKrabsBurgerArray = arrayOf("bulka", "kotleta", "salat", "syr", "pomidor", "lyk", "ogurec", "secret sauce")
    println("Mr. Plankton, введите название ингредиента Красти Бургера:")
    val inputIndgredient = readln()
    var found = false

    for (i in krustyKrabsBurgerArray) {
        if (inputIndgredient == i) {
            println("Ингредиент $i в рецепте есть")
            found = true
            break
        }
    }

    if (found == false) println("Такого ингредиента в рецепте нет")
}