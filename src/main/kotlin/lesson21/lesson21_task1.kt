package lesson21

fun main() {
    val string = "Программирование"
    println(string.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ"
    return this.count { it in vowels }
}