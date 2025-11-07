package lesson18

fun main() {
    val figure = Screen(0, 0, 5, 0.0f, 0.0f, 10.0f)
    println(figure.drawSquare(0, 0, 5))
    println(figure.drawSquare(0.0f, 0.0f, 10.0f))
    println(figure.drawPoint(0, 0))
    println(figure.drawCircle(0.0f, 0.0f, 10.0f))
}

class Screen(
    xInt: Int,
    yInt: Int,
    lengthSquare: Int,
    xFloat: Float,
    yFloat: Float,
    radius: Float,
) {
    fun drawSquare(xInt: Int, yInt: Int, lengthSquare: Int): String {
        val topLeft = Pair(xInt, yInt)
        val topRight = Pair(xInt + lengthSquare, yInt)
        val bottomRight = Pair(xInt + lengthSquare, yInt + lengthSquare)
        val bottomLeft = Pair(xInt, yInt + lengthSquare)
        return "Нарисован квадрат в следующих координатах: $topLeft, $topRight, $bottomLeft, $bottomRight"
    }

    fun drawSquare(xFloat: Float, yFloat: Float, lengthSquare: Float): String {
        val topLeft = Pair(xFloat, yFloat)
        val topRight = Pair(xFloat + lengthSquare, yFloat)
        val bottomRight = Pair(xFloat + lengthSquare, yFloat + lengthSquare)
        val bottomLeft = Pair(xFloat, yFloat + lengthSquare)
        return "Нарисован квадрат (Float) в следующих координатах: $topLeft, $topRight, $bottomLeft, $bottomRight"
    }

    fun drawCircle(xFloat: Float, yFloat: Float, radius: Float): String {
        return "Нарисован круг в координатах: x = $xFloat, y = $yFloat (r = $radius)"
    }

    fun drawPoint(xInt: Int, yInt: Int): String {
        val point = Pair(xInt, yInt)
        return "Нарисована точка в координатах $point"
    }
}
