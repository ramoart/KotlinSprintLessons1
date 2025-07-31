package lesson4

fun main() {
    val numberDay: Int
    numberDay = 5
    val isEven = numberDay % 2 == 0

    println(
        "Упражнения для рук: ${!(isEven)}\n" +
                "Упражнения для ног: ${isEven}\n" +
                "Упражнения для спины: ${isEven}\n" +
                "Упражнения для пресса: ${!(isEven)}\n"
    )
}

