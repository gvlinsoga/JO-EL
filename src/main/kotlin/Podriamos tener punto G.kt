import java.util.*

fun main() {
    var contadorG = 0
    val scanner = Scanner(System.`in`)

    repeat(5) {
        var letras = scanner.nextLine()
        if (letras == "G") {
            contadorG++
        }
    }

    when (contadorG) {
        0 -> println("NO")
        1 -> println("SI")
        else -> println("PUNTOS")
    }
}
