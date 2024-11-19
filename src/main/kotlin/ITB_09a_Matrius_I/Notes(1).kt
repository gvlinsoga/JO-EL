package ITB_09a_Matrius_I

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numCas = scanner.nextInt()

    repeat(numCas) {
        val estudiantes = scanner.nextInt()
        val modulos = scanner.nextInt()
        val grid = mutableListOf<List<Int>>()

        for (i in 0 until estudiantes) {
            val row = mutableListOf<Int>()
            for (j in 0 until modulos) {
                row.add(scanner.nextInt())
            }
            grid.add(row)
        }

        val averages = mutableListOf<Int>()

        for (row in grid) {
            val sum = row.sum()
            val average = sum / modulos
            averages.add(average)
        }

        println(averages.joinToString(" "))
    }
}
