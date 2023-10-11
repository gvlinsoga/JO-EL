/*
Et donen una seqüència de números enters que s'acaba amb un zero. Volem saber si tenim més números positius que negatius o al inrevés.
Entrada:

L'entrada consta d'una seqüencia de números enters que s'acaba en un zero.

Sortida:

Indicarà POSITIUS si hi ha més positius que negatius, NEGATIUS si hi ha més valors negatius i IGUALS en cas d'empat.
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var positiu = 0
    var negatiu = 0

    while (num != 0) { // mentres que el numero sigui diferent a 0
        if (num > 0) positiu++ // si el numero es positiu, augmentem el contador de positiu
        else negatiu++ // si el numero es negatiu, augmentem el contador de negatiu
        num = scanner.nextInt()
    }
    if (positiu > negatiu) println("POSITIUS") // si hi ha mes positius que negatius
    else if (positiu < negatiu) println("NEGATIUS") //si hi ha mes negatius que positius
    else println("IGUALS") //si tenen el mateixos nums de positius i negatius
}