package ITB_06b_Bucles_II

/*Ets un rastrejador i estàs analitzant els casos de covid de tots els barris de catalunya. Et passaran els valors diaris de l'índex de contagis. La teva única missió és avisar si algun valor passa de 300.

Entrada:
La primera línia indica els casos de prova a considerar. Cada cas són dues línies. La primera conté un nombre 𝑁
amb la quantitat de dies durant els que faràs l'anàlisi. Després vindrà una línia amb 𝑁
nombres, cadascun amb el valor de l'índex de contagis de cada dia.

Sortida:
Per cada cas de prova caldrà respondre: Si no hi ha cap valor per sobre de 300, OK Si n'hi ha algun igual o per sobre de 300, ALARMA
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val dies = scanner.nextInt()
        var alarma = false //inicialitzem la variable alarma a false

        for (j in 1..dies) {
            val num = scanner.nextInt()
            if (num >= 300) { //si el num és igual o superior a 300, la variable alarma passa a true
                alarma = true
            }
        }
        if (alarma) { //si la variable alarma és true, s'imprimeix ALARMA
            println("ALARMA")
        } else { //si la variable alarma és false, s'imprimeix OK
            println("OK")
        }
    }
}