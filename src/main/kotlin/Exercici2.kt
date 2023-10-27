/*
Fes un programa que llegueixi un nombre N i mostri els nombres de 1 a N, de forma creixen.
Seguidament ha de mostrar tots els numeros entre el mateix N i 1, de forma decreixent.
Finalment, ha de mostrar els nombres de 1 a N, de forma creixent, però saltant de 3 en 3.

S'han d'utilitzar les 4 estructures de REPEAT, FOR, DO-WHILE i WHILE en el mateix programa.

Entrada

L'entrada consta d'un número N que indica el nombre de casos a tractar. Seguidament es presenten N números que sempre seràn més grans que zero.
Sortida

Per cada cas s'han de mostrar tres línies i, al final de cada cas, es mostrarà una línia addicional amb el texte --- com a separador. Cada línia conté la llista de números demanada. Es fa servir l'espai com a separador entre dos números de la llista.
Exemple d'entrada

3
7
2
18

Exemple d'sortida

1 2 3 4 5 6 7
7 6 5 4 3 2 1
1 4 7
---
1 2
2 1
1
---
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
1 4 7 10 13 16
---
 */

fun main() {
    val N = readLine()!!.toInt()

    repeat(N) {
        val num = readLine()!!.toInt()

        // Usant REPEAT (bucle while)
        println("REPEAT:")
        var i = 1
        while (i <= num) {
            print("$i ")
            i++
        }
        println()

        // Usant FOR
        println("FOR:")
        for (i in num downTo 1) {
            print("$i ")
        }
        println()

        // Usant DO-WHILE
        println("DO-WHILE:")
        i = 1
        do {
            print("$i ")
            i += 3
        } while (i <= num)
        println()

        println("---")
    }
}
