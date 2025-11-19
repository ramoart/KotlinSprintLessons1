package lesson20

fun main() {
    val listOfString = listOf<String>("String1", "String2", "String3", "String4", "String5", "String6")
    val listOfLambda = listOfString.map { string ->
        { println("Нажат элемент $string") }
    }
    listOfLambda.forEachIndexed { index, lambda -> if (index % 2 == 0) lambda() }
}

