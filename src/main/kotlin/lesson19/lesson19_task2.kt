package lesson19

fun main() {
    val product1 = Product("Сарафан", 0, Shop.CLOTHES.printData(Shop.CLOTHES))
    val product2 = Product("Клей-карандаш", 1, Shop.ITEMS.printData(Shop.ITEMS))
    val product3 = Product("Зубная нить", 2, Shop.OTHERS.printData(Shop.OTHERS))
    product1.printData()
    product2.printData()
    product3.printData()
}

enum class Shop {
    CLOTHES,
    ITEMS,
    OTHERS;

    fun printData(enumVal: Shop): String {

        return when {
            enumVal == CLOTHES -> "Категория одежда"
            enumVal == ITEMS -> "Категория канцелярские товары"
            enumVal == OTHERS -> "Категория Разное"
            else -> {
                ""
            }
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: String,
) {
    fun printData() {
        println("Название товара $name, id товара $id, категория товара $category")
    }
}