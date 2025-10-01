package lesson13

fun main() {
    val phoneBook = PhoneBook1("ramoart", 880055555, null)
    val phoneBook2 = PhoneBook1("ramoart", 880055555, "Google")
    phoneBook.printData()
    phoneBook2.printData()
}

class PhoneBook1(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
) {
    fun printData() {
        println("Имя пользователя $name, телефонный номер $phoneNumber, название компании ${if (companyName == null) "не указано" else companyName}")
    }
}