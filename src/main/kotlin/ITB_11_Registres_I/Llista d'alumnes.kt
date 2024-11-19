import java.util.*

data class Alumno(val nombre: String, val notaParcial1: Float, val notaParcial2: Float, var notaFinal: Double)

fun main() {
    val scan = Scanner(System.`in`)
    scan.useLocale(Locale.US)

    // Lee el número de alumnos
    val casos = scan.nextInt()

    // Lee los datos de cada alumno y agrégalos a la lista
    val alumnos = mutableListOf<Alumno>()
    repeat(casos) {
        val nombre = scan.next()
        val notaParcial1 = scan.nextFloat()
        val notaParcial2 = scan.nextFloat()
        val alumno = Alumno(nombre, notaParcial1, notaParcial2, 0.0)
        alumnos.add(alumno)
    }

    // Lee las posiciones P1 y P2
    val posision1 = scan.nextInt() - 1
    val psisison2 = scan.nextInt() - 1

    // Calcula la nota final para cada alumno
    for (alumno in alumnos) {
        alumno.notaFinal = 0.4 * alumno.notaParcial1 + 0.6 * alumno.notaParcial2
    }

    // Ordena la lista de alumnos por nota del segundo parcial de mayor a menor
    val alumnosOrdenadosPorParcial2 = alumnos.sortedByDescending { it.notaParcial2 }

    // Imprime la información para el alumno en la posición P1 según el segundo parcial
    val alumnoP1 = alumnosOrdenadosPorParcial2[posision1]
    println("${alumnoP1.nombre} ${alumnoP1.notaParcial1} ${alumnoP1.notaParcial2} ${String.format("%.2f", alumnoP1.notaFinal)}")

    // Ordena la lista de alumnos por nota final de mayor a menor
    val alumnosOrdenadosPorNotaFinal = alumnos.sortedByDescending { it.notaFinal }

    // Imprime la información para el alumno en la posición P2 según la nota final
    val alumnoP2 = alumnosOrdenadosPorNotaFinal[psisison2]
    println("${alumnoP2.nombre} ${alumnoP2.notaParcial1} ${alumnoP2.notaParcial2} ${String.format("%.2f", alumnoP2.notaFinal)}")
}
