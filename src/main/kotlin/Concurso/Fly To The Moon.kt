package Concurso

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        // Leer el número de materiales
        val n = scanner.nextInt()
        if (n == 0) return

        // Leer los pesos de los materiales
        val pesos = mutableListOf<Int>()
        for (i in 1..n) {
            pesos.add(scanner.nextInt())
        }

        // Calcular el combustible necesario
        var pesoTotal = pesos.sum()
        var combustibleTotal = 0

        // Recalcular teniendo en cuenta el peso del combustible
        while (combustibleTotal != (pesoTotal + 6) / 7) {
            combustibleTotal = (pesoTotal + 6) / 7
            pesoTotal += combustibleTotal
        }

        // Imprimir el combustible total necesario
        println(combustibleTotal)
    }
}
