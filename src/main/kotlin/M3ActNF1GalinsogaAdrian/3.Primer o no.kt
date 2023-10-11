package M3ActNF1GalinsogaAdrian

/*
Fes un programa que demani un número enter major que 1 a l'usuari i digui si
el nombre és primer o no. Després, ens dirà quin és el nombre primer
immediatament superior.

Exemple:
Introdueix un número: 8
8 no és primer. El primer immediatament superior a 8 és el 11.
Introdueix un número: 5 5 és primer.
El primer immediatament superior a 5 és el 7.
 */
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introdueix un número: ")
    val num = scanner.nextInt()

    if (esPrimer(num)) {
        println("$num és primer.")
        val proximPrimer = trobarProximPrimer(num)
        println("El primer immediatament superior a $num és el $proximPrimer")
    } else {
        println("$num no és primer.")
        val proximPrimer = trobarProximPrimer(num)
        println("El primer immediatament superior a $num és el $proximPrimer")
    }
}

fun esPrimer(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }

    return true
}

fun trobarProximPrimer(n: Int): Int {
    var proximPrimer = n + 1
    while (true) {
        if (esPrimer(proximPrimer)) {
            return proximPrimer
        }
        proximPrimer++
    }
}
