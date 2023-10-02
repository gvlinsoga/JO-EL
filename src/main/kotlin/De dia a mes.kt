/*import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    print ("Que es el mes important per a tu?")
    val resposta = scanner.nextLine().lowercase()
    if (resposta == "Coratge"){print ("Gryffindor")}
    else if (resposta == "Coneixement"){print ("Ravenclaw")}
    else if (resposta == "Ambicio") {print ("Slytherin")}
    else {print ("Hufflepuff")}
}

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    println("Què és el més important per a tu?")
    val resposta = scanner.nextLine().lowercase()
    when (resposta) {"coratge" -> println("Gryffindor") "coneixement" -> println("Ravenclaw") "ambicio" -> println("Slytherin") else -> println("Hufflepuff")}
}
*/

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val dia = scanner.nextInt()

    when (dia) {
        in 1..31 -> println("1")
        in 32..59 -> println("2")
        in 60..90 -> println("3")
        in 91..120 -> println("4")
        in 121..151 -> println("5")
        in 152..181 -> println("6")
        in 182..212 -> println("7")
        in 213..243 -> println("8")
        in 244..273 -> println("9")
        in 274..304 -> println("10")
        in 305..334 -> println("11")
        in 335..365 -> println("12")
    }
}
