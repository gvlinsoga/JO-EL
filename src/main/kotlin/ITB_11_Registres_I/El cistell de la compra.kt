import java.util.*

class Producte1(val nom: String, val preu: Float)

fun main() {
    val scanner = Scanner(System.`in`)

    // Llegir el nombre de productes
    val numProductes = scanner.nextInt()

    // Llegir els productes i guardar-los en una llista
    val productes = mutableListOf<Producte>()
    repeat(numProductes) {
        val nom = scanner.next()
        val preu = scanner.nextFloat()
        productes.add(Producte(nom, preu))
    }

    // Llegir el producte que es vol consultar
    val producteBuscat = scanner.next()

}

/*
    // Mostrar la sortida
    if (producteBuscat == productes[0].nom) {
        println("SI, M'HA COSTAT ${ productes.nom.preu } I TAMBE TINC Pa A ${ buscat.preu }")
    } else if (mesBarat == buscat) {
    println("SI, M'HA COSTAT ${ buscat.preu }")
    } else {
        println("NO N'HI HAVIA")
    }
}


 */


