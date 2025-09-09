package lesson8

fun main() {
    val krustyKrabsBurgerArray = arrayOf("bulka", "kotleta", "salat", "syr", "pomidor", "lyk", "ogurec", "secret sauce")
    println("Mr. Plankton, введите название ингредиента Красти Бургера:")
    val inputIndgredient = readln()

    if (inputIndgredient in krustyKrabsBurgerArray) {
        println("Ингредиент $inputIndgredient в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}