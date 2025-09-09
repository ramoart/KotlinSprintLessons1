package lesson8

fun main() {
    val krustyKrabsBurgerArray = arrayOf("bulka", "kotleta", "salat", "syr", "pomidor", "lyk", "ogurec", "secret sauce")
    for (item in krustyKrabsBurgerArray) {
        println("Ингредиент КрастиБургера: $item")
    }
    println("Mr.Plankton, какой ингредиент вы хотите поменять?")
    var inputItem = readln()
    var found = false

    for (i in 0..krustyKrabsBurgerArray.size - 1) {
        if (inputItem == krustyKrabsBurgerArray[i]) {
            println("Какой ингредиент вы хотите добавить?")
            inputItem = readln()
            krustyKrabsBurgerArray[i] = inputItem
            for (item in krustyKrabsBurgerArray) {
                println("Готово! Вы сохранили следующий список: $item")
            }
            found = true
            break
        }
    }

    if (found == false) println("Такого ингредиента нет в списке")
}