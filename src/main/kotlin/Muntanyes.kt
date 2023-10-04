/*
Se't donen 5 numeros i has de dir si son muntanyes.
Els nombres fan muntanyes si el segon és més gran que el primer, el tercer més petit que el segon, el quart més gran que el tercer, etc. També al revès, si el segón es més petit que el primer, el tercer més gran que el segon, etc.
Entrada: Cada cas té 5 línies, una per cada nombre.
Sortida: Per cada cas es dira "SI" si els nombres fan muntanyes i "NO" en cas contrari
*/

import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val primerNum = scanner.nextInt()
    val segonNum = scanner.nextInt()
    val tercerNum = scanner.nextInt()
    val quartNum = scanner.nextInt()
    val cinqueNum = scanner.nextInt()

    if (primerNum < segonNum && segonNum > tercerNum && tercerNum < quartNum && quartNum > cinqueNum) println("SI") // Si el segón és més gran que el primer, el tercer més petit que el segon, el quart més gran que el tercer.
    else if (primerNum > segonNum && segonNum < tercerNum && tercerNum > quartNum && quartNum < cinqueNum ) println("SI") // Si el segón es més petit que el primer, el tercer més gran que el segon.
    else println("NO")
}