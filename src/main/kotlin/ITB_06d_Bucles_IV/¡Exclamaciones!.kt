package ITB_06d_Bucles_IV

/*
Marc nunca se acuerda de abrir las exclamaciones. Él dice que es porque en catalán no se abren las exclamaciones pero yo creo que simplemente no sabe escribir. Vamos a crear un programa que asegure que hay tantos abrir exclamación como cerrar exclamación para flamearlo.
Entrada

Cada caso es una línea de texto. El programa (y por tanto el bucle) acaba cuando la línea és "FIN", que no debe procesarse.
Sortida

Por cada caso, responde SI si hay tantos abrir exclamación como cerrar exclamación y NO en caso contrario
Exemple d'Entrada
Copy

¡¡¡Caramba!!!
Hola!
no.
!!!Caramba¡¡¡
FIN

Exemple de Sortida
Copy

SI
NO
SI
SI


 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var frase = scanner.nextLine()

    while (frase != "FIN") { // Mentre la frase no sigui FIN
        var obert = 0 // Comptador de signes d'obertura
        var tancat = 0 // Comptador de signes de tancament

        for (i in 0 until frase.length) {
            when (frase[i]) {
                '¡' -> obert++ // Comptar signe d'obertura
                '!' -> tancat++ // Comptar signe de tancament
            }
        }

        // Imprimeix "SI" si hi ha la mateixa quantitat de signes d'obertura i tancament, si no "NO"
        println(if (obert == tancat) "SI" else "NO")
        frase = scanner.nextLine() // Llegir la següent línia
    }
}



//AYUDA
//
//Te falla un caso con el Input:
//
//!¡!¡!¡!¡
//
//
//
//Tu respuesta es:
//
//NO