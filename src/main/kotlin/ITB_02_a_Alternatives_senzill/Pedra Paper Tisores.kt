package ITB_02_a_Alternatives_senzill/*
Demana al jugador1, la seva opció: 1, 2, 3 (on 1 es pedra, 2 és paper i 3 és tisora).
Demana al jugador2, la seva opció: 1, 2, 3 (on 1 es pedra, 2 és paper i 3 és tisora).
*/
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val jugador1 = scanner.nextInt()
    val jugador2 = scanner.nextInt()

    if ((jugador1 == 1 && jugador2 == 1) || (jugador1 == 2 && jugador2 == 2) || (jugador1 == 3 && jugador2 == 3)) {
        println("EMPAT")
    } else if
        ((jugador1 == 1 && jugador2 == 3) || (jugador1 == 2 && jugador2 == 1) || (jugador1 == 3 && jugador2 == 2)){
        println("Jugador1")
    } else if
                  ((jugador1 == 3 && jugador2 == 1) || (jugador1 == 1 && jugador2 == 2) || (jugador1 == 2 && jugador2 == 3)){
        println("Jugador2")
    }else {
        println("ERROR")
    }
}
