package lesson20

fun main() {
    val userName = "ramoart"
    val hello: () -> Unit = { println("С наступающим Новым Годом, $userName!") }
    hello()
}

