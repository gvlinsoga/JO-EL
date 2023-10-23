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
    while (frase != "FIN") { //mentre la frase no sigui FIN
        var obert = 0
        var tancat = 0
        for (i in 0 until frase.length) {
            when (frase[i]) {
                '!' -> if (i == 0 || frase[i - 1] != '!') obert++ else tancat++
            }
        }
        println(if (obert == tancat) "SI" else "NO")
        frase = scanner.nextLine()
    }
}