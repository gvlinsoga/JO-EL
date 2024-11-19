package ITB_06b_Bucles_II
/*
La Valentina té un Ràdar que pot detectar la quantitat d'energia de les persones. Per a calibrar-ho, fa 5 medicions de cada persona, que li tornen un valor d'energia. Si l'energia es menys de 1000, serà de categoria H, si es entre 1000 i 10000, de categoria B i si és de 10000 o més, categoria M

Entrada:
La primera línia indica els casos de prova a considerar Cada cas és una linea amb 5
números, cadascún amb la medició de l'energia.

Sortida:
Per cada cas de prova caldrà respondre:
Si en alguna medició s'ha detectat un valor d'energia de 10000 o superior, M Si no és M, pero hi ha algun valor d'energia 1000 o superior, B En cas contrari, H
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        var categoria = "H" //inicialitzem la variable categoria a H
        for (j in 1..5) {
            val energia = scanner.nextInt()
            if (energia >= 10000) { //si l'energia és igual o superior a 10000, la variable categoria passa a M
                categoria = "M"
            } else if (energia >= 1000) { //si l'energia és igual o superior a 1000, la variable categoria passa a B
                categoria = "B"
            }
        }
        println(categoria)
    }
}

