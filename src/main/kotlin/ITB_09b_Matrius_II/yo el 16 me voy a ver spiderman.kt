package ITB_09b_Matrius_II

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val f = scan.nextInt() //llegim el cas de prova fila
    val c = scan.nextInt() //llegim el cas de prova columna
    //iniciem la fila i columna de spiderman
    var filaSpiderman = -1
    var columnaSpiderman = -1
    val matriz = Array(f) { Array(c) { "" } } //creem la matriu

    //iterem sobre el cas de prova de fila
    for (i in 0 until f) {
        //iterem sobre el cas de prova columna
        for (j in 0 until c) {
            matriz[i][j] = scan.next() //llegim la paraula de la matriu
            if (matriz[i][j] == "SPIDERMAN") { //si la paraula es SPIDERMAN guardem la fila i columna
                filaSpiderman = i
                columnaSpiderman = j
            }
        }
    }
    if (filaSpiderman == 0) {
        println("NO")
    } else {
        println(matriz[filaSpiderman - 1][columnaSpiderman])
    }
}


