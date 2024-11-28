package `M3_UF1_Prova P2_DAM_B`

/*
3. Programa que demana dos valors numèrics a l’usuari (x i N) i calcula la mitjana harmònica i la mitja quàntica:

 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Solicitar los valores numéricos al usuario
    println("Introduce el valor de x:")
    val x = scanner.nextDouble()

    println("Introduce el valor de N:")
    val N = scanner.nextDouble()

    // Calcular la media armónica
    val mediaArmonica = 2 / (1 / x + 1 / N)

    // Calcular la media cuadrática
    val mediaCuadratica = Math.sqrt((x * x + N * N) / 2)

    // Imprimir los resultados
    println("La media armónica es: $mediaArmonica")
    println("La media cuadrática es: $mediaCuadratica")
}