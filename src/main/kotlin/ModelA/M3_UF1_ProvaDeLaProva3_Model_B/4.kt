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
            found = findPath(matrix, 0, i)
            if (found) break
        }
    }
    if (found) {
        println("Sí que existeix un camí")
    } else {
        println("No existeix un camí")
    }