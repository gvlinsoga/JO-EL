package ITB_07a_Arrays_I

/*
Ja saps escriure arrays d'enters. Ara escriurem arrays de Strings.

Entrada:
El problema serà de múltiples línies. La primera tindrà un nombre, 𝐾
que et dirà el tamany de l'array que has de crear després vindran 𝐾 línies, tantes com el tamany de l'array, amb una String cadascuna L'última serà 𝑁, una posició de l'array a on has d'accedir. Es garanteix que 𝑁<𝐾

Sortida:
Tornaràs K+1 linies. Primer serà l'array sencer escrit, amb salt de línea entre cada string. La segona serà el contingut de l'array a la posició 𝑁

(recorda que la primera posició es 0).

Exemple d'Entrada

6
HOLA
MARC
KERNEL
POMES
PREFERIRIA ESTAR JUGANT AL FACTORIO ABANS QUE FER AQUEST EXERCICI
COM A MINIM FINS QUE SURTI SHADOWLANDS.
4

Exemple de Sortida

HOLA
MARC
KERNEL
POMES
PREFERIRIA ESTAR JUGANT AL FACTORIO ABANS QUE FER AQUEST EXERCICI
COM A MINIM FINS QUE SURTI SHADOWLANDS.
PREFERIRIA ESTAR JUGANT AL FACTORIO ABANS QUE FER AQUEST EXERCICI

 */



import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val k = scan.nextInt() //tamany array
    val array = arrayListOf<String>() //creem l'array

    //Fem un bucle per llegir l'array de Strings
    for (i in 0 .. k) {
        array.add(scan.nextLine())
    }
    //Llegim la posició que volem mostrar
    val position = 0

    //Mostrem l'array
    for (j in 0 ..  k) {
        println("${array[j]} ")
    }
    println()
    //Mostrem l'element de l'array a la posició indicada
    println(array[position+1])

}