package lesson14

fun main() {
    val chat = Chat()
    chat.addMessage("Я вчера смотрел Гарри Поттера кубок огня", "Ramoart")
    chat.addMessage("Не люблю этот фильм", "Volandemort")
    chat.addThreadMessage("Ничего ты не понимаешь", "Ramoart", 2)
    chat.addThreadMessage("Звездный десант намного лучше!", "Volandemort", 3)
    chat.printChat()
}

open class Message(
    val id: Int,
    val author: String,
    val text: String
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int
) : Message(id, author, text)

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String) {
        messages.add(Message(nextId, author, text))
        nextId++
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        messages.add(ChildMessage(nextId, author, text, parentMessageId))
        nextId++
    }

    fun printChat() {
        val grouped = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        for ((_, msgs) in grouped) {
            for (m in msgs) {
                println("[${m.id}] ${m.author}: ${m.text}")
            }
        }
    }
}
