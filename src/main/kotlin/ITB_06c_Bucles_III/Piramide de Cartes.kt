package ITB_06c_Bucles_III
/*
A Bambino li agrada jugar a cartes i l’Egipte dels faraons, ... i per això, de tant en tant, li dona per fer piràmides de cartes. Les piràmides són com la de la foto.
Entrada

L’entrada comença amb un número indicant la quantitat de casos de prova que vindran a continuació. Cada cas de prova consta d’una línia amb el número de cartes de que disposa Bambino (enter positiu i menor que 1000)
Sortida

Per cada cas de prova, caldrà respondre, en una línia amb dos valors:

Alçada de la piràmide de cartes que es pot aconseguir
Número de cartes que sobren (és a dir, les cartes que no es poden posar perquè no arriben a completar un nivell (residu).
 */


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val danyInicial = scanner.nextInt()
        val explosions = scanner.nextInt()
        var dany = danyInicial //inicialitzem el dany a l'inicial
        var danyTotal = 0 //inicialitzem el dany total a 0

        for (quantitat in 1..explosions) { //per cada explosió
            danyTotal += dany //sumem el dany al dany total
            dany += danyInicial //sumem el dany inicial al dany
        }
        println(danyTotal)
    }