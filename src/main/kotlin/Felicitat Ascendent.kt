/*Diuen que allò important no és ser molt feliç, sinó ser cada dia més feliç que el dia anterior. A mi no em miris, sóc un programa d'ordinador.
Entrada:Cada cas és de tres línies, i conté tres números 𝐹1,𝐹2,𝐹3, la quantitat de felicitat d'aquell dia
Sortida:Per cada cas es dira "SI" si la felicitat és ascendent dia a dia i "NO" en cas contrari

 */
import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val f1 = scanner.nextInt()
    val f2 = scanner.nextInt()
    val f3 = scanner.nextInt()
    when {
        f1 < f2 && f2 < f3 -> println("SI") // Si la felicitat és ascendent
        else -> println("NO") // En cas contrari
    }
}