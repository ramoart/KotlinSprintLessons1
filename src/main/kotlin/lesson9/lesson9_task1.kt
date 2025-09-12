package lesson9

fun main() {
    val krustyKrabsBurger = listOf("bulka", "kotleta", "salat", "syr", "pomidor", "lyk", "ogurec", "secret sauce")
    println("В рецепте есть следующие ингредиенты:")
    krustyKrabsBurger.forEach {
        println("$it")
    }
}
