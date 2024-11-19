import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) // Inicializar el escáner para la entrada del usuario
    val numEntradas = scanner.nextInt() // Leer el número de entradas
    scanner.nextLine()

    repeat(numEntradas) {
        var contadorParte1: Array<Int> = arrayOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        var contadorParte2: Array<Int> = arrayOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        var sonIguales = true // Bandera para verificar si las partes son iguales

        val cadena = scanner.nextLine().uppercase() // Leer la cadena de entrada y convertir a mayúsculas
        val mitad1 = cadena.subSequence(0, cadena.length / 2) // Obtener la primera mitad de la cadena
        val mitad2: CharSequence

        // Verificar si la longitud de la cadena es par o impar y ajustar la segunda mitad
        if (cadena.length % 2 == 0) {
            mitad2 = cadena.subSequence(cadena.length / 2, cadena.length)
        } else {
            mitad2 = cadena.subSequence(cadena.length / 2 + 1, cadena.length)
        }

        // Contar las letras en la primera mitad
        repeat(mitad1.length) { i ->
            if (mitad1[i] != ' ') {
                contadorParte1[mitad1[i] - 'A']++
            } else {
                contadorParte1[26]++
            }
        }
        // Contar las letras en la segunda mitad
        repeat(mitad2.length) { j ->
            if (mitad2[j] != ' ') {
                contadorParte2[mitad2[j] - 'A']++
            } else {
                contadorParte2[26]++
            }
        }
        // Comparar las cuentas de letras de ambas mitades
        repeat(contadorParte1.size) { k ->
            if (contadorParte1[k] != contadorParte2[k]) {
                sonIguales = false
            }
        }
        // Imprimir el resultado basado en la comparación
        if (sonIguales) {
            println("SI")
        } else {
            println("NO")
        }
    }
}
