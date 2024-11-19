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
    val nom = scanner.nextLine()
    var lletraPrincipal = nom.get(0) // Obtenim la primera lletra del nom
    var valid = true // Inicialitzem la variable valid a true
    var posicio = 0 // Inicialitzem la variable posicio a 0

    while (posicio < nom.length) { // Mentre la posició sigui menor que la longitud del nom
            if (nom.get(posicio) != lletraPrincipal) // Si la lletra de la posició actual no és igual a la lletra principal
                valid = false
            posicio++
        }
        if (valid == false) println("SI") // Si la variable valid és false, imprimim "SI"
        else println("NO") // Si no, imprimim "NO"
    }







