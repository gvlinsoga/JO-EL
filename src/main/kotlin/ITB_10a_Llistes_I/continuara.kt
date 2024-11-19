import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() //llegim el cas de prova
    scanner.nextLine() //saltem de línia
    repeat(casos) { //iterem sobre el cas de prova
        val frase = scanner.nextLine() //llegim la frase
        val paraula = frase.split(" ") //separem la frase per espais
        for (i in 0 until paraula.size - 1) { //iterem sobre la longitud de les paraules
            val paraulaActual = paraula[i] //guardem la paraula actual
            val paraulaSeguent = paraula[i + 1] //guardem la paraula següent
            print(paraulaActual) //imprimir la paraula actual
            if (paraulaActual.length < paraulaSeguent.length) {
                println("...") //imprimir els punts suspensius
                println(" ")  //imprimir els espais
            }
        }
        println(paraula.last()) //imprimir l'última paraula
    }
}
