package lesson21

fun main() {
    val string = "Программирование"
    println(string.vowelCount(string))
}

fun String.vowelCount(word: String): Int {
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ"
    return word.count { it in vowels }
}