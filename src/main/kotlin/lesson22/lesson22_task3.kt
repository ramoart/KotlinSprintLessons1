package lesson22

fun main() {
    val computer1 = Computer()
    val (object1, object2, object3) = computer1
    println(object1)
    println(object2)
    println(object3)
}

data class Computer(
    val item1: String = "Клавиуатура",
    val item2: String = "Монитор",
    val item3: String = "Видеокарта",
)
