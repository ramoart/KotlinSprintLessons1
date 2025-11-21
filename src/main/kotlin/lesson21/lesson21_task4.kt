package lesson21

import java.io.File

fun main() {
    val file = File("data.txt")
    file.addToBeginning("Привет, мир!")
    println(file.readText())
}

fun File.addToBeginning(text: String) {
    val lower = text.lowercase()
    val oldContent = this.readText()
    this.writeText("$lower \n $oldContent")
}