package ITB_09c_Matrius_III

import java.util.Scanner

fun main() {
    val escaner = Scanner(System.`in`)
    val tamanyMatriu = escaner.nextInt() // llegim el tamany de la matriu
    var matriu = Array(tamanyMatriu) { Array(tamanyMatriu) { 0 } }

    for (fila in 0 until tamanyMatriu) {
        for (columna in 0 until tamanyMatriu) {

            if (matriu[fila] == matriu[columna]) {
                print(" 1 ")
            } else {
                print(" 0 ")
            }
        }
        println() // canviem de línia després de cada fila
    }
}
