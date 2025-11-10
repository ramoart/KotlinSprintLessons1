package lesson19

fun main() {
    val fishList = listOf<Fish>(Fish.GUPPY, Fish.ANGELFISH, Fish.GOLDFISH, Fish.SIAMESE_FIGHTING_FISH)
    println("Вы можете добавить следующих рыб в свой аквариум: " + fishList.joinToString { it.fishName })
}

enum class Fish(val fishName: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}