package lesson22

fun main() {
    val book1 = RegularBook("Дж.Р.Р. Толкин", "Властелин колец")
    val book2 = RegularBook("Дж.Р.Р. Толкин", "Властелин колец")
    val book3 = DataBook("Дуглас Адамс", "Автостопом по галактике")
    val book4 = DataBook("Дуглас Адамс", "Автостопом по галактике")
    println(book1 == book2) //происходит сравнение объектов обычного класса, сравниваются ссылки, а не значения
    println(book3 == book4) //происходит сравнение объектов дата класса, сравниваются значения
}

class RegularBook(
    val authorName: String,
    val bookName: String,
)

data class DataBook(
    val authorName: String,
    val bookName: String,
)