package ITB_07a_Arrays_I

/*
Un cop la meva opinió sobre els arrays ha quedat clara, anem a canviar una mica. Modificarem l'array abans d'escriure'l. Això significa que primer hauras de fer un bucle per llegir l'array, i després un altre bucle per modificar-ho. No pots fer-ho només amb un sol bucle. Sad.
Entrada

El problema serà de tres línies. La primera tindrà un nombre, 𝐾
que et dirà el tamany de l'array que has de crear La segona son 𝐾 nombres, separats per espais que et dirà el contingut de l'array que has de llegir. La tercera serà 𝑁

, un valor a sumar a tots els elements de l'array
Sortida

Tornaràs l'array sencer escrit, amb espais entre cada caràcter, després d'haver sumat 𝑁

a cada posició.
Exemple d'Entrada

6
23 2 -4 0 42 69420
2

Exemple de Sortida

25 4 -2 2 44 69422

 */

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val tamany = scan.nextInt() //tamany array
    val array = arrayOfNulls<Int>(tamany) //creem l'array

    //Fem un bucle per llegir l'array de Strings
    for (i in 0 .. tamany -1 ) {    //llegim l'array
        array[i] = scan.nextInt() //llegim cada element de l'array
    }
    val numSuma = scan.nextInt() //llegim el num a sumar
    for (j in 0 .. tamany -1) { //escrivim l'array
        array[j] = array[j]?.plus(numSuma)
    print("${array[j]}") //escrivim cada element de l'array mes el num a sumar
    }
}
