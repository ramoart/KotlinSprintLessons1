package lesson11

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("ramoart")
    val user2 = forum.createNewUser("Volandemort")

    forum.createNewMessage(user1.userId, "Привет всем ИТТ!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Привет, коль не шутишь!")
    forum.createNewMessage(user2.userId, "Давай по сливочному пиву выпьем")
    forum.printThread()
}

class Forum(
    val usersList: MutableList<ForumMember> = mutableListOf(),
    val messagesList: MutableList<ForumMessage> = mutableListOf()
) {
    fun createNewUser(userName: String): ForumMember {
        val userId = userName.hashCode().toUInt().toString(16).padEnd(5, '0').take(5)
        val newUser = ForumMember.Builder()
            .setUserName(userName)
            .setUserId(userId)
            .build()
        usersList.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: String, text: String): ForumMessage? {
        val foundUser = usersList.find { it.userId == userId }
        return if (foundUser != null) {
            val newMessage = ForumMessage.Builder()
                .setAuthorId(userId)
                .setMessage(text)
                .build()
            messagesList.add(newMessage)
            newMessage
        } else null
    }

    fun printThread() {
        for (msg in messagesList) {
            val author = usersList.find { it.userId == msg.authorId }?.userName ?: "Unknown"
            println("$author: ${msg.message}")
        }
    }
}

class ForumMember private constructor(
    val userId: String,
    val userName: String,
) {
    class Builder {
        private var userId: String = ""
        private var userName: String = ""
        fun setUserId(id: String) = apply { this.userId = id }
        fun setUserName(name: String) = apply { this.userName = name }
        fun build(): ForumMember {
            return ForumMember(userId, userName)
        }
    }
}

class ForumMessage private constructor(
    val authorId: String,
    val message: String,
) {
    class Builder {
        private var authorId: String = ""
        private var message: String = ""
        fun setAuthorId(id: String) = apply { this.authorId = id }
        fun setMessage(msg: String) = apply { this.message = msg }
        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}
