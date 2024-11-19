package ITB_12a_Col_leccions_II

/*
Santi s'està venint molt amunt (i concretament, molt amunt a la dreta) Vol desplaçar els arrays tant a la dreta com ell vulgui. Tenim por de que això desgarri el teixit de la realitat.

Entrada

El problema comença amb un nombre 𝐾
que diu el nombre de casos Cada cas son tres linies. El primer es 𝑁 que diu el tamany de l'array Després hi ha una línea amb 𝑁 nombres, tots ells valors enters entre 0 i 100. Per ultim un nombre 𝐷

que serà el desplaçament
Sortida

Es tornarà l'array, amb tots els números havent anat 𝐷

posicions a la dreta. Es considera que les posicions donen la volta i van al principi si superen el tamany de l'array primera

Exemple d'Entrada
3
5
1 2 3 4 5
1
6
1 2 3 4 5 6
2
6
1 2 3 4 5 6
6

Exemple de Sortida
5 1 2 3 4
5 6 1 2 3 4
1 2 3 4 5 6

 */


/*
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    for (i in 0..casos) {
        val num = scan.nextInt()
        val array = mutableListOf<Int>()
        for (j in 0 until num) {
            array.add(scan.nextInt())
        }
        val d = scan.nextInt()
        val mogut = d % n
        val arrayMogut = array.subList(n - mogut , n) + array.subList(0, n - mogut)
        println(arrayDesplacat.joinToString(" "))
    }
}


 */