/*Un número és divisible entre 6 si ho és per 2 i 3, i entre 9 si sumes els seus dígits... no m'enrecordo. Fes un programa que faci això i jo em dedico a memoritzar les estadístiques del meu personatge al 𝑊𝑜𝑟𝑙𝑑𝑜𝑓𝑊𝑎𝑟𝑐𝑟𝑎𝑓𝑡

Entrada: Cada cas és d'una línea, i conté un número 𝑁

Sortida: Per cada cas es dira "SI" si 𝑁 és divisible per 1,2,3,4,5,6,7,8,9 i "NO" en cas contrari psst, realment només cal comprovar 4 divisors.
 */

import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val numN = scanner.nextInt()

    if (numN % 1 == 0 && numN % 2 == 0 && numN % 3 == 0 && numN % 4 == 0 && numN % 5 == 0 && numN % 6 == 0 && numN % 7 == 0 && numN % 8 == 0 && numN % 9 == 0) println("SI") //ex
    else println("NO")
}