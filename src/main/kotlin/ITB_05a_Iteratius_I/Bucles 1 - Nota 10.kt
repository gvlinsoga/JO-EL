package ITB_05a_Iteratius_I/*

Acaben de fer un examen i ha anat excepcionalment bé. El professor es pregunta quants de vosaltres heu tret un 10. Li podeu ajudar?
Entrada

L'entrada consta d'una seqüencia de números corresponents a les notes obtingudes. La última nota és -1 i no s'ha de processar.
Sortida

Es mostrarà un missatge indicant el nombre total de notes correctes llegides i el nombre total de notes 10. Una nota és vàlida si es troba entre 0 i 10.

El format del missatge de sortida serà el següent:

 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var notes = scanner.nextInt()
    var notes10 = 0
    var notesCorrectes = 0

    while (notes != -1) { //mentre la nota sigui diferent a -1
        if (notes in 0..10) { //si la nota està entre 0 i 10
            notesCorrectes++ //sumem al contador notesCorrectes el nombre de notes correctes
            if (notes == 10) notes10++ //si la nota és 10, augmentem el nombre de notes 10
        }
        notes = scanner.nextInt() //llegim la següent nota
    }
    println("TOTAL NOTES: $notesCorrectes NOTES 10: $notes10") //imprimim el nombre de notes correctes i el nombre de notes 10
}