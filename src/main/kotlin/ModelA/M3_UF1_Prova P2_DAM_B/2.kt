package `M3_UF1_Prova P2_DAM_B`

/*
2. Escriu un programa que demana a l’usuari la seva data de naixement i treu per pantalla el missatge:
 “És veritat/mentida que estàs jubilat" (estan jubilats els que tenen 65 o més anys).

 */


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Solicitar la fecha de nacimiento del usuario
    println("Introduce el año de tu nacimiento:")
    val anyNaixement = scanner.nextInt()

    println("Introduce el mes de tu nacimiento (1-12):")
    val mesNaixement = scanner.nextInt()

    println("Introduce el día de tu nacimiento:")
    val diaNaixement = scanner.nextInt()

    val anyActual = 2024
    val mesActual = 10
    val diaActual = 18

    var edat = anyActual - anyNaixement

    if (mesActual < mesNaixement || (mesActual == mesNaixement && diaActual < diaNaixement)) {
        edat--
    }

    if (edat >= 65) {
        println("És veritat que estàs jubilat.")
    } else {
        println("És mentida que estàs jubilat.")
    }
}
