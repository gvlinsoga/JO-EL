package M3_UF1_ProvaDeLaProva3_Model_A

/*
4.
Programa que rep de l’usuari dues matrius de 3*3.
Fes que el programa calculi el determinant de cada una d’elles, i tot seguit el resultat de la multiplicació d’ambdues.
 */


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Función para leer una matriz 3x3 del usuario
    fun leerMatriz(): Array<IntArray> {
        val matriz = Array(3) { IntArray(3) }
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                print("Introduce el valor para matriz[$i][$j]: ")
                matriz[i][j] = scanner.nextInt()
            }
        }
        return matriz
    }

    // Función para calcular el determinante de una matriz 3x3
    fun determinante(matriz: Array<IntArray>): Int {
        return matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]) -
                matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]) +
                matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0])
    }

    // Función para multiplicar dos matrices 3x3
    fun multiplicarMatrices(matriz1: Array<IntArray>, matriz2: Array<IntArray>): Array<IntArray> {
        val resultado = Array(3) { IntArray(3) }
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                resultado[i][j] = 0
                for (k in 0 until 3) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j]
                }
            }
        }
        return resultado
    }

    // Leer las dos matrices del usuario
    println("Introduce los valores para la primera matriz 3x3:")
    val matriz1 = leerMatriz()
    println("Introduce los valores para la segunda matriz 3x3:")
    val matriz2 = leerMatriz()

    // Calcular los determinantes
    val determinante1 = determinante(matriz1)
    val determinante2 = determinante(matriz2)

    // Multiplicar las matrices
    val matrizProducto = multiplicarMatrices(matriz1, matriz2)

    // Imprimir los resultados
    println("Determinante de la primera matriz: $determinante1")
    println("Determinante de la segunda matriz: $determinante2")
    println("Producto de las dos matrices:")
    for (fila in matrizProducto) {
        println(fila.joinToString(" "))
    }
}