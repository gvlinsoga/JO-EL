/*
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var segundos = scanner.nextInt()
    val horas = segundos/3600
    var dias = 0
    var horass = 0
    var diaNoche = "mati"
    var segundos2= segundos

    val diaEnSegons = 86400
    val doce = 43200
    while (segundos > 0){
        segundos-=diaEnSegons
        dias++

    }

    println(horas)
}
*/

import java.util.*
fun main() {

    val scanner = Scanner(System.`in`)
    val segundos = scanner.nextInt()

    // Calcular dies transcurrits
    val dies = segundos / (12 * 3600)

    // Calcular si es mati o tarda
    val calcularMati = (dies % 2) == 0

    // Calcular el num del dia
    val diaNum = (dies / 2) + 1


    if (calcularMati) {
        println("mati del dia $diaNum")
    } else {
        println("nit del dia $diaNum")
    }
}
