package lesson9

val ingredientsList = mutableListOf<String>("bulka", "kotleta", "pomidor")

fun main() {
    println("В рецепте есть базовые ингредиенты:")
    printIngredient()

    println("Желаете добавить еще? (да/нет)")
    var inpute = readln()
    if (inpute.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        inpute = readln()
        ingredientsList.add(inpute)
    } else return
    println("Теперь в рецепте есть следующие ингредиенты:")
    printIngredient()
}

fun printIngredient() {
    ingredientsList.forEach {
        println("$it")
    }
}