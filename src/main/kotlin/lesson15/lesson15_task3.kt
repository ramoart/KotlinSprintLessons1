package lesson15

fun main() {
    val user1 = User(1, "Volandemort")
    val admin1 = Admin(1, "ramoart")
    user1.readForum()
    user1.textMessage()
    admin1.readForum()
    admin1.textMessage()
    admin1.deleteMessage()
    admin1.deleteUsers()
}

abstract class ActionOnForum(
) {
    abstract fun readForum()
    abstract fun textMessage()
    abstract fun deleteMessage()
    abstract fun deleteUsers()
}

class User(
    val idUsers: Int,
    val userName: String,
) : ActionOnForum() {
    override fun readForum() {
        println("Пользователь $userName создал и прочитал ветку форума")
    }

    override fun textMessage() {
        println("Пользователь $userName написал первое сообщение в ветке")
    }

    override fun deleteMessage() {
    }

    override fun deleteUsers() {
    }
}

class Admin(
    val idAdmins: Int,
    val adminName: String,
) : ActionOnForum() {
    override fun readForum() {
        println("Админ $adminName прочитал ветку форума")
    }

    override fun textMessage() {
        println("Админ $adminName ответил пользователю")
    }

    override fun deleteMessage() {
        println("Админ $adminName удалил сообщение юзера")
    }

    override fun deleteUsers() {
        println("Админ $adminName забанил и удалил юзера")
    }
}
