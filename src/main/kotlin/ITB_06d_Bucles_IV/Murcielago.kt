package ITB_06d_Bucles_IV

/*
Murcielago es una de les poques paraules que tenen totes les vocals. saps alguna més?
Entrada

L'entrada es una sola paraula, escrita només en lletres minúscules de l'alfabet anglés. Sense accents.
Sortida

El programa escriurà “TOTES” si durant la frase han aparegut totes les vocals, i “FALTEN” si falta alguna vocal.
Exemple d'Entrada
Copy

murcielago

Exemple de Sortida
Copy

TOTES

Exemple d'Entrada
Copy

canalla

Exemple de Sortida
Copy

FALTEN


 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val paraula = scanner.nextLine()
    var a = false
    var e = false
    var i = false
    var o = false
    var u = false
    for (j in 0 until paraula.length) {
        when (paraula[j]) {
            'a' -> a = true
            'e' -> e = true
            'i' -> i = true
            'o' -> o = true
            'u' -> u = true
        }
    }
    println(if (a && e && i && o && u) "TOTES" else "FALTEN")
}