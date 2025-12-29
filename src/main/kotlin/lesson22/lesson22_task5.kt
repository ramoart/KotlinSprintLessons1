package lesson22

fun main() {
    val chapter1 = GalacticGuide(
        "Альфа Центавра и гиперпространционный обход (магистраль)",
        "Вогоны уничтожают Землю, чтобы построить гипермаршрут к системе Альфа Центавра.",
        "В начале первой книги, точная дата не указана", 4.36
    )

    println(chapter1.component1())
    println(chapter1.component2())
    println(chapter1.component3())
    println(chapter1.component4())
}

data class GalacticGuide(
    val nameOfPlace: String,
    val descriptionPlace: String,
    val dateAndTime: String,
    val lengthOfEarth: Double,
)

