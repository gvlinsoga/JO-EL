package ITB_06d_Bucles_IV

/*Fes un programa que llegeixi una frase. La sortida ens diu la quantitat de vegades que apareix cada vocal (tant majúscula com minúscula).
Entrada

La primera línia indica els casos de prova a considerar. Cada cas conté una frase.
Sortida

Per cada cas de prova caldrà respondre: A: xxx E: xxx I: xxx O: xxx U: xxx
Exemple d'Entrada
Copy

2
Estem contant el nombre de vocals
En aqUesta frase hI ha totes les vOcAls

Exemple de Sortida
Copy

A: 2 E: 5 I: 0 O: 3 U: 0
A: 5 E: 5 I: 1 O: 2 U: 1
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()
    scanner.nextLine()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val frase = scanner.nextLine()
        var a = 0
        var e = 0
        var i = 0
        var o = 0
        var u = 0
        for (j in 0 until frase.length) {
            when (frase[j]) {
                'a', 'A' -> a++
                'e', 'E' -> e++
                'i', 'I' -> i++
                'o', 'O' -> o++
                'u', 'U' -> u++
            }
        }
        println("A: $a E: $e I: $i O: $o U: $u")
    }
}
