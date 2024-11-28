package ITB_10b_Llistes_II

import java.util.*

fun main() {
    val escaner = Scanner(System.`in`)
    val numero = escaner.nextLine().trim()
    var repeticiones = 0
    var esCapicua = true

    var digito = 0 // Inicializar el dígito a 0
    while (digito < numero.length / 2 && esCapicua) { // Mientras el dígito sea menor a la mitad del número y sea capicua
        if (numero[digito] != numero[(numero.length - 1) - repeticiones]) { // Si el dígito actual no es igual al dígito en la posición contraria
            esCapicua = false // No es capicua
        }
        digito++ // Aumentar el dígito
        repeticiones++ // Aumentar las repeticiones
    }

    // Imprimir el resultado según si es capicua o no
    if (esCapicua) {
        println("SI")
    } else {
        println("NO")
    }
}