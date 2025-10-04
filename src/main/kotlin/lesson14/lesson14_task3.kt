package lesson14

fun main() {
    val rectangle1 = Rectangle("white", 5.0, 8.0)
    val rectangle2 = Rectangle("black", 5.0, 8.0)
    val circle1 = Circle("white", 5.0)
    val circle2 = Circle("black", 8.0)
    val figureList = mutableListOf<Figure>(rectangle1, rectangle2, circle1, circle2)
    val sumBlackPerimeters = figureList.filter { it.color == "black" }.sumOf { it.calculatePerimeter() }
    val sumWhiteAreas = figureList.filter { it.color == "white" }.sumOf { it.calculateArea() }
    println(sumBlackPerimeters)
    println(sumWhiteAreas)
}

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        val area: Double = COEFFICIENT_PI * (radius * radius)
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter: Double = 2 * COEFFICIENT_PI * radius
        return perimeter
    }
}

class Rectangle(
    color: String,
    val height: Double,
    val width: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        val area = height * width
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = (height + width) * 2
        return perimeter
    }

}


const val COEFFICIENT_PI = 3.14