package ITB_12a_Col_leccions_II

/*
La Zona Rinxols d'or a l'espai es aquella zona intermitja de distància i tamany dels planetes, ni massa freda ni massa calenta, ni massa gran ni massa petit. El que és més important és la distància, i només si dos planetes estan a la mateixa distància consideraras el tamany.

Agafa en cada cas aquell que quedi just al mig.


Entrada

La primera línea son els casos de prova que hi ha.

Cada cas de prova començarà amb una línea amb 𝑁
, el nombre de planetes en aquell sistema solar. 𝑁

sempre serà senar.

Després vindràn 𝑁

línies, cadascuna amb el nom del planeta, que serà una paraula, la distància al seu sol en UA i el tamany en Massa-Terra


Sortida

El nom del planeta que la seva distància queda just en el mig (per tant, el nom del planeta que la seva distància coincideix amb la mediana de la llista de distàncies.) Si hi hagués més d'un planeta amb aquestes característiques, es triaria, dintre d'aquests, aquell que el seu tamany fos la mediana dels planetes amb la mateixa distància.


Exemple d'Entrada
1
5
Mercuri 1 0.3
Venus 3 0.9
Terra 3.5 1 1
Mart 4.2 0.7
Jupiter 9 300

Exemple de Sortida
Terra


 */


/*
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    for (i in 1..casos) { //llegim el nombre de casos per cada cas llegim el nombre de planetes
        val numPlanetes = scan.nextInt()
        val planetes = mutableListOf<Triple<String, Double, Double>>() //creem una llista de Triple
        for (j in 0 until n) { //Per cada planeta llegim el nom, llegim la distància, llegim el tamany i afegim el Triple a la llista
            val nom = scan.next()
            val distancia = scan.nextDouble()
            val tamany = scan.nextDouble()
            planetes.add(Triple(nom, distancia, tamany))
        }
        planetes.sortBy { it.second } //ordenem la llista per la distància
        val mediana = planetes[n / 2] //agafem el planeta de la posició n / 2
        val planetesMediana = planetes.filter { it.second == mediana.second } //filtrem els planetes amb la mateixa distància
        planetesMediana.sortBy { it.third } //ordenem la llista per el tamany
        println(planetesMediana[planetesMediana.size / 2].first) //escrivim el nom del planeta de la posició planetesMediana.size / 2
    }
}


 */