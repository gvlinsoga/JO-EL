package ITB_12a_Col_leccions_I

/*
Just avuí em queixava que no hi hagués una cerca per valor en un diccionari. Hi ha cerca per clau que és el get, però no cerca per valor. HMMMMM

Entrada:
La primera línia indica els casos de prova a considerar Cada cas de prova son diverses linies. Comença amb un nombre, N, que té el nombre de línies del cas, seguit per N−1 línies que contenen un pais amb una capital, separat per un guió “-”. Per ultim hi haurà una linea amb el nom d’una capital

Sortida:
Per cada cas s'ha de tornar el diccionari escrit en format estàndard, seguit per el nom del país al qual pertany la capital.
Exemple d'Entrada:

2
5
ESPANYA-MADRID
ALEMANYA-BERLIN
JAPO-TOKIO
BURKINA FASO-OUAGADOUGOU
BERLIN
5
REGNE UNIT-LONDON
AUSTRIA-VIENNA
URSS-MOSCU
YUGOSLAVIA-BELGRAD
MOSCU

Exemple de Sortida:

{ALEMANYA=BERLIN, BURKINA FASO=OUAGADOUGOU, ESPANYA=MADRID, JAPO=TOKIO}
ALEMANYA
{AUSTRIA=VIENNA, REGNE UNIT=LONDON, URSS=MOSCU, YUGOSLAVIA=BELGRAD}
URSS

*/

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt() //llegim el nombre de casos
    for (i in 1..casos) { //per cada cas
        val n = scan.nextInt() //llegim el nombre de línies
        val diccionari = mutableMapOf<String, String>() //creem un diccionari
        for (j in 0 until n - 1) { //per cada línia menys 1
            val paisCapital = scan.next() //llegim el país i la capital
            val pais = paisCapital.split("-")[0] //separem el país
            val capital = paisCapital.split("-")[1] //separem la capital
            diccionari[pais] = capital //afegim el país i la capital al diccionari
        }
        val capital = scan.next() //llegim la capital
        println(diccionari) //escrivim el diccionari
        for ((key, value) in diccionari) { //per cada parella del diccionari
            if (value == capital) { //si la capital és la que busquem
                println(key) //escrivim el país
            }
        }
    }
}
