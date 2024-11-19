import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val duracio = scanner.nextInt()
    val marge = scanner.nextInt()
    val hora = scanner.nextInt()
    val minuts = scanner.nextInt()

    // Calcular el total de minuts d'arribada
    val minutsArribada = hora * 60 + minuts

    // Calcular el temps de la pel·lícula en el moment d'arribada
    val tempsPellicula = minutsArribada % duracio

    // Comprovar si Pol es queda a veure la pel·lícula o marxa
    if (tempsPellicula < marge) {
        println("VEURE")
    } else {
        println("MARXAR")
    }
}

