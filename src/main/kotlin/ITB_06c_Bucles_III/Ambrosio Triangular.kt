package ITB_06c_Bucles_III

/*
Isabel Preysler t’ha demanat fer una torre de Ferrero Rocher per a la recepció de l’ambaixador.
La torre ha de ser en forma de piràmide triangular.
Això significa que el primer pìs tindrà un Ferrero, el segon 3, el tercer 6, el quart 10, i així.
(cada pis es un triangle amb una fila extra)

Entrada:
La primera línia indica els casos de prova a considerar Cada cas és una línia amb 1 nombre, consistent amb el nombre de pisos que vols que la piràmide tingui

Sortida:
Per cada cas de prova caldrà respondre: El nombre de ferreros necessari per a construir la piràmide (no el nombre del pis, sino tots)
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    repeat(casProva){ // per cada cas de prova es repeteix el bucle
        val num = scanner.nextInt()
        var bombons = 0 // inicialitzem el nombre de bombons a 0
        for (j in 1..num) {
            bombons = bombons + j * (j + 1) / 2 // fem la suma dels nombres del 1 fins al nombre de pisos
        }
        println(bombons)
    }
}