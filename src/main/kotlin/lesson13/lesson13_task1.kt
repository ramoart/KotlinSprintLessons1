package lesson13

fun main() {
    val phoneBook1 = PhoneBook("ramoart", 880055555, "Google")
    val phoneBook2 = PhoneBook("volandemort", 880055555, null)
    phoneBook1.printData()
    phoneBook2.printData()
}

class PhoneBook(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
) {
    fun printData() {
        println("Имя пользователя $name, телефонный номер $phoneNumber, название компании $companyName")
    }
}