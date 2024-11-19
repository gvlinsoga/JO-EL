package ITB_07a_Arrays_I

/*

Generalment els programes d'ordinador donen els % fent servir un número entre 0 i 1. Però això és difícil d'entendre per als humans. És molt més comprensible 72% que 0.72

Entrada:
El problema comença amb un número 𝑁
que diu el tamany de l'array que cal fer servir. Després hi ha una línea amb 𝑁
valors, tots ells entre 0 i 1, amb no més de 2 decimals. Els valors es poden llegir amb un nextDouble().

Sortida:
Es tornarà l'array sencer, a on cada número s'ha transformat en la seva representació en %, afegint el caràcter de % al final.

*/

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val k = scan.nextInt() //tamany array
    val array = DoubleArray(k) //creem l'array
    for (i in 0 until k) {    //llegim l'array
        array[i] = scan.nextDouble() //llegim cada element de l'array
    }
    for (j in 0 until k) { //escrivim l'array
        print("${array[j] * 100}% ") //escrivim cada element de l'array
    }

}