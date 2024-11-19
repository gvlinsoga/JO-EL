import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numCasos = scanner.nextInt() // Número de casos a evaluar

    repeat(numCasos) {
        val tamanoManoPoker = 7 // Tamaño de la mano de poker
        val manoPoker = Array(tamanoManoPoker) { 0 } // Arreglo para almacenar la mano de poker

        // Leer los valores de la mano de poker
        for (i in manoPoker.indices) {
            manoPoker[i] = scanner.nextInt()
        }

        // Ordenar la mano de poker
        manoPoker.sort()

        var valoresConsecutivos = 1 // Contador de valores consecutivos
        var esEscalera = false // Indicador de si es escalera

        // Verificar si hay una escalera en la mano de poker
        for (i in 1 until manoPoker.size) {
            if (manoPoker[i] == manoPoker[i - 1] + 1) {
                valoresConsecutivos++
            } else if (manoPoker[i] != manoPoker[i - 1]) {
                valoresConsecutivos = 1
            }
            if (valoresConsecutivos >= 5) {
                esEscalera = true
            }
        }

        // Verificar si es una escalera real (royal flush)
        val esEscaleraReal = manoPoker.contains(10) && manoPoker.contains(11) &&
                manoPoker.contains(12) && manoPoker.contains(13) &&
                manoPoker.contains(1)

        // Determinar si es una escalera real
        val esEscaleraRealCompleta = esEscalera && esEscaleraReal

        // Imprimir el resultado según el tipo de mano de poker
        when {
            esEscaleraRealCompleta -> println("ESCALA REIAL")
            esEscalera -> println("ESCALA")
            else -> println("NO")
        }
    }
}
