import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`) // Creamos un Scanner para la entrada estándar

    val numCasosDePrueba = scanner.nextInt() // Leemos el número de casos de prueba

    repeat(numCasosDePrueba) {
        val posicionInicial = scanner.nextInt() // Leemos la posición inicial del juego
        val tiradas = Array(3) { scanner.nextInt() } // Leemos las tres tiradas

        var posicionActual = posicionInicial // Inicializamos la posición actual del jugador

        for (i in 0 until 3) {
            val nuevaPosicion = posicionActual + tiradas[i] // Calculamos la nueva posición

            // Determinamos la posición final después de cada tirada
            posicionActual = when {
                nuevaPosicion == 8 || posicionActual == 8 -> 8 // Si llega a la casilla 8, se queda ahí
                nuevaPosicion > 8 -> 8 - (nuevaPosicion - 8) // Si se pasa de la casilla 8, retrocede
                else -> nuevaPosicion // En cualquier otro caso, avanza a la nueva posición
            }
        }

        println(posicionActual) // Imprimimos la posición final del jugador después de las tres tiradas
    }
}
