package lesson4

fun main() {
    val numberDay: Int
    numberDay = 5

    println(
        "Упражнения для рук: ${!(numberDay % 2 == 0)}\n" +
                "Упражнения для ног: ${(numberDay % 2 == 0)}\n" +
                "Упражнения для спины: ${(numberDay % 2 == 0)}\n" +
                "Упражнения для пресса: ${!(numberDay % 2 == 0)}\n"
    )
}

