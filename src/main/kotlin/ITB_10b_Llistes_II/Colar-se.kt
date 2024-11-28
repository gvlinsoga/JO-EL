package ITB_10b_Llistes_II

import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt()
    repeat(numCasos) {
        // Leer el tamaño de la lista
        val tamano = scan.nextInt()

        // Inicializar la lista como un array
        val lista = Array(tamano) { scan.nextInt() }

        // Leer el valor y la posición
        val valor = scan.nextInt()
        val posicion = scan.nextInt()

        // Convertir la lista a una lista mutable para modificarla
        val nuevaLista = lista.toMutableList()

        // Agregamos el valor en la posición
        nuevaLista.add(posicion, valor)

        // Imprimir la lista
        println(nuevaLista.joinToString(" "))
    }
}
