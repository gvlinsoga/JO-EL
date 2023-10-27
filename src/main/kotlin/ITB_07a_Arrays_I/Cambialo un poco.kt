package ITB_07a_Arrays_I

/*A vegades et vols copiar d'algú i et diu la famosa frase "Te dejo copiar pero cambialo un poco para que el profesor no se de cuenta"

Entrada:
La primera línia indica els casos de prova a considerar Cada cas conté tres linies. La primera té un nombre 𝐾
, que diu el nombre de valors que hi ha. La segona, 𝐾 nombres separats per espai. La tercera tindrà dos nombres, 𝑃1 i 𝑃2

Sortida:
Torna la llista de nombres que t'han passat, exactament igual, en una sola línia, canviant tots els nombres 𝑃1
que apareguin per 𝑃2
 */

import java.util.*

fun main() {
    val casProva = Scanner(System.`in`).nextInt()
    for (i in 1..casProva) {
        val num = Scanner(System.`in`).nextInt()
        val array = IntArray(num)
        for (j in 0 until num) {
            array[j] = Scanner(System.`in`).nextInt()
        }
        val p1 = Scanner(System.`in`).nextInt()
        val p2 = Scanner(System.`in`).nextInt()
        for (j in 0 until num) {
            if (array[j] == p1) {
                array[j] = p2
            }
        }
        for (j in 0 until num) {
            print("${array[j]} ")
        }
        println()

    }
}