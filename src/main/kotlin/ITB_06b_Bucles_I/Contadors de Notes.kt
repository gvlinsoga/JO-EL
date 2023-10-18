package ITB_06b_Bucles_I/*Ens demanaen fer estadístiques de notes a l'ESO. Fer un programa que donada una seqüència de notes numèriques entre 0 i 10 ens mostri:

nombre de notes vàlides introduïdes
la mitjana aritmètica de totes les notes introduïdes
quants han tret excel·lents [ 9, 10]
quants notables [ 7, 8)
quants bens [ 6 )
quants suficients [5)
quants insuficients (< 5 i > 3)
quants molt deficients [0 a 3].

Entrada:
L'entrada consta d'una seqüencia de números corresponents a les notes obtingudes. La última nota és -1 i no s'ha de processar. Pot haver-hi notes no vàlides, que s'ignoraran, al processar les dades.

Sortida:
Es mostrarà un missatge en una sola línia amb els resultats obtingits. El missatge s'ajustarà al següent format:
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var notes: Int = 0
    var mitjana: Double = 0.0
    var excelent: Int = 0
    var notable: Int = 0
    var be: Int = 0
    var suficient: Int = 0
    var insuficient: Int = 0
    var moltDeficient: Int = 0
    var nota: Int = 0

    while (nota != -1) {
        nota = scanner.nextInt()
        if (nota in 0..10) {
            notes++
            mitjana += nota
            when (nota) {
                in 9..10 -> excelent++
                in 7..8 -> notable++
                6 -> be++
                5 -> suficient++
                4 -> insuficient++
                in 3 downTo 0 -> moltDeficient++
            }
        }
    }
    mitjana /= notes
    print("NOTES: $notes MITJANA: ${mitjana.toFloat()} E: $excelent N: $notable B: $be S: $suficient I: $insuficient MD: $moltDeficient")
}