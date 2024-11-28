import java.util.*

data class Producte(val nom: String, val preu: Float)

fun main() {
    val scan = Scanner(System.`in`)
    val numCas = scan.nextInt() // Nombre de productes
    val productes = mutableListOf<Producte>()

    // Llegir les dades de cada producte i afegir-los a la llista
    repeat(numCas) {
        val nom = scan.next() // Nom del producte
        val preu = scan.nextFloat() // Preu del producte
        val producte = Producte(nom, preu)
        productes.add(producte)
    }

    // Llegir el nom del producte que volem comprovar
    val buscat = scan.next()

    // Buscar el producte a la llista
    val trobat = productes.find { it.nom == buscat }

    // Comprovar si el producte s'ha trobat
    if (trobat != null) {
        // Filtrar els productes amb noms alfabèticament menors que el trobat
        val anteriors = productes
            .filter { it.nom < trobat.nom }
            .sortedBy { it.nom } // Ordenar per nom

        // Imprimir el missatge si s'ha trobat el producte
        print("SI, M'HA COSTAT ${trobat.preu}")

        // Imprimir informació del darrer producte anterior, si existeix
        val ultimProducte = anteriors.lastOrNull()
        if (ultimProducte != null) {
            print(" I TAMBE TINC ${ultimProducte.nom} A ${ultimProducte.preu}")
        }

    } else {
        // Imprimir el missatge si no s'ha trobat el producte
        println("NO N'HI HAVIA")
    }
}
