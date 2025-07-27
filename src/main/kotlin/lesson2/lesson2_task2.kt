package lesson2

fun main() {
    val oldsEmployers = 50
    val oldsEmployersSalary = 30000
    val newEmployers = 30
    val newEmployersSalary = 20000

    val oldsEmployersCosts = oldsEmployers * oldsEmployersSalary
    val summaryCosts = oldsEmployersCosts + newEmployers * newEmployersSalary
    val averageSalary = (summaryCosts) / oldsEmployers + newEmployers

    println(oldsEmployersCosts)
    println(summaryCosts)
    println(averageSalary)
}