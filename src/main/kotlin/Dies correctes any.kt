/*Dies correctes d'un any
Programa que demana un número de dia de l’any (1-366) i mostra per pantalla:

Incorrecte!:  Si el número de dia no és correcte

Correcte: Per un any no bixest!, si el dia està entre 1 i 365

Correcte: Per un any bixest!, si el dia és 366
*/
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val dia = scanner.nextInt()
    when (dia) {
        in 1..365 -> println("Correcte per un any no bixest!") // Si el dia està entre 1 i 365
        366 -> println("Correcte per un any bixest!") // Si el dia és 366
        else -> println("Incorrecte!") // Si el número de dia no és correcte
    }
}