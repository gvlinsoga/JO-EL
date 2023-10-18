package ITB_02_b_Alternatives_senzill/*
Les eleccions a Estats Units en 2020 depenen del decisiu estat de Wisconsin. Els tres candidats, Boe Jiden, Tonald Drump, i Sernie Banders estan esperant els resultats que tu, com a Secretari d'Estat, donaràs.
Entrada: Cada cas és de tres línies. La primera és el nombre de vots de Jiden, la segona el nombre de vots de Drump i la tercera els de Banders.
Sortida: Per cada cas es dirà el candidat guanyador. Sempre hi ha un guanyador
 */


import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val jiden = scanner.nextLine()
    val drump = scanner.nextLine()
    val banders = scanner.nextLine()

    if (jiden > drump && jiden > banders)// Compara 'jiden' con 'drump' y 'banders'. Si 'jiden' es mayor que 'drump' y 'banders', imprime "Jiden"
    { println("Jiden") }  // Si 'jiden' es mayor que 'drump' y 'banders', imprime "Jiden"
    else if (drump > jiden && drump > banders) // Si la comparación anterior es falsa, compara 'drump' con 'jiden' y 'banders'.
    { println("Drump") } // Si 'drump' es mayor que 'jiden' y 'banders', imprime "Drump"
    else if (banders > jiden && banders > drump) // Si la comparación anterior es falsa, compara 'banders' con 'jiden' y 'drump'.
    { println("Banders") } // Si 'banders' es mayor que 'jiden' y 'drump', imprime "Banders"
    else println("No") //  Si ninguna de las condiciones anteriores es verdadera, significa que son iguales, imprime "No"
}
