package lesson11

fun main() {
    val user1: Member = Member(userName = "ramoart", status = "разговаривает", avatar = 1)
    val room1: Room = Room(coverResourseId = 1, nameOfRoom = "Подкасты Джо Рогана")
    room1.addMember(user1)
    room1.updateStatus(user1)
}

class Member(
    var userName: String,
    var status: String,
    var avatar: Int,
)

class Room(
    val coverResourseId: Int,
    val nameOfRoom: String,
    val membersList: MutableList<Member> = mutableListOf()
) {

    fun addMember(member: Member) {
        membersList.add(member)
    }

    fun updateStatus(member: Member) {
        println("Введите никнейм для изменения статус")
        val nickname = readln()
        val foundMember = membersList.find { it.userName == nickname }
        println("Введите новый статус")
        foundMember?.status = readln()
        println("Ваш новый статус ${foundMember?.status}")
    }
}