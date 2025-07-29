package lesson4

fun main() {
    val currentDaySunny = true
    val currentCoverStatusOpen = true
    val currentWetAir = 20
    val currentSeason = "winter"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (currentDaySunny == SUNNY_DAY) and (currentCoverStatusOpen == COVER_STATUS_OPEN)
                    and (currentWetAir == WET_AIR) and (currentSeason == SEASON_STATUS)
        }"
    )
}

const val SUNNY_DAY = true
const val COVER_STATUS_OPEN = true
const val WET_AIR = 20
const val SEASON_STATUS = "don't winter"