package lesson21

import java.io.File

fun main() {
    val file = File("data.txt")
    file.MyExtension("Привет, мир!")
    println(file.readText())
}

fun File.MyExtension(text: String) {
    val lower = text.lowercase()
    val oldContent = this.readText()
    return this.writeText(lower + oldContent)
}