package ITB_07a_Arrays_I

/*A vegades et vols copiar d'algú i et diu la famosa frase "Te dejo copiar pero cambialo un poco para que el profesor no se de cuenta"
Entrada

La primera línia indica els casos de prova a considerar Cada cas conté tres linies. La primera té un nombre 𝐾
, que diu el nombre de valors que hi ha. La segona, 𝐾 nombres separats per espai. La tercera tindrà dos nombres, 𝑃1 i 𝑃2

Sortida

Torna la llista de nombres que t'han passat, exactament igual, en una sola línia, canviant tots els nombres 𝑃1
que apareguin per 𝑃2
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val k = scanner.nextInt() //llegim el nombre de valors que hi ha
        val array = IntArray(k) //creem l'array
        for (j in 0 until k) {    //llegim l'array
            array[j] = scanner.nextInt() //llegim cada element de l'array
        }
        val p1 = scanner.nextInt() //llegim el nombre que volem canviar
        val p2 = scanner.nextInt() //llegim el nombre pel qual volem canviar
        for (l in 0 until k) { //escrivim l'array
            if (array[l] == p1) { //si l'element de l'array és igual al nombre que volem canviar
                print("$p2 ") //escrivim el nombre pel qual volem canviar
            } else {
                print("${array[l]} ") //escrivim l'element de l'array
            }
        }
        println()//escrivim un salt de línia
    }

}