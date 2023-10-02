/*
Demana al jugador1, la seva opció: 1, 2, 3 (on 1 es pedra, 2 és paper i 3 és tisora).
Demana al jugador2, la seva opció: 1, 2, 3 (on 1 es pedra, 2 és paper i 3 és tisora).
*/
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val anyNaixement = scanner.nextInt()

    if (anyNaixement in 1945..1965) {
        println("ok boomer")

    }else {
        println("nah")
    }
}
