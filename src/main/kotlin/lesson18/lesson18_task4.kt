package lesson18

fun main() {
    val rectangle = RectangleBox("Прямоугольная коробка", 10, 5, 5)
    val cube = CubeBox("Кубическая коробка", 10)
    val areaRectangle = rectangle.calcArea()
    val areaCube = cube.calcArea()
    println("${rectangle.name} имеет площадь $areaRectangle")
    println("${cube.name} имеет площадь $areaCube")

}

abstract class Box(
    val name: String,
) {
    abstract fun calcArea(): Int
}

class RectangleBox(
    name: String,
    val length: Int,
    val width: Int,
    val height: Int,
) : Box(name) {
    override fun calcArea(): Int {
        return COEFFICIENT_RECTANGLE * (length * width + width * height + length * height)
    }

}

class CubeBox(
    name: String,
    val lengthEdge: Int,
) : Box(name) {
    override fun calcArea(): Int {
        return COEFFICIENT_CUBE * lengthEdge * lengthEdge
    }
}

private const val COEFFICIENT_RECTANGLE = 2
private const val COEFFICIENT_CUBE = 6