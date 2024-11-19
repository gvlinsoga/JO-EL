import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCas = scan.nextInt()

    for (i in 1..numCas) {
        val numParaules = scan.nextInt()
        scan.nextLine()

        var esCorrecte = true
        var paraula = scan.nextLine() // llegir la primera paraula

        for (j in 1 until numParaules) {
            val paraulaAnterior = paraula // guardem la paraula actual com l'anterior
            paraula = scan.nextLine() // llegir la següent paraula
            var diferencia = 0 // comptar les diferencies entre les paraules

            if (paraula.length == paraulaAnterior.length) { // comprovar si les paraules tenen la mateixa longitud
                for (lletra in paraula.indices) { // comparar els caracters
                    if (paraula[lletra] != paraulaAnterior[lletra]) { // si els caracters son diferents
                        diferencia++ //
                    }
                }
                if (diferencia != 1) { // si no hi ha la diferencia es false
                    esCorrecte = false
                }
            } else {
                esCorrecte = false // si les paraules tenen diferent longitud, es cambia a false
            }
        }

        if (esCorrecte) { // si es true imprimim correcte, si no, incorrecte
            println("CORRECTE")
        } else {
            println("INCORRECTE")
        }
    }
}
