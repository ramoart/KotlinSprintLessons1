package lesson3

fun main() {
    var firstMove = "E2"
    var secondMove = "E4"
    var numberMove = "1"
    var postData = "$firstMove -> $secondMove; Номер хода $numberMove"
    println(postData)

    firstMove = "D2"
    secondMove = "D3"
    numberMove = "2"
    postData = "$firstMove -> $secondMove; Номер хода $numberMove"
    println(postData)
}