package ITB_05a_Iteratius_I/*Per què preferiu fer exercicis d'ifs d'un punt? Els de bucles en donen dos!
Entrada

La primera línia indica els casos de prova a considerar. Cada cas és una línia amb un nombre.
Sortida

Per cada cas de prova caldrà respondre: El nombre introduït més un.
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()
    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val num = scanner.nextInt()
        println(num + 1) //imprimeix el numero introduit mes 1
    }
}