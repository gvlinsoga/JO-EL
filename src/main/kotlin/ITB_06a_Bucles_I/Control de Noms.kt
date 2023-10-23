package ITB_06a_Bucles_I/*En el WoW hi ha un control de noms per evitar que et posis noms que trenquin amb la fantasia del mon. Un dels controls es que el teu nom no pot ser la mateixa lletra repetida.
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
    var valid = true // Inicialitzem la variable valid a true

    if (nom.length == 1) {
        valid = false // Només una lletra no compleix amb la condició
    } else {
        for (i in 0 until nom.length - 1) { // Per cada lletra del nom excepte l'última
            if (nom[i].toLowerCase() == nom[i + 1].toLowerCase()) { // Comparem les lletres en minúscules
                valid = false
            }
        }
    }

    if (valid) {
        println("SI")
    } else {
        println("NO")
    }
}