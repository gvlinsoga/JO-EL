/*Harrison for() es un actor de Hollywood famós que fa molta, molta, molta pasta. Cada dia es dedica a comptar els seus milions
Entrada:
Cada cas és una linea amb 1 número, la quantitat de diners que té
Sortida:
Per cada cas de prova caldrà respondre: Comptar milió a milió els diners que té harrison for()
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val diners = scanner.nextLong()
    var contador: Long = 1000000 //inicialitzem el contador a 1000000

    while (contador <= diners) { //mentres que el contador sigui mes petit o igual que els diners que te harrison
            println(contador)
            contador = contador + 1000000 //el contador augmenta 1000000
        }
}