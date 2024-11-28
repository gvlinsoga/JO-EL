package ITB_10b_Llistes_II

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var numFilas = scanner.nextInt()

    while (numFilas != 0) {  // Mentre el nombre de files no sigui 0
        val alçades = IntArray(numFilas)

        // Llegir les alçades de cada fila
        for (i in 0 until numFilas) {
            alçades[i] = scanner.nextInt()
        }

        // Inicialitzar les variables per comptar les files visibles
        var maxVisibles = 1 // Inicialment assumim que almenys una fila és visible
        var maxAlçada = alçades[numFilas - 1] // Inicialment, la fila més propera és visible

        // Iterar des de la segona fila més propera fins a la fila més llunyana
        for (i in (numFilas - 2) downTo 0) {
            // Comprovar si la fila actual és més alta que la fila més propera visible
            if (alçades[i] > maxAlçada) {
                // Incrementar el comptador de files visibles
                maxVisibles++

                // Actualitzar l'alçada màxima amb l'alçada de la fila actual
                maxAlçada = alçades[i]
            }
        }

        // Imprimir el nombre màxim de files visibles per al cas actual
        println(maxVisibles)

        // Llegir el següent nombre de files per continuar o finalitzar
        numFilas = scanner.nextInt()
    }
}
