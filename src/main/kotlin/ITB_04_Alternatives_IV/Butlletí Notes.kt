package ITB_04_Alternatives_IV/*Un Institut amb mètodes d'educació moderns va intentar fer que els alumnes es posessin les notes del butlletí ells mateixos. No va funcionar.
Entrada

Cada cas és d'una línea, i conté un número enter, 𝑁, del 0 al 10.

Sortida:

Per cada cas es dira el següent:

0-4: "Suspes"
5-6: "Aprovat"
7-8: "Notable"
9-10: "Excelent"

(Excel·lent du punt volat però és molt mala idea posar caràcters especials en els casos de prova...)

 */

import java.util.*
fun main() {
val scanner = Scanner(System.`in`)
val notes = scanner.nextInt()

    //Comparem les notes per veure el resultat del butlletí
when  {
    notes in 0..4 -> println("Suspes")
    notes in 5..6 -> println("Aprovat")
    notes in 7..8 -> println("Notable")
    notes in 9..10 -> println("Excelent")
}
}