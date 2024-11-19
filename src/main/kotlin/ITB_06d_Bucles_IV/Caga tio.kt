package ITB_06d_Bucles_IV

/*
El tió és un tronc màgic que ens caga regals la nit de Nadal mentre l'apallisem a cops de bastó i cantem la cançoneta "Caga tió! Tió de Nadal No caguis arengades que son salades..."

La cançó en qüestió ha tret protagonisme al propi tió de tal forma que se li ha començat a dir "cagatió" donant peu a que sorgeixi la polèmica. I tu com li dius, "tió" o "cagatió"?

El nom correcte és "tió" i, si no aturem aquesta tendència, la propera generació cantarà "Caga cagatió!..." i la seguent li dirà "cagacagatió" i la següent cantarà "Caga cagacagatió!...", amb la qual cosa és molt probable que es perdi la tradició perquè ningú no entendrà res.
Entrada

L'entrada comença amb el nombre de casos a processar.

Cada cas conté la generació que fa cagar el tió.
Sortida

Per a cada cas cal indicar el primer vers de la cançó que farà servir aquella generació per fer cagar el tió. Per evitar problemes no farem servir tildes i escriurem "tio" en comptes de "tió".
Exemple d'Entrada
5
1
2
3
4
7

Exemple de Sortida
Caga tio!
Caga tio!
Caga cagatio!
Caga cagatio!
Caga cagacagacagatio!

 */

import java.util.*

fun main() {
val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        var gen = scanner.nextInt()
        gen = (gen-1)/2 //calculem la generacio que fa cagar el tio
        var cagaTio: String = "" //inicialitzem el string cagaTio a buit

        if (gen > 0 ){
            for (gens in 1..gen) { //per cada generacio que fa cagar el tio
                cagaTio += "caga " //afegim caga al string cagaTio
            }
        }
        println("Caga${cagaTio.trim()}tio!") //imprimim el resultat
    }
}
