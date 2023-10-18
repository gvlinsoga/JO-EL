package ITB_04_Alternatives_IV/*La millor dècada és la dels 90. La gent que no hagi nascut als 90... pobres. De fet, totes les dècades dels 90 son bones. 1890 va ser una bona decada i 2090 també ho serà.
Entrada:

Cada cas de prova consistira en un nombre, que representarà un any 0<𝑁<10000

Sortida:

Per cada cas de prova s'ha de dir SI si acaba amb nombres del 90 al 99 i NO en cas contrari

 */

import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val any = scanner.nextInt()
    val anyresidu = any % 100 //Residu de l'any

    if (anyresidu in 90..99) println("SI") //Si acaba amb nombres del 90 al 99
    else println("NO")
}