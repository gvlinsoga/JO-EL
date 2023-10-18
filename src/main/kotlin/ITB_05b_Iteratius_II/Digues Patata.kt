package ITB_05b_Iteratius_II/*Científics de tot el món s’han reunit per saber quina és la millor forma de prendre fotos de grup. Alguns diuen que s’ha de fer dir al grup “lluis”, i alguns altres “patata”. Has de fer un programa que digui aquestes paraules per veure com semblen.
Entrada:
La primera línia indica els casos de prova a considerar Cada cas compta amb 1 linea
Sortida:
Per cada cas de prova caldrà respondre: La linea que s’ha entrat
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt() //llegim el nums de proves que es vol fer
    for (prova in 1..casProva) { // repeteix el blucle fins al num de proves "casProva"
        val frase = scanner.next() //LLegim la frase
        println(frase) //imprimim la frase
    }
}