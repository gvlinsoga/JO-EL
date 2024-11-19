import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casProva = scan.nextInt() //llegim el cas de prova
    scan.nextLine() //saltem de línia

    repeat(casProva) {
        val k = scan.nextInt() //lllegim la quantitat de noms de cotxes
        scan.nextLine()
        val nomCoche = mutableListOf<String>() //creem una llista mutable

        for (i in 0 until k){ //iterem sobre la quantitat de noms de cotxes
            nomCoche.add(scan.nextLine()) //afegim el nom del cotxe a la llista
        }
        val francescoVirgolini = nomCoche.indexOf("Francesco Virgolini") //busquem la posició de Francesco Virgolini
        if (francescoVirgolini > 0){ //si la posició de Francesco Virgolini és més gran que 0
           var posFrancesco = nomCoche[francescoVirgolini - 1] // guardem la posició de Francesco Virgolini
            nomCoche[francescoVirgolini - 1] = nomCoche[francescoVirgolini] //intercanviem les posicions de Francesco Virgolini
            nomCoche[francescoVirgolini] = posFrancesco // intercanviem les posicions de Francesco Virgolini amb la posició guardada
        }
        println(nomCoche) //mostrem la llista
    }

}