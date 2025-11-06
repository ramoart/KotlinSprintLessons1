package lesson18

fun main() {
    val figure = Screen(0, 0, 5, 0.0f, 0.0f, 10.0f)
    println(figure.draw(0, 0, 5))
    println(figure.draw(0.0f, 0.0f, 10.0f))
    println(figure.draw(0, 0))
}

class Screen(
    val xInt: Int,
    val yInt: Int,
    val lengthSquare: Int,
    val xFloat: Float,
    val yFloat: Float,
    val radius: Float,
) {
    fun draw(xInt: Int, yInt: Int, lengthSquare: Int): String {
        val topLeft = Pair(xInt, yInt)
        val topRight = Pair(xInt + lengthSquare, yInt)
        val bottomRight = Pair(xInt + lengthSquare, yInt + lengthSquare)
        val bottomLeft = Pair(xInt, yInt + lengthSquare)
        return "Нарисован квадрат в следующих коориднатах: $topLeft, $topRight, $bottomLeft, $bottomRight"
    }

    fun draw(xFloat: Float, yFloat: Float, radius: Float): String {
        val diag = radius / kotlin.math.sqrt(2f)
        val top = Pair(xFloat, yFloat - radius)
        val bottom = Pair(xFloat, yFloat + radius)
        val left = Pair(xFloat - radius, yFloat)
        val right = Pair(xFloat + radius, yFloat)
        val topLeft = Pair(xFloat - diag, yFloat - diag)
        val topRight = Pair(xFloat + diag, yFloat - diag)
        val bottomLeft = Pair(xFloat - diag, yFloat + diag)
        val bottomRight = Pair(xFloat + diag, yFloat + diag)
        return "Нарисован круг с центром ($xFloat, $yFloat) и радиусом $radius, ключевые точки: " +
                "$top, $bottom, $left, $right, $topLeft, $topRight, $bottomLeft, $bottomRight"
    }

    fun draw(xInt: Int, yInt: Int): String {
        val point = Pair(xInt, yInt)
        return "Нарисована точка в координатах $xInt, $yInt"
    }
}


