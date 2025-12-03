package lesson22

fun main() {
    val chapter1 = GalacticGuide(
        "Альфа Центавра и гиперпространционный обход (магистраль)",
        "Вогоны уничтожают Землю, чтобы построить гипермаршрут к системе Альфа Центавра.",
        "В начале первой книги, точная дата не указана", 4.36
    )

    val (property1, property2, property3, property4) = chapter1
    println(property1)
    println(property2)
    println(property3)
    println(property4)
}

data class GalacticGuide(
    val nameOfPlace: String,
    val descriptionPlace: String,
    val dateAndTime: String,
    val lengthOfEarth: Double,
)

