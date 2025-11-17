package lesson19

fun main() {
    val personsList = mutableListOf<Person>()
    repeat(NUMBER_OF_PERSON) {
        println("Введите поочередно имя человека и его пол (пол в формате MALE/FEMALE)")
        val person1 = Person(readln(), Gender.valueOf(readln().uppercase()))
        personsList.add(person1)
    }
    println("В списке хранятся данные следующих людей:")
    personsList.forEach { println("${it.name} - ${it.gender}") }
}

enum class Gender {
    MALE,
    FEMALE
}

class Person(
    val name: String,
    val gender: Gender,
) {

}

private const val NUMBER_OF_PERSON = 5