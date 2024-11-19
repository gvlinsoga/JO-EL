package ITB_09b_Matrius_II

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val testCases = scan.nextInt()

    repeat(testCases) {
        val rows = scan.nextInt()
        val columns = scan.nextInt()
        val cats = Array(rows) { Array(columns) { 0 } }

        for (row in cats.indices) {
            for (column in cats[row].indices) {
                cats[row][column] = scan.nextInt()
            }
        }

        var catsInLineCounter = 0

        for (row in cats.indices) {
            for (cat in cats[row].indices) {
                if (cat - 1 in 0 until cats[row].size && cat + 1 in 0 until cats[row].size &&
                    row - 1 in 0 until cats.size && row + 1 in 0 until cats.size
                ) {
                    if (cats[row][cat] == 1 && cats[row - 1][cat - 1] == 1 && cats[row + 1][cat + 1] == 1) {
                        catsInLineCounter++
                        cats[row][cat - 1] = 0
                        cats[row][cat] = 0
                        cats[row][cat + 1] = 0
                    }
                }

                if (row - 1 in 0 until cats.size && row + 1 in 0 until cats.size) {
                    if (cats[row - 1][cat] == 1 && cats[row][cat] == 1 && cats[row + 1][cat] == 1) {
                        catsInLineCounter++
                        cats[row - 1][cat] = 0
                        cats[row][cat] = 0
                        cats[row + 1][cat] = 0
                    }
                }

                if (cat - 1 in 0 until cats[row].size && cat + 1 in 0 until cats[row].size) {
                    if (cats[row][cat - 1] == 1 && cats[row][cat] == 1 && cats[row][cat + 1] == 1) {
                        catsInLineCounter++
                        cats[row][cat - 1] = 0
                        cats[row][cat] = 0
                        cats[row][cat + 1] = 0
                    }
                }
            }
        }

        println(catsInLineCounter)
    }
}
