fun main() {
    // Leer el número de casos de prueba
    val numCasosDePrueba = readLine()!!.toInt()

    // Iterar a través de cada caso de prueba
    repeat(numCasosDePrueba) {
        // Leer el valor K
        val k = readLine()!!.toInt()

        // Leer la lista de números y convertirla a un arreglo de enteros
        val numeros = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

        // Leer el valor P
        val p = readLine()!!.toInt()

        // Multiplicar cada número de la lista por P
        for (i in 0 until k) {
            numeros[i] *= p
        }

        // Imprimir la lista resultante
        println(numeros.joinToString(" "))
    }
}
