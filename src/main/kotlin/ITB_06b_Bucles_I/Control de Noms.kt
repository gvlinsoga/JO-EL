package ITB_06b_Bucles_I/*En el WoW hi ha un control de noms per evitar que et posis noms que trenquin amb la fantasia del mon. Un dels controls es que el teu nom no pot ser la mateixa lletra repetida.
Implementa aquest controlde noms

Entrada
Cada cas es una Paraula

Sortida
S'ha de dir "SI" si el nom es vàlid (no es només una tecla repetida) i "NO" si és invàlid
*/

import java.util.*

fun main() {
val scanner = Scanner(System.`in`)
    val nom = scanner.next()
    var valid = false //inicialitzem la variable valid a true

    for (i in 0 until  nom.length - 1) { //per cada lletra del nom excepte l'última
        if (nom[i] != nom[i + 1]) { //si la lletra actual és diferent a la següent, el nom és vàlid
            valid = true
        } else {
            valid = false //si la lletra actual és igual a la següent, el nom no és vàlid
        }
    }
    if (valid) {
        println("SI")
    } else {
        println("NO")
    }
}