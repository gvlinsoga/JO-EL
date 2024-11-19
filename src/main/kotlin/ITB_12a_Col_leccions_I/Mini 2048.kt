package ITB_12a_Col_leccions_I

/*
Joan s’ha enganxat al joc 2048! Porta moltes intents però mai aconsegueix formar el nombre 2048.

Com ja sabeu el joc consisteix en formar el nombre 2048 a base d’anar desplaçant les caselles pel tauler cap a l’esquerra, la dreta, cap a dalt o cap a baix. Cada vegada que el jugador realitza un desplaçament, totes les caselles es desplacen en aquella direcció. Si durant el desplaçament en la direcció seleccionada es troben dos caselles consecutives amb el mateix número, les dues caselles es junten en una sola sumant els seus valors. Després de cada desplaçament, el joc genera un altra valor en qualsevol casella de les que estan buides. El joc continua fins que el jugador aconsegueix formar el número 2048.

El tauler de joc és sempre quadrat. Pot ser de 4x4, de 5x5 o superior. Quan més gran és, més fàcil és aconseguir 2048. Però Joan es distreu sovint i quan pensa que ja ho aconsegueix, es descuida, mou malament les peces i perd la partida.

Entrada:
Simplifiquem el joc. Únicament es fixarem en una fila del tauler i els desplaçaments seran en horitzontal. Cap a l’esquerra (‘L’) o cap a la dreta (‘R’).

L’entrada s’inicia amb un primer valor indicant els casos de prova a processar.

A continuació per cada cas de prova s’indicarà un primer número amb la mida de la filera a tractar. Es garanteix que el número estarà comprès entre 4 i 10.

La següent línia està formada per una seqüència de nombres enters, separats per un espai en blanc, corresponents als valors actuals de les caselles d’aquesta filera. Els valors poden ser: 0, 2, 4, 8, 16, … Atenció: El zero (0) indica casella buida.

Finalment trobareu una últimaa línia amb un caràcter (‘L’: Left, ‘R’: Right) indicant la direcció del desplaçament.


Sortida:
La sortida mostrarà, per cada cas de prova, els valors de la fila, separats per un espai en blanc, després d’aplicar el desplaçament corresponent.

 */

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt() //llegim el nombre de casos
    for (i in 1..casos) { //per cada cas
        val mida = scan.nextInt() //llegim la mida de la fila
        val fila = IntArray(mida) //creem un array de mida mida
        for (j in 0 until mida) { //llegim els valors de la fila
            fila[j] = scan.nextInt()
        }
        val direccio = scan.next() //llegim la direcció
        if (direccio == "L") { //si la direcció és L
            val novaFila = IntArray(mida) //creem un array de mida mida
            var pos = 0 //inicialitzem la variable pos a 0
            for (j in 0 until mida) { //per cada valor de la fila
                if (fila[j] != 0) { //si el valor és diferent de 0
                    novaFila[pos] = fila[j] //posem el valor a la nova fila
                    pos++ //augmentem la posició
                }
            }
            for (j in pos until mida) { //per cada valor de la fila que no hem omplert
                novaFila[j] = 0 //posem un 0
            }
            for (j in 0 until mida) { //per cada valor de la fila
                print("${novaFila[j]} ") //escrivim el valor
            }
            println() //salt de línia
        } else { //si la direcció és R
            val novaFila = IntArray(mida) //creem un array de mida mida
            var pos = mida - 1 //inicialitzem la variable pos a mida - 1
            for (j in mida - 1 downTo 0) { //per cada valor de la fila
                if (fila[j] != 0) { //si el valor és diferent de 0
                    novaFila[pos] = fila[j] //posem el valor a la nova fila
                    pos-- } //disminuïm la posición
            }
        }
    }
}