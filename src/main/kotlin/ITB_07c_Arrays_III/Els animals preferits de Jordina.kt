fun main() {
    val numCasosDePrueba = readLine()!!.toInt() // Número de casos de prueba

    repeat(numCasosDePrueba) {
        val n = readLine()!!.toInt() // Número de animales en la colección
        val coleccionAnimales = mutableSetOf<String>() // Colección de animales favoritos

        repeat(n - 1) {
            val animal = readLine()!! // Leer el nombre del animal
            coleccionAnimales.add(animal) // Agregar el animal a la colección
        }

        val animalBuscado = readLine()!! // Animal que se busca

        // Verificar si el animal buscado está en la colección
        if (coleccionAnimales.contains(animalBuscado)) {
            println("SI")
        } else {
            println("NO")
        }
    }
}
