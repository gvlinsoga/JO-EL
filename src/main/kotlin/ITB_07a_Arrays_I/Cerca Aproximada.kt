package ITB_07a_Arrays_I
/*
El Cap d'estudis m'ha cridat l'atenció per les sabates que duc, que estan totalment trencades. He intentat convèncer-lo de que les sabates trencades son l'evolució lògica dels texans estripats i que per tant vaig a la moda, pero m'ha dit que em compri unes noves sabates. Jo calço un 42, pero realment un 41 o un 43 ja em van bé.

Entrada:
El problema comença amb un nombre 𝑁
que diu quants casos té. Cada cas son 3 línies. La primera té un nombre 𝐾 amb el tamany de l'array de sabates. Després 𝐾 nombres amb la mida de totes les sabates. Tots entre 8 i 60. per últim un nombre 𝑀 amb la meva mida

Sortida:
Si hi ha unes sabates a l'array que vagin aproximadament bé. es respondrà "SI", sinó, "NO". Es considera aproximadament bé quan és igual a M, un menys, o un més.
 */

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt() //llegim el nombre de casos
    for (i in 1..casos) { //per cada cas
        val tamany = scan.nextInt() //llegim el tamany de l'array
        val array = IntArray(tamany) //creem l'array
        for (j in 0 .. tamany -1) { //llegim l'array
            array[j] = scan.nextInt() //llegim cada element de l'array
        }

        val mida = scan.nextInt() //llegim la mida de les sabates
        var trobat = false //inicialitzem la variable trobat a false

        for (j in 0 .. tamany -1) { //per cada element de l'array
            if (array[j] == mida || array[j] == mida - 1 || array[j] == mida + 1) { //si l'element de l'array es igual a la mida, o un mes o un menys
                trobat = true //canviem la variable trobat a true
            }
        }
        if (trobat) { //si trobat es true
            println("SI") //escrivim SI
        } else { //si trobat es false
            println("NO") //escrivim NO
        }
    }
}