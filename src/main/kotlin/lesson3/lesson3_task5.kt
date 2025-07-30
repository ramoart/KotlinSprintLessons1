package lesson3

fun main() {
    val getData = "D2-D4;0"
    val splittedData = getData.split("-", ";")
    val firstMove = splittedData[0]
    val secondMove = splittedData[1]
    val numberMove = splittedData[2]

    println(firstMove)
    println(secondMove)
    println(numberMove)
}