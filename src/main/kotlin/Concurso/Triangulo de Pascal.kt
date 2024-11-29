package Concurso

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Leer el número de filas para el Triángulo de Pascal
    val n = scanner.nextInt()

    // Inicializar el triángulo
    val triangle = mutableListOf<MutableList<Int>>()

    // Generar el Triángulo de Pascal
    for (i in 0 until n) {
        val row = MutableList(i + 1) { 1 } // Crear fila con 1s
        for (j in 1 until i) {
            // Los elementos intermedios son la suma de dos números de la fila anterior
            row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
        }
        triangle.add(row)
    }

    // Imprimir el triángulo
    for (row in triangle) {
        println(row.joinToString(" "))
    }

    // Calcular y mostrar la suma de la última fila
    val sumLastRow = triangle.last().sum()
    println("Suma: $sumLastRow")
}
