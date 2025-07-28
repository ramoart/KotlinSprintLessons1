package lesson3

fun main() {
    val getData = "D2-D4;0"
    val splittedData = getData.split(";")
    val moveData = splittedData[0]
    val numberMove = splittedData[1]
    val partsMove = moveData.split("-")
    val firstMove = partsMove[0]
    val secondMove = partsMove[1]

    println(firstMove)
    println(secondMove)
    println(numberMove)
}