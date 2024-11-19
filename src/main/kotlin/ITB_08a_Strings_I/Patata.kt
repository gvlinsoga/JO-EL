package ITB_08a_Strings_I

import java.util.*

fun main() {
    val scaner = Scanner(System.`in`)
    val numCasos = scaner.nextInt() // num de casos
    scaner.nextLine() //hacemos un salto para leer el texto

    //iteramos los casos de prueba
    repeat(numCasos) {
        val fraseOriginal: String = scaner.nextLine().lowercase() // Leemos cada frase
        var esPatata = "patata" == fraseOriginal // Verificamos si la palabra "patata" es igual a la fraseOriginal


        if (esPatata) { //en caso de true imprimimos Es patata
            println("Es Patata")
        } else { //en caso false imprimimos No es patata
            println("No es Patata")
        }
    }
}