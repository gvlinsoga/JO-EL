package ITB_10b_Llistes_II

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCas = scan.nextInt() //llegim el num de casos
    scan.nextLine() // fem un salt de línia
    // iterem sobre cada cas de prova
    repeat(numCas) {
        val noms = scan.nextLine().split(" ").toMutableList() // llegim els noms i els guardem en una llista mutable
        val nomVetat = scan.nextLine() // llegim el nom vetat
        val primeraPosicio = noms.indexOf(nomVetat) // busquem la primera posició del nom vetat
        noms.removeAll { it == nomVetat } // eliminem tot el nom vetat de la llista
        if (primeraPosicio != -1) {  // si la primera posició és diferent de -1 afegim el nom vetat a la primera posició
            noms.add(primeraPosicio, nomVetat)
        } else {
            noms.add(nomVetat) // si no, afegim el nom vetat a la llista
        }
        println(noms) //imprimim la llista
    }
}
