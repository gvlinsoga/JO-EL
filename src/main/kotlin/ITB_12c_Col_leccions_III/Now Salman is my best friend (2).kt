package ITB_12c_Col_leccions_III


/*
Sempre es bo saber quin es el teu millor amic, pero a vegades el teu millor amic canvia... també m'han dit que les amistats son bidireccionals. No ho sabia perque soc un webservice.
Entrada

El problema té múltiples línies. La primera tindrà un nombre, 𝑁
amb el nombre de casos de prova Cada cas començara amb un nombre 𝐾

indicant el nombre de línies que hi ha. Seguit hi haurà K-1 linies indicant les relacions d'amistat, es a dir, dient que els dos son mutuament el millor amic de l'altre. Pot ser que en algun moment el teu millor amic canvii. En aquest cas, el que importa és l'últim Després vindrà un nom.
Sortida

Per cada cas s'ha de tornar el nom del millor amic del nom proporcionat
Exemple d'Entrada
Copy

2
5
Asif Mudasir
Asif Salman
Marc Hector
Marc Asif
Asif
4
Marc Hector
Hector 6NoiesEnBikini
Marc Dani
Marc

Exemple de Sortida
Copy

Marc
Dani
 */

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    for (i in 1..casos) {
        val n = scan.nextInt()
        val amics = mutableMapOf<String, String>()
        for (j in 0 until n - 1) {
            val amic1 = scan.next()
            val amic2 = scan.next()
            amics[amic1] = amic2
            amics[amic2] = amic1
        }
        val nom = scan.next()
        println(amics[nom])
    }
}