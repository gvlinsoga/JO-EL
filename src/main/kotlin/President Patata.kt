/*Has ofés al President Patata. El teu càstig serà escriure en la pissarra mil cops “no ofendre al president patata”
Entrada:
La primera línia indica els casos de prova a considerar Cada cas compta amb un sol número.

Sortida:
Per cada cas de prova caldrà respondre: No ofendre al president patata tants cops com sigui el nombre. Després de cada cas fes un println buit.
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casosProva = scanner.nextInt()
    for (i in 1..casosProva) {
        val num = scanner.nextInt() //nombre de cops que s'ha d'escriure la frase
        for (j in 1..num) { //mentres que j sigui mes petit que el nombre de cops que s'ha d'escriure la frase es repeteix el bucle
            print("No ofendre al president patata \n")
        }
    }
}