package ITB_09c_Matrius_III

import java.util.Scanner

fun main() {
    val escaner = Scanner(System.`in`)
    val tamanyCasella = escaner.nextInt() // llegim el tamany de la casella

    for (fila in 0 until tamanyCasella) {
        for (columna in 0 until tamanyCasella) {
            // comprovem si és un límit o diagonal
            if (fila == 0 || fila == tamanyCasella - 1 || columna == 0 || columna == tamanyCasella - 1 || fila == columna || fila + columna == tamanyCasella - 1) {
                print("X") // mostrem X per a aquestes condicions
            } else {
                print(".") // mostrem . en la resta
            }
        }
        println() // canviem de línia després de cada fila
    }
}
