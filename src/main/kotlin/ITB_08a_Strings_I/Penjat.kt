package ITB_08a_Strings_I

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() //numero de casos
    scanner.nextLine()

    repeat(casos) {//repetimos el bucle los casos de prueba que hemos puesto
        val palabraSecreta = scanner.nextLine().toCharArray() // escaneamos la palabra en un array de caracteres
        val intentos = scanner.nextLine().split(" ") // leemos los intentos

        val palabraDescubierta = CharArray(palabraSecreta.size) { '*' }
        var errores = 0 // creo una variable inicializada a 0

        for (letra in intentos) {
            if (letra.length == 1) { // verificar que el intento sea un solo carácter
                val caracter = letra[0] // obtener el carácter
                if (palabraSecreta.contains(caracter)) {
                    // si el carácter está en la palabra secreta, actualizar la palabra descubierta
                    for (j in palabraSecreta.indices) {
                        if (palabraSecreta[j] == caracter) {
                            palabraDescubierta[j] = caracter
                        }
                    }
                } else {
                    // si el carácter no está en la palabra secreta, contar como error
                    errores++
                }
            }
        }
        val palabraDescubiertaConvertida = palabraDescubierta.joinToString("") // convertimos el array a un string
        println("$palabraDescubiertaConvertida $errores") // imprimimos la palabra descubierta y los errores
    }
}
