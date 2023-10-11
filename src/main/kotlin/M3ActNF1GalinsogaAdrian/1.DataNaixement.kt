/*1
Escriu un programa que llegeixi una data de naixement i ens digui el signe
zodiacal corresponent.
Has d’assegurar-te que l’usuari introdueix una data de
naixement correcta.

- Una data és correcta si el mes es troba entre 1 i 12.
- Si el mes és 1,3,5,7,8,10 o 12 el dia ha d’estar entre 1 i 31.
- Si el mes és 4,6,9,11 el dia ha d’estar entre 1 i 30.
- Si el mes és 2, llavors el dia ha d’estar entre 1 i 28, però si l’any és múltiple de 4 pot tenir 29 dies, excepte si l’any és múltiple
de 100 però sí ho serà si és múltiple de 400.

    Aries: del 21 de marzo al 19 de abril
    Tauro: del 20 de abril al 20 de mayo
    Géminis: del 21 de mayo al 20 de junio
    Cáncer: del 21 de junio al 22 de julio
    Leo: del 23 de julio al 22 de agosto
    Virgo: del 23 de agosto al 22 de septiembre
    Libra: del 23 de septiembre al 22 de octubre
    Escorpio: del 23 de octubre al 21 de noviembre
    Sagitario: del 22 de noviembre al 21 de diciembre
    Capricornio: del 22 de diciembre al 19 de enero
    Acuario: del 20 de enero al 18 de febrero
    Piscis: del 19 de febrero al 20 de marzo

 */

package M3ActNF1GalinsogaAdrian
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var mes: Int
    var dia: Int
    var any: Int
    var signe = ""  // Variable per emmagatzemar el signe zodiacal


    do {

        // Demanem a l'usuari que introdueixi el mes de naixement (1-12)
        println("Introdueix el mes de naixement (1-12): ")

        // Validació de l'entrada del mes
        do {
            if (!scanner.hasNextInt()) {
                println("Introdueix un mes vàlid (1-12):")
                scanner.next()
            }
        } while (!scanner.hasNextInt())
        mes = scanner.nextInt()

        // Demanem a l'usuari que introdueixi el dia de naixement (1-31)
        println("Introdueix el día de naixement (1-31): ")

        // Validació de l'entrada del dia
        do {
            if (!scanner.hasNextInt()) {
                println("Introdueix un día vàlid (1-31):")
                scanner.next()
            }
        } while (!scanner.hasNextInt())
        dia = scanner.nextInt()

        // Demanem a l'usuari que introdueixi l'any de naixement
        println("Introdueix l'any de naixement: ")

        // Validació de l'entrada de l'any
        do {
            if (!scanner.hasNextInt()) {
                println("Introdueix un any vàlid:")
                scanner.next()
            }
        } while (!scanner.hasNextInt())
        any = scanner.nextInt()

        // Bucle de validació per assegurar-se que la data sigui correcta

        var dataCorrecte = false

        // Comprovem si el mes és vàlid i el dia està dins del rang correcte segons el mes
        if (mes in 1..12) {
            when (mes) {
                1, 3, 5, 7, 8, 10, 12 -> dataCorrecte = dia in 1..31
                4, 6, 9, 11 -> dataCorrecte = dia in 1..30
                2 -> {
                    // Comprovem si febrer té 28 o 29 dies
                    dataCorrecte = if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
                        dia in 1..29
                    } else {
                        dia in 1..28
                    }
                }
            }
        }

        // Si la data no és correcta, demana que torni a introduir la data

        if (!dataCorrecte) {
            println("Data Incorrecte ")
        }
    } while (!dataCorrecte)


    // El resultat ens dona el signe zodiacal segons el mes i el dia de naixement
    when (mes) {
        1 -> signe = if (dia >= 21) "Acuario" else "Capricornio"
        2 -> signe = if (dia >= 20) "Piscis" else "Acuario"
        3 -> signe = if (dia >= 21) "Aries" else "Piscis"
        4 -> signe = if (dia >= 21) "Tauro" else "Aries"
        5 -> signe = if (dia >= 21) "Géminis" else "Tauro"
        6 -> signe = if (dia >= 22) "Cáncer" else "Géminis"
        7 -> signe = if (dia >= 23) "Leo" else "Cáncer"
        8 -> signe = if (dia >= 23) "Virgo" else "Leo"
        9 -> signe = if (dia >= 23) "Libra" else "Virgo"
        10 -> signe = if (dia >= 23) "Escorpio" else "Libra"
        11 -> signe = if (dia >= 22) "Sagitario" else "Escorpio"
        12 -> signe = if (dia >= 22) "Capricornio" else "Sagitario"
    }

    // Mostrem el signe zodiacal a l'usuari
    println("El teu signe es: $signe")


}













