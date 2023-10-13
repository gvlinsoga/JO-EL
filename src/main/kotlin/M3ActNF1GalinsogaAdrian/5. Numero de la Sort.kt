package M3ActNF1GalinsogaAdrian

/*
Dissenya un programa que calculi el número de la sort d’una persona a partir
de la seva data de naixement (dia, mes i any), la qual es proporcionarà com
dada al programa com una única entrada en el format ddmmaaaa.
Si la dada de naixement introduïda no és correcta, el programa la tornarà a
demanar tantes vegades com sigui necessari. El número de la sort és el que
resulta de reduir a un únic dígit els dígits de la data de naixement. Per fer això,
es comença sumant els dígits de la data de naixement, es continua sumant
cada vegada els dígits resultants de la suma anterior, i s’acaba a l’obtenir un
sol dígit com resultat d’una suma.
Per exemple: Si la data de naixement és el 29 de setembre de 1981 (29091981),
el número de la sort és el 3, que s’obté com resultat de realitzar les sumes:
2+9+0+9+1+9+8+1=39, 3+9=12 i 1+2=3.
Pista: Per al càlcul dels dígits pots agafar el residu de les divisions
successives entre 10 del número corresponent a la data
*/

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var dataValida = false
    var dataAniversari: String = ""
    var numSort: Int

    while (!dataValida) {
        println("Introdueix la teva data de naixement (ddmmyyyy): ")
        dataAniversari = scanner.next()

        if (dataAniversari.length == 8) {
            dataValida = true
        } else {
            println("La data de naixement no és vàlida. Ha de tenir 8 dígits.")
        }
    }

    // Inicialitzem la suma de la data
    var suma = 0
    for (i in dataAniversari) {
        // Convertim cada caràcter a un enter i l'afegim a la suma
        suma += i.toString().toInt()
    }

    // Continuem sumant els dígits fins a obtenir un únic dígit
    while (suma > 9) {
        var tempSuma = 0
        var tempDataSuma = suma
        while (tempDataSuma > 0) {
            tempSuma += tempDataSuma % 10
            tempDataSuma /= 10
        }
        suma = tempSuma
    }

    // Mostrem el número de la sort
    println("El teu número de la sort és: $suma")
}
