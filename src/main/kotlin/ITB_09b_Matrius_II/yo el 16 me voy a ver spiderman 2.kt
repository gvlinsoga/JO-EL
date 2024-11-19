package ITB_09b_Matrius_II

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val f = scan.nextInt()
    val c = scan.nextInt()
    var filaSpiderman = -1
    var columnaSpiderman = -1
    val matriz = Array(f) { Array(c) { "" } }

    for (i in 0 until f) {
        for (j in 0 until c) {
            matriz[i][j] = scan.next()
            if (matriz[i][j] == "SPIDERMAN") {
                filaSpiderman = i
                columnaSpiderman = j
            }
        }
    }

    val sobre = if (filaSpiderman > 0) matriz[filaSpiderman - 1][columnaSpiderman] else "NO"
    val sota = if (filaSpiderman < f - 1) matriz[filaSpiderman + 1][columnaSpiderman] else "NO"

    println(sobre)
    println(sota)
}

