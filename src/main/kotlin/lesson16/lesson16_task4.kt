package lesson16

fun main() {
    val order1 = Order(1, false)
    order1.messageToManager()
}

class Order(
    private val orderNumber: Int,
    var isOrderReady: Boolean,
) {
    fun messageToManager() {
        println("Выберите новый статус заявки, true or false")
        val newStatus = readln().toBoolean()
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: Boolean) {
        isOrderReady = newStatus
        println("Новый статус заказа $isOrderReady")
    }
}