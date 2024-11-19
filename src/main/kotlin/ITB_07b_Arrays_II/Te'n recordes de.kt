fun main() {
    val numCas = readLine()!!.toInt()

    // bucle per iterar a través de cada cas
    repeat(numCas) {
        // llegir el valor K
        val k = readLine()!!.toInt()

        // llegir la llista de nums del 0 al 100
        val numeros = readLine()!!.split(" ").map { it.toInt() }

        // llegir el valor P
        val p = readLine()!!.toInt()

        // obtenir el num en la posició P de la llista
        val posicioP = numeros[p]

        // imprimeix el num de la posició P
        println(posicioP)
    }
}
