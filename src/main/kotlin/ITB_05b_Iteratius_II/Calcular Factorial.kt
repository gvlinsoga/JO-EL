package ITB_05b_Iteratius_II/*Anem a fer operacions matemàtiques. Donat un nombre enter n >= 0 calcula el seu factorial (n!). Ajuda : si n> 2 , n! = n (n-1) (n-2) …. 1 0! = 1 i 1! = 1
Entrada

La primera línia indica els casos de prova a considerar Cada cas compta amb 1 linea amb un número enter positiu
Sortida

Per cada cas de prova caldrà mostrar el resultat de n!

 */
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val num = scanner.nextInt()
        var factorial = 1 //inicialitzem el factorial a 1
        for (j in 1..num) {
            factorial *= j //fem el factorial amb l'operacio *=
        }
        println(factorial)
    }
}