package lesson8

fun main() {
    val krustyKrabsBurgerArray = arrayOf("bulka", "kotleta", "salat", "syr", "pomidor", "lyk", "ogurec", "secret sauce")
    println("Индгредиенты КрастиБургера: ${krustyKrabsBurgerArray.joinToString(", ")}")

    println("Mr.Plankton, какой ингредиент вы хотите поменять?")
    var inputItem = readln()
    val index = krustyKrabsBurgerArray.indexOf(inputItem)

    if (inputItem in krustyKrabsBurgerArray) {
        println("Какой ингредиент вы хотите добавить?")
        inputItem = readln()
        krustyKrabsBurgerArray[index] = inputItem
        println("Готово! Вы сохранили следующий список: ${krustyKrabsBurgerArray.joinToString(", ")}")
    } else println("Такого ингредиента нет в списке")
}