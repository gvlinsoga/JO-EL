package ITB_06d_Bucles_IV

/*
WebCaptioner (conegut a catalunya com WebCasteller), és una web que et permet posar subtítols a la veu a temps real. Encara està aprenent, així que amb tal de que posi bé la meitat de les lletres ens donem per satisfet
Entrada

La primera línea son els casos de prova. Cada cas de prova són dues línies amb una sola paraula cadascuna. La primera és el que has dit i la segona el que ha tornat WebCasteller
Sortida

Per cada cas de prova caldrà respondre: Si com a mínim la meitat de les lletres són iguals en posició i valor, es tornara "GRACIES WEBCASTELLER" Si no, es tornarà "WEBCASTELLER ESTA TRAVIESO HOY". Si les strings tenen tamany diferent, es prendrà com a referència la string més llarga.
Exemple d'Entrada
Copy

5
SETS
CEPS
SETS
SEXTO
SETS
SEX
SETS
CREP
AAAAAAA
AAA

Exemple de Sortida
Copy

GRACIES WEBCASTELLER
WEBCASTELLER ESTA TRAVIESO HOY
GRACIES WEBCASTELLER
WEBCASTELLER ESTA TRAVIESO HOY
WEBCASTELLER ESTA TRAVIESO HOY


 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()
    scanner.nextLine() // Lee el salto de línea después del número de casos

    for (i in 1..casProva) {
        val frase1 = scanner.nextLine().trim()
        val frase2 = scanner.nextLine().trim()
        var iguals = 0

        // Iterar hasta la longitud de la cadena más corta para contar coincidencias
        val minLength = minOf(frase1.length, frase2.length)
        for (j in 0 until minLength) {
            if (frase1[j] == frase2[j]) {
                iguals++
            }
        }

        // Longitud de la cadena más larga
        val maxLength = maxOf(frase1.length, frase2.length)

        // Verificar si las coincidencias son al menos la mitad de la longitud de la cadena más larga
        if (iguals >= maxLength / 2) {
            println("GRACIES WEBCASTELLER")
        } else {
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }
    }
}

