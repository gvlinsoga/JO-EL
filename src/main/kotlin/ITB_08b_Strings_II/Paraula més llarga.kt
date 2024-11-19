import java.util.*

fun main() {
    val input = Scanner(System.`in`) // Crear escáner para leer la entrada
    val numberOfCases = input.nextInt() // Leer el número de casos
    input.nextLine() // Consumir el salto de línea sobrante

    repeat(numberOfCases) { // Iterar a través de cada caso
        val phrase = input.nextLine() // Leer la frase completa
        val words = phrase.split(" ") // Dividir la frase en palabras
        val longestWordLength = words.maxByOrNull { it.length }?.length ?: 0 // Encontrar la longitud de la palabra más larga
        println(longestWordLength) // Imprimir la longitud de la palabra más larga
    }
}
