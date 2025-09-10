package lesson9

fun main() {
    val krustyKrabsBurgerArray = listOf("bulka", "kotleta", "salat", "syr", "pomidor", "lyk", "ogurec", "secret sauce")
    krustyKrabsBurgerArray.forEach {
        println("В рецепте есть следующие ингредиенты: $it")
    }
}
