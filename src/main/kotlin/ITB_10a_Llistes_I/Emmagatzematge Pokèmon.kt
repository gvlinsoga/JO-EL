import java.util.*;

fun main() {
    val entrada = Scanner(System.`in`)
    val cantidadCasos = entrada.nextInt()
    val capacidadAlmacen = entrada.nextInt()
    repeat(cantidadCasos) {
        val identificadores = ArrayList<Int>()
        val niveles = ArrayList<Int>()
        for (i in 0 until capacidadAlmacen) {
            identificadores.add(entrada.nextInt())
        }
        for (i in 0 until capacidadAlmacen) {
            niveles.add(entrada.nextInt())
        }
        val mapaPokemon = mutableMapOf<Int, Int>()
        for (i in identificadores.indices) {
            val id = identificadores[i]
            val nivel = niveles[i]
            if (!mapaPokemon.containsKey(id) || mapaPokemon[id]!! < nivel) {
                mapaPokemon[id] = nivel
            }
        }
        val resultado = identificadores.filterIndexed { index, id ->
            niveles[index] == mapaPokemon[id]
        }.distinct()
        println(resultado.joinToString(" "))
    }
}
