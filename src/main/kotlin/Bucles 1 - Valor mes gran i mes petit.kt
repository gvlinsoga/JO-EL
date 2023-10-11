/*Implementa un programa que llegeixi una seqüència de números enters fins a trobar un zero. Llavors ens dirà quins són els números més gran i més petit. Penseu que poden haver-hi números negatius.
Entrada

Cada cas de prova conté una seqüència de números enters, entre -100000 i 100000, que finalitza amb un zero, que no s´ha de processar.
Sortida

Mostrarà el número més gran i el més petit en una mateixa línia i separats per un espai en blanc.
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var max = num
    var min = num

    while (num != 0) { //mentres que el numero sigui diferent a 0
        if (num > max) max = num //si el numero es mes gran que el maxim, el maxim sera el numero
        if (num < min) min = num //si el numero es mes petit que el minim, el minim sera el numero
        num = scanner.nextInt()
    }
    println("$max $min")
}

