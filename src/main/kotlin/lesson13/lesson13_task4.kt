package lesson13

fun main() {
    val phoneBookList = mutableListOf<PhoneBook3>()

    println("Введите по очереди имя пользователя, номер телефона и название компании")
    val name = readln()

    println("Введите номер телефона:")
    val phoneInput = readln()
    val phoneNumber = phoneInput.toLongOrNull()

    if (phoneNumber == null) {
        println("Вы не ввели корректный номер телефона — контакт не добавлен")
    } else {
        println("Введите название компании:")
        val companyInput = readln()
        val companyName = if (companyInput.isBlank()) null else companyInput

        val phoneBook = PhoneBook3(name, phoneNumber, companyName)
        phoneBookList.add(phoneBook)
    }

    println("\nСписок контактов:")
    println(phoneBookList.joinToString("\n"))   // <-- красиво выводит
}

class PhoneBook3(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
) {
    override fun toString(): String {
        return "Имя: $name, Телефон: $phoneNumber, Компания: ${companyName ?: "не указана"}"
    }

    fun printData() {
        println(toString())
    }
}
