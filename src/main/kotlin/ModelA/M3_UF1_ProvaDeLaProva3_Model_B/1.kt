package M3_UF1_ProvaDeLaProva3_Model_B
/*
1.
Programa que rep diverses seqüències d’enters, precedides sempre del nombre d’enters que contindrà la seqüència,
el programa haurà de transformar en negatiu el número que es trobi enmig de la seqüència.
En cas de ser una seqüència parella de nombres, tots dos nombres d’enmig es converteixen en negatius.
Entrada						Sortida
5	5 6 7 8 9					5  6 -7 8 9
10	1 2 3 4 5 6 7 8 9 10				1 2 3 4 -5 -6 7 8 9 10

 */


/*
fun main() {
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val seq = readLine()!!.split(" ").map { it.toInt() }
        val middle = seq.size / 2
        if (seq.size % 2 == 0) {
            seq[middle] = -seq[middle]
            seq[middle - 1] = -seq[middle - 1]
        } else {
            seq[middle] = -seq[middle]
        }
        println(seq.joinToString(" "))
    }

}

 */