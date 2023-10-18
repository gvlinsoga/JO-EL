package ITB_06b_Bucles_I/*
Un icónic atac de mag en el WoW es Explosión Arcana.
Aquest atac comença fent poc mal, pero cada cop que el fas servir fa un 100% més de mal. Per exemple, si el primer cop fa 100 punts de mal, el següent farà 200, el següent 300, el següent 400, i així fins que passa un temps.

Entrada:
Cada cas son dos nombres, casdascún en una linea. el primer, 𝐼𝑛𝑖
, es el dany inicial de Explosión Arcana. El segon, 𝐻𝑃

, és la vida de l'enemic

Sortida:
S'ha de dir quantes explosions arcanes s'han de tirar, comptant amb la regla anterior, per a matar l'enemic (deixar-li la vida a 0).
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val ini = scanner.nextInt()
        var hp = scanner.nextInt()
        var dany = ini //inicialitzem el dany a l'inicial
        var explosions = 0 //inicialitzem el nombre d'explosions a 0
        while (hp > 0) { //mentre la vida de l'enemic sigui superior a 0
            hp -= dany //restem el dany a la vida de l'enemic
            dany += ini //sumem el dany inicial al dany
            explosions++ //sumem 1 al nombre d'explosions
        }
        println(explosions)
    }

}