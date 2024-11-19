package ITB_08a_Strings_I

import java.util.Scanner

fun main() {
    val escaner = Scanner(System.`in`)
    val numCasos = escaner.nextInt() // num de casos

    repeat(numCasos+1) {
        val fraseOriginal: String = escaner.nextLine() // Leemos cada frase
        var fraseModificada = "" // Creamos una cadena vacía para almacenar la frase modificada

        for (caracter in fraseOriginal) { // Recorremos cada carácter de la frase original
            when (caracter) {
                'b' -> fraseModificada = fraseModificada + 'v' // Si encontramos 'b', lo cambiamos por 'v'
                'v' -> fraseModificada = fraseModificada + 'b' // Si encontramos 'v', lo cambiamos por 'b'
                'B' -> fraseModificada = fraseModificada + 'V' // Si encontramos 'B', lo cambiamos por 'V'
                'V' -> fraseModificada = fraseModificada + 'B' // Si encontramos 'V', lo cambiamos por 'B'
                else -> fraseModificada = fraseModificada + caracter // Mantenemos los otros char
            }
        }

        println(fraseModificada) // imprimir la frase modificada
    }
}
