/*

Fes un programa que llegeixi el nom d'un jugador, els punts d'experiencia i el grup al que pertany(A,B,C)
Si introdueix una lletra diferent o punts incorrectes(menys de zero o un valor no numeric) mostrarà ERROR.
Si el jugador es del grup A suma 100 punts, si es del grup B suma 50 punts i si es del grup C suma 25 punts.
Finalitza el programa mostrant un misatge amb el nom del jugador, el grup i la puntuació final.

Entrada:
L'entrada consta d'una única línia que conté tres valors: el nom del jugador, la puntuació inicial i el grup.

Sortida:
S'ha de mostrar una línia amb el nom del jugador, el grup i la puntuació final, o bé la paraula ERROR si hi ha algun valor incorrecte a la entrada.


Exemples
Entrada 	Sortida
Roc 134 A 	Jugador: Roc - Grup: A - Punts totals: 234
Pep -34 B 	ERROR
Pol 15 C 	Jugador: Pol - Grup: C - Punts totals: 40
Hug C 15 	ERROR
Lluc 20 D 	ERROR
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val nom = scanner.next()
    val punts = scanner.nextInt()
    val grup = scanner.next()
    var puntsFinal = 0

    if (punts < 0 ) { //Si els punts són negatius o el grup no és A, B o C, mostrem ERROR
        println("ERROR")
    } else {
        when (grup) { //Segons el grup, sumem una quantitat de punts
            "A" -> puntsFinal = punts + 100 //Sumem 100 punts si el grup és A
            "B" -> puntsFinal = punts + 50 //Sumem 50 punts si el grup és B
            "C" -> puntsFinal = punts + 25 //Sumem 25 punts si el grup és C
            else -> println("ERROR") //Si el grup no és A, B o C, mostrem ERROR
        }
        println("Jugador: $nom - Grup: $grup - Punts totals: $puntsFinal") //Mostrem el nom, grup i punts finals
    }
}