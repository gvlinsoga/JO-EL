/*
Diferència Gran-Petit:
A vegades a la vida vols saber qui ha guanyat. A vegades qui ha perdut. I a vegades vols veure com de pallissa ha estat el resultat

Entrada: Cada cas és de dues línies, i en cada línea hi ha un número, 𝐴,𝐵

Sortida: Per cada cas es dirà la diferència entre A i B
 */

import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    val contador =
        if (a > b) a - b // Si 'a' es mayor que 'b', calcula la diferencia 'a - b'
        else b - a   // Calcula la diferencia 'b - a'
        println(contador) // Imprime el resultado
    }


