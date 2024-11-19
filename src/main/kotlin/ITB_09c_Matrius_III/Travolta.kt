package ITB_09c_Matrius_III

import java.util.*

fun main() {
    val escaner = Scanner(System.`in`)

    // llegeix el nombre de files, columnes i el num que busca travolta
    val f = escaner.nextInt()
    val c = escaner.nextInt()
    val t = escaner.nextInt()
    var trobat = false  // variable per comprovar si es cumpleix
    val matriu = Array(f) { Array(c) { 0 } } // creem una matriu per emmagatzemar els valors

    for (fila in 0 until f) { // iterem sobre les files
        for (columna in 0 until c) { // iterem sobre les columnes
            matriu[fila][columna] = escaner.nextInt() // llegim els valors de la matriu
        }
    }
    for (fila in 0 until f) { // iterem sobre les files
        for (columna in 0 until c - 2) { // iterem sobre les columnes
            if (matriu[fila][columna] == t && matriu[fila][columna + 2] == t) { // comprovem si es compleix
                trobat = true // si es compleix, canviem la variable a true
                println("${matriu[fila][columna + 1]}") // imprimeix el valor de la columna central
            }
        }
    }
    if (!trobat) { // si no s'ha trobat cap valor, imprimeix NO
        println("NO")
    }
}
