package lesson2

fun main() {
    val scoreStudent1 = 3f
    val scoreStudent2 = 4f
    val scoreStudent3 = 3f
    val scoreStudent4 = 5f
    val countOfStudents = 4

    val averageScore = (scoreStudent1 + scoreStudent2 + scoreStudent3 + scoreStudent4) / countOfStudents
    val formattedData = "%.2f".format(averageScore)
    println(formattedData)
}