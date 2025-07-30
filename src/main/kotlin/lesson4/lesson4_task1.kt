package lesson4

fun main() {
    val countTablesToday = 13
    val countTablesTomorrow = 9
    println("[Доступность столиков на сегодня: ${countTablesToday == COUNT_TABLES}]\n[Доступность столиков на завтра: ${countTablesTomorrow == COUNT_TABLES}]")
}

const val COUNT_TABLES = 13