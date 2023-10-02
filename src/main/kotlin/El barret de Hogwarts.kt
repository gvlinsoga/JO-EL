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
    val resposta = scanner.next()

    when (resposta) {
        "Coratge" -> println("Gryffindor")
        "Coneixement" -> println("Ravenclaw")
        "Ambicio" -> println("Slytherin")
        else -> println("Hufflepuff")
    }
}
