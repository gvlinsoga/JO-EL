package M3_UF1_ProvaDeLaProva3_Model_B

/*
4.
Programa que donada una matriu de mida n*n digui si existeix un camí format per 1s,
des de la primera fila a l'última.
Es considera un camí quan es pot anar de dalt a baix de la matriu seguint els nombres 1,
i aquests són adjacents, vertical u horitzontalment (no en diagonal).

Entrada:

7
1 0 1 0 1 1 0
1 0 0 1 0 1 1
0 1 1 0 0 0 1
0 1 0 1 1 1 1
1 0 0 0 1 0 1
1 0 1 0 1 1 0
1 1 0 1 1 0 1

Sortida:
Sí que existeix un camí

Entrada:

5
1 0 1 0 1
1 0 0 1 0
0 1 1 0 0
0 1 0 1 1
1 0 0 0 1

Sortida:
No existeix un camí

 */

fun main() {
    val n = readLine()!!.toInt()
    val matrix = Array(n) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    var found = false
    for (i in 0 until n) {
        if (matrix[0][i] == 1) {
            found = findPath(matrix, 0, i, Array(n) { BooleanArray(n) })
            if (found) break
        }
    }
    if (found) {
        println("Sí que existeix un camí")
    } else {
        println("No existeix un camí")
    }
}

fun findPath(matrix: Array<IntArray>, row: Int, col: Int, visited: Array<BooleanArray>): Boolean {
    val n = matrix.size
    if (row == n - 1) return true
    visited[row][col] = true

    val directions = arrayOf(
        intArrayOf(0, 1),  // right
        intArrayOf(1, 0),  // down
        intArrayOf(0, -1), // left
        intArrayOf(-1, 0)  // up
    )

    for (dir in directions) {
        val newRow = row + dir[0]
        val newCol = col + dir[1]
        if (newRow in 0 until n && newCol in 0 until n && matrix[newRow][newCol] == 1 && !visited[newRow][newCol]) {
            if (findPath(matrix, newRow, newCol, visited)) return true
        }
    }
    return false
}