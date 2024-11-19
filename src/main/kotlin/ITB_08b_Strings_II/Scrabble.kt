import java.util.*

fun main() {
    val entrada = Scanner(System.`in`)
    val numCas = entrada.nextInt() // llegir el nombre de cas

    repeat(numCas) {
        var resultat = ""
        var comptadorParaules = 0

        // inicialitzar un array per comptar les lletres de l'alfabet
        var comptadorLletres: Array<Int?> = arrayOfNulls(26)
        repeat(26) {
            comptadorLletres[it] = entrada.nextInt() // llegir els comptadors inicials de lletres
        }
        entrada.nextLine()

        var paraulaActual = entrada.nextLine().uppercase() // llegir la paraula actual i convertir a majúscules
        var esValid = true
        var lletresEliminades = ""

        // inizialitzem el bucle de paraules fins que es trobi un punt
        while (paraulaActual != ".") {
            // verifico cada caracter en la paraula actual
            for (caracterParaula in paraulaActual) {
                if ((comptadorLletres[caracterParaula - 'A']!! > 0) && esValid) {
                    comptadorLletres[caracterParaula - 'A'] = comptadorLletres[caracterParaula - 'A']!! - 1
                    lletresEliminades += caracterParaula
                } else {
                    esValid = false
                }
            }

            // Si la paraula es correcte, sumem al resultat
            if (esValid) {
                resultat += paraulaActual
                resultat += " "
                comptadorParaules++
            } else {
                // si la paraula no ccorrecte, retornar les lletres eliminades
                for (caracterIncorrecte in lletresEliminades) {
                    comptadorLletres[caracterIncorrecte - 'A'] = comptadorLletres[caracterIncorrecte - 'A']!! + 1
                }
            }
            paraulaActual = entrada.nextLine().uppercase()  // llegir la següent paraula en majuscula
            esValid = true
            lletresEliminades = ""
        }

        println("$comptadorParaules $resultat") //imprimeixo el comptador de paraules vàlides i les paraules
    }
}
