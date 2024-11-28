package `M3_UF1_Prova P2_DAM_B`

/*

1. Programa que obté el quocient i la resta de dos nombres sencers positius mitjançant restes.

 */


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Solicitar al usuario los dos números enteros positivos
    println("Introduce el primer número entero positivo:")
    var dividend = scanner.nextInt()

    println("Introduce el segundo número entero positivo:")
    val divisor = scanner.nextInt()

    // Variables para almacenar el cociente y el residuo
    var cociente = 0
    var residuo = dividend

    // Asegurarse de que el divisor sea mayor que 0
    if (divisor > 0) {
        // Realizar la división mediante restas sucesivas
        while (residuo >= divisor) {
            residuo -= divisor
            cociente++
        }
    } else {
        println("El divisor debe ser mayor que 0.")
        return
    }

    // Mostrar el cociente y el residuo
    println("El cociente es: $cociente")
    println("El residuo es: $residuo")
}
