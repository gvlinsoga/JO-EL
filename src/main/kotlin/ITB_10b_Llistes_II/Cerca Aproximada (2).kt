package ITB_10b_Llistes_II

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCas = scan.nextInt() // llegim el cas de prova

    repeat(numCas) {
        val tamany = scan.nextInt() // llegim el tamany de la llista
        val midaSabatas = List(tamany) { scan.nextInt() } // llegim la mida de les sabates
        val midaPeu = scan.nextInt() // llegim la mida del peu
        val marge = scan.nextInt() // llegim el marge
        val sabatesAprox = midaSabatas.count { Math.abs(it - midaPeu) <= marge } // comptem les sabates que es poden aproximar
        println(sabatesAprox) // mostrem la quantitat de sabates que es poden aproximar
    }
}