package lesson22

fun main() {
    val book1 = BookFantasyCategory("Дж.Р.Р. Толкин", "Властелин колец")
    val book2 = BookFantasticCategory("Дуглас Адамс", "Автостопом по галактике")
    println(book1) //происходит вывод ссылки на объект
    println(book2) //происходит вывод названия дата класса, и полей стринг
}

class BookFantasyCategory(
    val authorName: String,
    val bookName: String,
)

data class BookFantasticCategory(
    val authorName: String,
    val bookName: String,
)