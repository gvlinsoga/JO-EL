import java.util.*

class Producte(val nom: String, val preu: Float)

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
    val posicioBuscada = scanner.nextInt()

    // Ordenar la llista de productes pel preu de major a menor
    productes.sortByDescending { it.preu }

    // Trobar el producte més car, més barat i el de la posició P
    val mesCar = productes.first()
    val mesBarat = productes.last()
    val buscat = productes[posicioBuscada - 1]

    // Mostrar la sortida
    println("EL MES CAR: ${mesCar.nom} ${mesCar.preu}")
    println("EL MES BARAT: ${mesBarat.nom} ${mesBarat.preu}")
    println("EL BUSCAT: ${buscat.nom} ${buscat.preu}")
}


