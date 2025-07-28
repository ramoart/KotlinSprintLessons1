package lesson3

fun main() {
    val numberInitial = 7
    var results = ""
    //Решение №1
    for (i in 1..9) {
        results += "$numberInitial * $i = ${numberInitial * i}\n"
    }

    println(results)

    //Решение №2
    val multiResults = """
        $numberInitial * 1 = ${numberInitial * 1}
        $numberInitial * 2 = ${numberInitial * 2}
        $numberInitial * 3 = ${numberInitial * 3}
        $numberInitial * 4 = ${numberInitial * 4}
        $numberInitial * 5 = ${numberInitial * 5}
        $numberInitial * 6 = ${numberInitial * 6}
        $numberInitial * 7 = ${numberInitial * 7}
        $numberInitial * 8 = ${numberInitial * 8}
        $numberInitial * 9 = ${numberInitial * 9}
    """.trimIndent()
    println(multiResults)
}