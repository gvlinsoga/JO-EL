fun main() {
    // Leer el número de casos de prueba
    val numCasosDePrueba = readLine()!!.toInt()

    // Iterar a través de cada caso de prueba
    repeat(numCasosDePrueba) {
        // Leer el número de opciones y los votos para cada opción
        val entrada = readLine()!!.split(" ").map { it.toInt() }
        val numOpciones = entrada[0]
        val votos = entrada.subList(1, numOpciones + 1)

        // Determinar la opción ganadora (la que tiene más votos)
        val indiceGanador = votos.indexOf(votos.max()) + 1

        // Imprimir el número de la opción ganadora
        println(indiceGanador)
    }
}
