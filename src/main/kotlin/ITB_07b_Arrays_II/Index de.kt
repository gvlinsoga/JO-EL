import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casProva = scan.nextInt() //casos de prova

    for (i in 0 until casProva){
        val tamany = scan.nextInt() //tamany array
        val array = arrayOfNulls<Int>(tamany) //creem l'array

        //Fem un bucle per llegir l'array de Strings
        for (i in 0 .. tamany -1 ) {    //llegim l'array
            array[i] = scan.nextInt() //llegim cada element de l'array
        }
        val foli = scan.nextInt()
        var esta = 0
        var noEsta = 0
        var aux = false

        for (j in 0 .. tamany -1) {

            if(foli == array[j]) {
                aux = true
                esta = array.indexOf(foli)

            } else if (foli != array[j]) {
                noEsta = -1

            }
        }
        if (aux == true){
            println(esta)
        } else {
            println(noEsta)
        }

    }

}


