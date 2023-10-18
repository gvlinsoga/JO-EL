package ITB_04_Alternatives_IV/*A vegades tens un professor graciós que et posa una entrega per les 34 i mitja, o les 12:89. Fes un programa que li faci pagar per els seus crims.

Entrada:

Cada cas és de tres línies, i conté un número per línia 𝐻,𝑀,𝑆, que representen
respectivament hores, minuts i segons. S'entèn que les hores van en format 0-23

Sortida:

En el cas de que l'hora sigui una hora correcta, es dirà "SI".
En cas contrari es dirà "NO"

 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val h = scanner.nextInt()
    val m = scanner.nextInt()
    val s = scanner.nextInt()

    if (h in 0..23 && m in 0..59 && s in 0..59) println("SI") //Llegeix les hores, minuts i segons i si estan dins del rang, imprimeix SI
    else println("NO") //Si no està dins del rang, imprimeix NO
}