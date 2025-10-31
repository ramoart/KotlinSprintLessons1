package lesson18

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.printData("Клавиатура")
    order2.printData(listOf<String>("Клавиатура", "Принтер"))
}

class Order(
    val orderNumber: Int,
) {
    fun printData(item: String) {
        println("Заказан товар: $item")
    }

    fun printData(itemList: List<String>) {
        println("Заказаны следующие товары: ${itemList.joinToString()}")
    }
}