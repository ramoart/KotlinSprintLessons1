package lesson17

fun main() {
    val victorina = Victorina("В каком году родился Роберт Монро?", "30 октября 1915г.")
    println(victorina.question)
    println(victorina.answer)
}

class Victorina(
    question: String,
    answer: String
) {
    val question: String = question
        get() = field
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

