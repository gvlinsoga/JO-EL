import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val lector = Scanner(System.`in`)
    val numCasos = lector.nextInt()

    repeat(numCasos) {
        val listaAlumnos = ArrayList<String>() // Creem una llista buida per a guardar els noms dels alumnes
        val cantidadNombres = lector.nextInt() // Llegim la quantitat de noms d'alumnes
        for (i in 0 until cantidadNombres) { // Iterem sobre la quantitat de noms d'alumnes
            listaAlumnos.add(lector.next()) // Afegim el nom de l'alumne a la llista
        }
        val indiceEliminar = lector.nextInt() // Llegim l'índex de l'alumne a eliminar
        listaAlumnos.removeAt(indiceEliminar) // Eliminem l'alumne de la llista
        listaAlumnos.forEach { nombre -> // Iterem sobre la llista de noms d'alumnes
            println(nombre) // Imprimim el nom de l'alumne
        }
    }
}
