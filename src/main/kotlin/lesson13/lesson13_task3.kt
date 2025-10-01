package lesson13

fun main() {
    val phoneBook = PhoneBook2("user1", 880055555, null)
    val phoneBook2 = PhoneBook2("user2", 880055555, null)
    val phoneBook3 = PhoneBook2("user3", 880055555, "null")
    val phoneBook4 = PhoneBook2("user4", 880055555, "Google")
    val phoneBook5 = PhoneBook2("user5", 880055555, "Yandex")
    val phoneBookList = mutableListOf<PhoneBook2>(phoneBook, phoneBook2, phoneBook3, phoneBook4, phoneBook5)
    val companyPrint = phoneBookList.mapNotNull { it.companyName }
    println("Компании в телефонной книге: $companyPrint")
}

class PhoneBook2(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
) {
    fun printData() {
        println("Имя пользователя $name, телефонный номер $phoneNumber, название компании ${if (companyName == null) "не указано" else companyName}")
    }
}