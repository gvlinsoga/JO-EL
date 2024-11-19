package ITB_09c_Matrius_III

import java.util.*

fun main() {
    val escaner = Scanner(System.`in`)
    val numCasos = escaner.nextInt() // num de casos de prova

    repeat(numCasos) {
        val f = escaner.nextInt() // nombre de files de la casa
        val c = escaner.nextInt() // nombre de columnes de la casa
        val numFantasmes = escaner.nextInt() // nombre de fantasmes

        val posicioFantasmes = mutableListOf<Pair<Int, Int>>() // llista de posicions dels fantasmes
        for (i in 0 until numFantasmes) {
            val x = escaner.nextInt()
            val y = escaner.nextInt()
            posicioFantasmes.add(x to y) // afegeix cada fantasma a la llista
        }

        val esPotMoure = posicioFantasmes.any { (x, y) -> x == 0 || x == f - 1 || y == 0 || y == c - 1 } // comprova si es pot moure


        // imprimeix el resultat segons si es pot moure o no
        if (esPotMoure) {
            println("TOT VA BÉ")
        } else {
            println("OH NO")
        }
    }
}
