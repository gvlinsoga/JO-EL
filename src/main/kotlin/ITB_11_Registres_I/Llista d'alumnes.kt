import java.util.*

data class Alumne(val nom: String, val parcial1: Float, val parcial2: Float, var notaFinal: Double)

fun main() {
    val scan = Scanner(System.`in`)

    // Llegir el nombre d'alumnes
    val totalAlumnes = scan.nextInt()

    // Llegir les dades de cada alumne i afegir-les a la llista
    val alumnes = mutableListOf<Alumne>()
    repeat(totalAlumnes) {
        val nom = scan.next()
        val parcial1 = scan.nextFloat()
        val parcial2 = scan.nextFloat()
        val alumne = Alumne(nom, parcial1, parcial2, 0.0)
        alumnes.add(alumne)
    }

    // Llegir les posicions P1 i P2
    val pos1 = scan.nextInt() - 1
    val pos2 = scan.nextInt() - 1

    // Calcular la nota final per a cada alumne
    for (alumne in alumnes) {
        alumne.notaFinal = 0.4 * alumne.parcial1 + 0.6 * alumne.parcial2
    }

    // Ordenar la llista d'alumnes per la nota del segon parcial de major a menor
    val perParcial2 = alumnes.sortedByDescending { it.parcial2 }

    // Imprimir la informació per a l'alumne a la posició P1 segons el segon parcial
    val alumneP1 = perParcial2[pos1]
    println("${alumneP1.nom} ${alumneP1.parcial1} ${alumneP1.parcial2} ${String.format("%.2f", alumneP1.notaFinal)}")

    // Ordenar la llista d'alumnes per nota final de major a menor
    val perNotaFinal = alumnes.sortedByDescending { it.notaFinal }

    // Imprimir la informació per a l'alumne a la posició P2 segons la nota final
    val alumneP2 = perNotaFinal[pos2]
    println("${alumneP2.nom} ${alumneP2.parcial1} ${alumneP2.parcial2} ${String.format("%.2f", alumneP2.notaFinal)}")
}
