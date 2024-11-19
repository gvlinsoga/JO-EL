import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casProva = scan.nextInt() //casos de prova

    repeat(casProva) {
        for (i in 0 until casProva) {
            val tamany = scan.nextInt() //tamany array
            val array = arrayOfNulls<Int>(tamany) //creem l'array
            //Fem un bucle per llegir l'array de Strings
            for (i in 0 .. tamany -1 ) {    //llegim l'array
                array[i] = scan.nextInt() //llegim cada element de l'array
            }
            var compleixRegla = false  // Variable aux per veure si cumpleix la regla
            var i = 1 //iniciaitzem la varible a 1
            while (i < tamany) {
                if (array[i] == array[i - 1]) {
                    compleixRegla = true
                    i = tamany
                }
                i++
            }
            // Imprimir SI o NO segons si es compleix o no con la regla
            if (compleixRegla) {
                println("SI")
            } else {
                println("NO")
            }
        }
    }
}
