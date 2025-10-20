package lesson15

fun main() {
    val guitar = MusicTools("Гитара", 2)
    val guitarComponent = MusicComponents("Струны", 5)
    guitar.findComponents()
}

abstract class MainGoods(
    val nameProduct: String,
    val amountProduct: Int,
)

interface FindComponents {
    fun findComponents() {
        println("Выполняется поиск")
    }
}

class MusicTools(
    nameProduct: String,
    amountProduct: Int,
) : MainGoods(nameProduct, amountProduct), FindComponents

class MusicComponents(
    nameProduct: String,
    amountProduct: Int,
) : MainGoods(nameProduct, amountProduct)