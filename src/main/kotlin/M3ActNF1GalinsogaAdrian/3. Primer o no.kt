package M3ActNF1GalinsogaAdrian

/*
Fes un programa que demani un número enter major que 1 a l'usuari i digui si
el nombre és primer o no. Després, ens dirà quin és el nombre primer
immediatament superior.

Exemple:
Introdueix un número: 8
8 no és primer. El primer immediatament superior a 8 és el 11.
Introdueix un número: 5 5 és primer.
El primer immediatament superior a 5 és el 7.
 */
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introdueix un número: ")
    val num = scanner.nextInt()

    // Comprovem si el nombre és més petit o igual a 1, que en cas de que sigui igual o superior ens indica que no es primer
    if (num <= 1) {
        println("$num no és primer.")
    } else {
        // Inicialitzem una variable per comprovar si el nombre és primer
        var esPrimer = true

        // Iterem a través dels nombres per comprovar si num és divisible per algun d'ells
        for (i in 2 until num) {
            if (num % i == 0) {
                esPrimer = false // Si és divisible, canviem la variable a false
            }
        }

        // Si la variable esPrimer encara és certa, això significa que el nombre és primer
        if (esPrimer) {
            println("$num és primer.")
        } else {
            // En cas contrari, el nombre no és primer
            println("$num no és primer.")
        }
    }

    // Inicialitzem una variable per trobar el primer nombre primer immediatament superior
    var seguentPrimer = num + 1
    var seguent = false


    while (!seguent) {
        // Inicialitzem una variable per comprovar si el nombre és primer
        var esPrimer = true

        // Iterem a través dels nombres des de 2 fins a seguentPrimer - 1 per comprovar si seguentPrimer és divisible per algun d'ells
        for (i in 2 until seguentPrimer) {
            if (seguentPrimer % i == 0) {
                esPrimer = false // Si és divisible, canviem la variable a false
            }
        }
        // Si la variable esPrimer encara és certa, això significa que hem trobat el primer nombre primer immediatament superior
        if (esPrimer) {
            seguent = true
        } else {
            // En cas contrari, incrementem seguentPrimer per seguir buscant
            seguentPrimer++
        }
    }

    // Mostrem el primer num superior
    println("El primer immediatament superior a $num és el $seguentPrimer")
}





