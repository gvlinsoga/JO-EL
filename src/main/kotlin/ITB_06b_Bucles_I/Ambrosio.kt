package ITB_06b_Bucles_I/*Isabel Preysler t’ha demanat fer una torre de Ferrero Rocher per a la recepció de l’ambaixador.
La torre ha de ser en forma de piràmide quadrada.
Això significa que el primer pis tindrà un Ferrero, el segon 4, el tercer 9, el quart 16, i així succesivament
(cada pis és un quadrat amb un més a cada cantó)

Entrada:
La primera línia indica els casos de prova a considerar
Cada cas és una línia amb 1 número, consistent amb el nombre de pisos que vols que la piràmide tingui

Sortida:
Per cada cas de prova caldrà respondre:
El nombre de bombons necessaris per a construir la piràmide
(no els bombons del pis que fa de base, sinó tots els bombons que fan falta per fer la piràmide).
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val num = scanner.nextInt()
        var bombons = 0 //inicialitzem el nombre de bombons a 0
        for (j in 1..num) {
            bombons += j * j //fem la suma dels quadrats dels nombres del 1 fins al nombre de pisos
        }
        println(bombons)
    }

}