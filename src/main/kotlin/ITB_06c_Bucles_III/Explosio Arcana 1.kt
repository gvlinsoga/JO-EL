package ITB_06c_Bucles_III

/* Un icónic atac de mag en el WoW es Explosión Arcana. Aquest atac comença fent poc mal, pero cada cop que el fas servir fa un 100% més de mal. Per exemple, si el primer cop fa 100 punts de mal, el següent farà 200, el següent 300, el següent 400, i així fins que passa un temps.

Entrada:
Cada cas son dos nombres, casdascún en una linea. el primer, 𝐼𝑛𝑖, es el dany inicial de Explosión Arcana. El segon, 𝑄, és la quantitat d'Explosions Arcanes que es tiren

Sortida:
S'ha de dir el dany TOTAL fet per totes les Explosions Arcanes. És a dir, la suma de totes. No la última
 */


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val danyInicial = scanner.nextInt()
    val explosions = scanner.nextInt()
    var dany = danyInicial //inicialitzem el dany a l'inicial
    var danyTotal = 0 //inicialitzem el dany total a 0

    for (quantitat in 1..explosions) { //per cada explosió
        danyTotal += dany //sumem el dany al dany total
        dany += danyInicial //sumem el dany inicial al dany
    }
    println(danyTotal)
}

