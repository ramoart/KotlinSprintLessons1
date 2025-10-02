package lesson13

fun main() {
    println("Введите по очереди имя пользователя, номер телефона и название компании")
    val name = readln()
    val inputNumber = readln()
    val phoneNumber = inputNumber.toLongOrNull()
    if (phoneNumber == null) {
        println("Error: NumberFormatException")
        return
    }
    val companyName = readln()
    val phoneBook = PhoneBook4(name, phoneNumber, companyName)
    val phoneBookList = mutableListOf<PhoneBook4>(phoneBook)
    println(phoneBookList.joinToString())
}

class PhoneBook4(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
) {
    override fun toString(): String {
        return "Имя: $name, Телефон: $phoneNumber, Компания: ${companyName ?: "не указана"}"
    }
}
