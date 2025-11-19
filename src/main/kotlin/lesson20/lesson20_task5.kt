package lesson20

fun main() {
    val robot = Robot()
    robot.say()
    robot.setSpeechModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }
    robot.say()
}

class Robot {
    val phrases = listOf(
        "Привет, я робот Флин",
        "Как дела?",
        "Замечательная погода, не так ли?",
        "Чем занимаешься?",
        "Кожанный мешок, где мои деньги?"
    )
    var modifier: (String) -> String = {it}

    fun say() {
        val phrase = phrases.random()
        println(modifier(phrase))
    }

    fun setSpeechModifier(mod: (String) -> String) {
        modifier = mod
    }
}