import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numCasosDePrueba = scanner.nextInt() // Número de casos de prueba

    repeat(numCasosDePrueba) {
        val n = scanner.nextInt() // Tamaño de la lista de nombres
        val nombres = IntArray(n) // Array para almacenar los nombres

        // Leer los nombres y almacenarlos en el array
        for (i in 0 until n) {
            nombres[i] = scanner.nextInt()
        }

        // Ordenamos el array de nombres
        nombres.sort()

        // Creamos un array para almacenar las sumas de los nombres opuestos
        val sumaNombresOpuestos = IntArray(n / 2)

        // Calcular la suma de los nombres opuestos
        for (i in 0 until n / 2) {
            val suma = nombres[i] + nombres[n - i - 1] // Suma de nombres opuestos
            sumaNombresOpuestos[i] = suma // Agregar la suma al array
        }

        // Imprimir las sumas separadas por espacio
        println(sumaNombresOpuestos.joinToString(" "))
    }
}
