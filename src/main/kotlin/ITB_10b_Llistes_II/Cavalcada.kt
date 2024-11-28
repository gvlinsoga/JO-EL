package ITB_10b_Llistes_II


import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    var mida = scan.nextInt() // llegim el tamany inicial de la llista
    while (mida != 0) { // mentre el tamany no sigui 0
        val alçades = List(mida) { scan.nextInt() } // llegim les alçades max de cada filera
        var visibles = 0 // comptador de files visibles
        var alçadaMax = Int.MIN_VALUE  // alçada màxima observada fins ara

        for (alçada in alçades) { // per cada alçada de la llista
            if (alçada > alçadaMax) {
                visibles++ // si l'alçada és més gran que l'alçada max, incrementem el nombre de fileres visibles
                alçadaMax = alçada // actualitzem l'alçada màxima
            }
        }

        println(visibles) // mostrem el nombre de fileres visibles

        mida = scan.nextInt() // llegim el següent cas de prova
    }
}






























