package ITB_06b_Bucles_II

/*Implementa un programa que llegeix un número enter i ens calcula la suma i el producte dels n primers números naturals. Si n és <= 0 es mostrará un missatge d'error i no calcularà res.

Entrada
L'entrada consta d'un primer número k > 0 que indica el nombre de casos de prova a processar. Per cada cas de prova l'entrada serà un únic nombre enter n.

Sortida
Per cada cas de prova es mostrarà, en una línia, el següent:

Si n és errònia es mostrarà el següent missatge de error: ELS NOMBRES NATURALS COMENCEN EN 1
Si n és correcta es mostrarà el següent missatge: SUMA: xxx PRODUCTE: xxx.
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val num = scanner.nextInt()
        var suma = 0 //inicialitzem la suma a 0
        var producte = 1 //inicialitzem el producte a 1
        if (num <= 0) { //si el nombre és <= 0, es mostra el missatge d'error
            println("ELS NOMBRES NATURALS COMENCEN EN 1")
        } else {
            for (j in 1..num) {
                suma += j //fem la suma dels nombres del 1 fins al nombre introduit
                producte *= j //fem el producte dels nombres del 1 fins al nombre introduit
            }
            println("SUMA: $suma PRODUCTE: $producte")
        }
    }


}

