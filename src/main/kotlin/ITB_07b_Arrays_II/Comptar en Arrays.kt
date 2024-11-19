import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numCas = scanner.nextInt()

        // bucle per iterar a través de cada cas
    repeat(numCas) {

        // llegir la llista de nums
        val numCount = scanner.nextInt()
        val nums = IntArray(numCount) { scanner.nextInt() }

        // llegir el valor P
        val p = scanner.nextInt()

        // contador per veure cuantes vegades apareix el num P en la llista de nums
        val numAparicions = nums.count { it == p }

        // imprimeix la quantita de vegades que apareix el num P
        println(numAparicions)
    }
}
