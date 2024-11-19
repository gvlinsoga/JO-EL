package ITB_12a_Col_leccions_I

/*

S'ha muntat una Gymcana amb les típiques proves per a nens petits. Encistellar una pilota, pescar una poma amb la boca, i resoldre un exercici de gràfs euclidians en complexitat 𝑛∗𝑙𝑜𝑔(𝑛).
Com era d'esperar, s'ha format una cua a la de la poma. Els nens fallen, tornen a la cua per tornar-ho a intentar, i entren més que no pas surten

El de la foto no sóc jo de petit encara que tingui el mateix pentinat.
Entrada:
La primera línea es el nombre de casos de prova. Cada cas conté dues línies. La primera és el nombre de nens a la cua. Si hi ha 3 significa que hi ha 3 nens, que es diran 1,2,3 La segona es una líniea amb fins a 100 caràcters que descriu una seqüència d'events. S es que un nen supera la prova i marxa, N es que no la supera i torna a la cua, i E és que entra un nou nen. Si entra un nou nen se li assignarà el nombre inmediatament superior al del nen amb el nombre més gran que ha estat en qualsevol moment a la cua. La cua mai queda buida

Sortida:
El nen a qui li toca la prova després de la seqüència
Exemple d'Entrada:

3
3
SNN
3
SSES
3
SSENN

Exemple de Sortida:

2
4
3

 */


import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt() //llegim el nombre de casos
    for (i in 1..casos) { //per cada cas
        val nens = scan.nextInt() //llegim el nombre de nens
        val cua = mutableListOf<Int>() //creem una llista de Int
        for (j in 1..nens) { //per cada nen
            cua.add(j) //afegim el nen a la cua
        }
        val events = scan.next() //llegim els events
        for (j in 0 until events.length) { //per cada event
            if (events[j] == 'S') { //si l'event és S
                cua.removeAt(0) //treiem el primer nen de la cua
            } else if (events[j] == 'N') { //si l'event és N
                cua.add(cua[0]) //afegim el primer nen de la cua al final
                cua.removeAt(0) //treiem el primer nen de la cua
            } else { //si l'event és E
                cua.add(cua.max()!! + 1) //afegim el següent nombre a la cua
            }
        }
        println(cua[0]) //escrivim el primer nen de la cua
    }
}

