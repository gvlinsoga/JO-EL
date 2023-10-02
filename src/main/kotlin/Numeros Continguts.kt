/*
Dos números enters 𝐴,𝐵 són contigus si 𝐴+1=𝐵 o 𝐵+1=𝐴
Entrada: Cada cas és de dues línees. Cada línea conté un nombre, A i B.
Sortida: Per cada cas es dira "SI" si A i B són contigus i "NO" en cas contrari
 */
import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    when (a) {
        b + 1 -> println("SI") // Si A+1=B
        b - 1 -> println("SI") // Si B+1=A
        else -> println("NO") // Si A i B no són contigus
    }
}


