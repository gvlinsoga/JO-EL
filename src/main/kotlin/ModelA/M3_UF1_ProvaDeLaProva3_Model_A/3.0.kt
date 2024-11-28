package M3_UF1_ProvaDeLaProva3_Model_A
/*
3.
Programa que rep per paràmetre els valors n i m, enters positius,
i crea una taula bidimensional d’n*m amb dos únics valors 0 i 1, on el valor 1 ocuparà les posicions
o elements que delimiten la taula, és a dir, les més externes, mentre que la resta dels elements contindran
el valor 0.

Exemple:
n = 3 m = 3
1 1 1
1 0 1
1 1 1

 */

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Por favor, proporciona dos parámetros enteros positivos: n y m")
        return
    }

    val n = args[0].toIntOrNull()
    val m = args[1].toIntOrNull()

    if (n == null || m == null || n <= 0 || m <= 0) {
        println("Ambos parámetros deben ser enteros positivos")
        return
    }

    // Crear la tabla bidimensional
    val tabla = Array(n) { IntArray(m) }

    // Rellenar la tabla con 1 en los bordes y 0 en el interior
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                tabla[i][j] = 1
            } else {
                tabla[i][j] = 0
            }
        }
    }

    // Imprimir la tabla
    for (fila in tabla) {
        println(fila.joinToString(" "))
    }
}