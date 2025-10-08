package lesson14

fun main() {
    val planet1 = Planet(true, true, 100, "Gorgona", true)
    val sputnik1 = Sputnik(false, true, 30, "sputnik1")
    val sputnik2 = Sputnik(false, true, 25, "sputnik2")
    planet1.sputnikList.add(sputnik1)
    planet1.sputnikList.add(sputnik2)
    planet1.printData()
}

open class CelestialBodies(
    val isAnAtmosphere: Boolean = false,
    val isSuitableForLanding: Boolean = false,
    val diametersBodies: Int,
)

class Planet(
    isAnAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    diametersBodies: Int,
    val nameOfPlanet: String,
    val isHaveSputnik: Boolean = false,
    val sputnikList: MutableList<Sputnik> = mutableListOf<Sputnik>(),
) : CelestialBodies(isAnAtmosphere, isSuitableForLanding, diametersBodies) {
    fun printData() {
        println(nameOfPlanet)
        println(sputnikList.map { it.nameOfSputnik })
    }
}

class Sputnik(
    isAnAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    diametersBodies: Int,
    val nameOfSputnik: String,
) : CelestialBodies(isAnAtmosphere, isSuitableForLanding, diametersBodies)