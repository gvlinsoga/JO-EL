package ITB_12a_Col_leccions_I

/*
Estas a l'espai amb uns altres astronautes i has de fer el manteniment de la nau. Algunes tasques tenen més prioritat que altres. Donada una llista de tasques, vols saber quina hauries de fer en 𝐾 lloc

Entrada:
La primera línea son els casos de prova que hi ha.
Cada cas de prova començarà amb una línea amb dos nombres, 𝑁
, les tasques, i 𝐾, el lloc que vols saber, a on 1<=𝐾<=𝑁

Després vindràn 𝑁

línies, cadascuna amb la prioritat de la tasca seguida del nom de la tasca.

Sortida:
El nom de la tasca en 𝐾 lloc, si fas les tasques en ordre de prioritat (el nombre més baix implica més prioritat.)

Exemple d'Entrada:
1
4 2
5 Arreglar Cables
1 Estabilitzar el Reactor
7 Disparar als Asteroides
80 Culpar al Negre

Exemple de Sortida:
Arreglar Cables

 */

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt() //llegim el nombre de casos
    for (i in 1..casos) { //per cada cas
        val n = scan.nextInt() //llegim el nombre de tasques
        val k = scan.nextInt() //llegim el lloc que volem saber
        val tasques = mutableListOf<Pair<Int, String>>() //creem una llista de parelles de Int i String
        for (j in 0 until n) { //per cada tasca
            val prioritat = scan.nextInt() //llegim la prioritat
            val tasca = scan.nextLine().trim() //llegim la tasca
            tasques.add(Pair(prioritat, tasca)) //afegim la parella a la llista
        }
        tasques.sortBy { it.first } //ordenem la llista per la prioritat
        println(tasques[k - 1].second) //escrivim la tasca en la posició k - 1
    }
}