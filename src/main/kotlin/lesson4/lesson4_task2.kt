package lesson4

fun main() {
    val packageOneWeight = 20
    val packageOneVolume = 80
    val packageTwoWeight = 50
    val packageTwoVolume = 100
    println(
        "Груз с весом $packageOneWeight кг и объемом $packageOneVolume л соответствует категории 'Average': " +
                "${(packageOneWeight > MIN_WEIGHT) and (packageOneWeight <= MAX_WEIGHT) and (packageOneVolume < MAX_VOLUME)}"
    )
    println(
        "Груз с весом $packageTwoWeight кг и объемом $packageTwoVolume л соответствует категории 'Average': " +
                "${(packageTwoWeight > MIN_WEIGHT) and (packageTwoWeight <= MAX_WEIGHT) and (packageTwoVolume < MAX_VOLUME)}"
    )
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100