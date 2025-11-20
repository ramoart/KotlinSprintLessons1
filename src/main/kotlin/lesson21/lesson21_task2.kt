package lesson21

fun main() {
    val listOfNumbers: List<Int> = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(listOfNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    val evenList = this.filter { it % 2 == 0 }
    return evenList.sum()
}