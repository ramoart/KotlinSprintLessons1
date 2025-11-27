package lesson21

fun main() {
    val skills: Map<String, Int> = mapOf(
        "Красноречие" to 7, "Воровство" to 1,
        "Тяжелые доспехи" to 1, "Скрытность" to 7
    )
    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

