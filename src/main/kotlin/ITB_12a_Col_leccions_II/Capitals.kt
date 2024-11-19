package ITB_12a_Col_leccions_II

/*
a l’ESO tenia un professor que es deia Agustí Preixats que em donava geografia. Estava calb i no em queia bé.
Em feia memoritzar totes les capitals de tots els paisos del món, fins i tot els que no m’importaven.
I després em pregunten per que em vaig fer Enginyer Informàtic. L’enginyeria es dura.
A vegades sento que he sacrificat la meva juventud en l’altar de l’UPC. Tinc una carrera, però, a quin cost?
Podré recuperar els meus millors anys? Crec que tinc una crisis existencial.


Entrada

La primera línia indica els casos de prova a considerar Cada cas de prova son diverses linies. Comença amb un nombre, 𝑁
, que té el nombre de línies del cas, seguit per 𝑁−1

línies que contenen un pais amb una capital, separat per un guió “-”. Per ultim hi haurà una linea amb el nom d’un país

Sortida

Per cada cas s’haurà de tornar la capital del país. Si el país no ha estat nombrat abans, es dirà “NO HO SE”.


 */

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    for (i in 1..casos) {
        val n = scan.nextInt() // per cada cas llegim el nombre de línies
        val diccionari = mutableMapOf<String, String>()
        for (j in 0 until n - 1) { //per cada línia menys 1 llegim el país i la capital, separem el país, separem la capital
            val paisCapital = scan.next()
            val pais = paisCapital.split("-")[0]
            val capital = paisCapital.split("-")[1]
            diccionari[pais] = capital //afegim el país i la capital al diccionari
        }
        val pais = scan.next() //llegim el país i si el diccionari conté el país escrivim la capital, si el diccionari no conté el país escrivim NO HO SE
        if (diccionari.containsKey(pais)) {
            println(diccionari[pais])
        } else {
            println("NO HO SE")
        }
    }
}