package ITB_06b_Bucles_I/*Anem a fer operacions matemàtiques.
Donat un nombre enter n > 0, calcula els números que són divisors d'aquest.

Entrada:
La primera línia indica els casos de prova a considerar.
Cada cas compta amb 1 linea amb un número enter positiu.

Sortida:
Per cada cas de prova caldrà mostrar la llista de divisors d'n en una línia i separats per un espai en blanc.
*/

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val num = scanner.nextInt()
        var divisors = "" //inicialitzem el string divisors a buit
        for (j in 1..num) {
            if (num % j == 0) { //si el residu de la divisió és 0, el nombre és divisor
                divisors += "$j " //afegim el nombre divisor al string divisors
            }
        }
        println(divisors)
    }
}