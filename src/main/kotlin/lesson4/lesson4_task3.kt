package lesson4

fun main() {
    val currentDaySunny = true
    val currentCoverStatusOpen = true
    val currentWetAir = 20
    val currentSeason = "winter"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (currentDaySunny == IS_SUNNY_DAY) && (currentCoverStatusOpen == IS_AWNING_OPEN) &&
                    (currentWetAir == WET_AIR) && (currentSeason != BAD_SEASON)
        }"
    )
}

const val IS_SUNNY_DAY = true
const val IS_AWNING_OPEN = true
const val WET_AIR = 20
const val BAD_SEASON = "winter"