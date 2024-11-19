package ITB_09c_Matrius_III
import java.util.Scanner
fun main() {
    val scan = Scanner(System.`in`)
    val f = scan.nextInt() //llegim el cas de prova fila
    val c = scan.nextInt() //llegim el cas de prova columna

    val matriz = Array(f) { Array(c) { 0 } } //creem la matriu

    //iterem sobre el cas de prova de fila
    for (i in 0 until f) {
        //iterem sobre el cas de prova columna
        for (j in 0 until c) {
            matriz[i][j] = scan.nextInt() //llegim els nums de la matriu
        }
    }
    for (i in 0 until c) {
        for (j in 0 until f) {
            print("${matriz[j][i]} ")
        }
        println()
    }
}

