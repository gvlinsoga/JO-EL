import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)

    val nomJugador = scanner.nextLine()// Llegim el nom del jugador
    val puntuacionicial = scanner.nextLong() // Llegin els punts inicials
    val grup = scanner.next() //LLegimo el grup al que pentanya

    if (grup != "A" && grup != "B" && grup != "C") {
        println("ERROR") //Si grup es diferent a A, B o C imprimeix error
    } else if (puntuacionicial < 0) {
        println("ERROR") // Si puntuacio es menor a o imprimeix error

    } else if (grup == "A") {
        puntuacionicial + 100
    } else if (grup == "B") {
    puntuacionicial + 50
    } else if (grup == "C") {
    puntuacionicial + 25
    }
    println(" Jugador: $nomJugador - Grup: $grup Punts: ${puntuacionicial}")



}