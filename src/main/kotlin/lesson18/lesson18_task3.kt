package lesson18

fun main() {
    val fox = Fox("Лиса", "ягоды")
    val dog = Dog("Собака", "кости")
    val cat = Cat("Кошка", "рыбу")
    val animalList = listOf<Animal>(fox, dog, cat)
    animalList.forEach {
        it.eating()
        it.sleep()
    }
}

abstract class Animal(
    val animalName: String,
) {
    abstract fun eating()
    fun sleep() {
        println("$animalName спит")
    }
}

class Fox(
    animalName: String,
    val food: String,
) : Animal(animalName) {
    override fun eating() {
        println("$animalName поедает $food")
    }

}

class Dog(
    animalName: String,
    val food: String,
) : Animal(animalName) {
    override fun eating() {
        println("$animalName поедает $food")
    }
}

class Cat(
    animalName: String,
    val food: String
) : Animal(animalName) {
    override fun eating() {
        println("$animalName поедает $food")
    }
}