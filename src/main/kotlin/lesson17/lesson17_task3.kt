package lesson17

fun main() {
    val folder1 = Folder("Folder", 42, false)
    val folder2 = Folder("Folder2", 42, true)
    println("Папка ${folder1.name}, количество файлов ${folder1.amountFiles}")
    println("Папка ${folder2.name}, количество файлов ${folder2.amountFiles}")
}

class Folder(
    private val originalName: String,
    private val originalAmountFiles: Int,
    val isSecret: Boolean,
) {
    val name: String
        get() = if (isSecret == true) "Скрытая папка" else originalName
    val amountFiles: Int
        get() = if (isSecret == true) 0 else originalAmountFiles
}