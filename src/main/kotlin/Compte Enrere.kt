/*Elon Musk està comptant enrere per el seu llançament del seu nou coet de SpaceX. No obstant, Elon Musk va fins dalt de porros i no sap fer un compte enrere. Ajuda'l
Entrada

Cada cas és una línia amb 1 número positiu.
Sortida

El compte enrere del nombre mostrat fins a 0, incloent els dos.
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
        for (j in num downTo 0) { //iterem enre el numero introduit a 0
            print("$j ") //imprimeix els numeros descendect
        }
}