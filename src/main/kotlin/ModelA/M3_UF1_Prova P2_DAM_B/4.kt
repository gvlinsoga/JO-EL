package `M3_UF1_Prova P2_DAM_B`

/*
4. Aplicació que rep un nombre enter i, si té un nombre senar de xifres, les suma, si és parell les multiplica i imprimeix el resultat.

Exemple:
Entrada			Sortida
1234				24
12345				15

*/


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introduce un número entero:")
    val numero = scanner.nextInt()
    val digits = numero.toString().map { it.toString().toInt() }

    val result = if (digits.size % 2 == 0) {
        digits.reduce { acc, i -> acc * i }
    } else {
        digits.sum()
    }

    println("Resultado: $result")
}

