package ITB_06b_Bucles_II
/*
Implementa un programa que llegeix n números enters i ens diu quants d’ells són positius.

Entrada:
La primera línia conté un nombre n que indica el nombre de números a tractar. L'entrada continua amb una seqüencia de n nombres a processar. Cada nombre es troba en una línia diferent.

Sortida:
Indica el total de nombre positius tractats
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()
    var negatius = 0
    var positius = 0

    for (num in 1 .. casProva) { //per cada cas de prova es repeteix el bucle
        val nums = scanner.nextInt()//Llegeix el nums
        if (nums > 0) {
            positius++ //Suma a la variable positius el nums positius (nums>0)
        } else {
            negatius++ //En càs contrari els suma als negatius (nums<0)
        }

    }
    println(positius) //Imprimeix els nums positius que demana l'exercici
}