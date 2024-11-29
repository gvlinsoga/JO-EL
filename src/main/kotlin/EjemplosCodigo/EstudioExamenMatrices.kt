package EjemplosCodigo

fun main() {
    val f = readLine()!!.toInt() // Leer el número de filas de la matriz
    val c = readLine()!!.toInt() // Leer el número de columnas de la matriz
    val matriz = Array(f) { Array(c) { "" } } // Crear una matriz de tamaño f x c (vacía, de Strings)

    var filaSpiderman = -1 // Variable para almacenar la fila donde está "SPIDERMAN"
    var columnaSpiderman = -1 // Variable para almacenar la columna donde está "SPIDERMAN"

    for (i in 0 until f) { // Iterar sobre las filas de la matriz
        val fila = readLine()!!.split(" ") // Leer una fila completa como una lista de Strings
        for (j in 0 until c) { // Iterar sobre las columnas de la fila
            matriz[i][j] = fila[j] // Asignar cada valor a la posición correspondiente en la matriz
            if (matriz[i][j] == "SPIDERMAN") { // Verificar si el valor leído es "SPIDERMAN"
                filaSpiderman = i // Guardar la fila donde se encuentra
                columnaSpiderman = j // Guardar la columna donde se encuentra
            }
        }
    }

    if (filaSpiderman > 0) { // Si "SPIDERMAN" no está en la primera fila
        println(matriz[filaSpiderman - 1][columnaSpiderman]) // Imprimir el valor de la fila anterior en la misma columna
    } else { // Si está en la primera fila o no existe
        println("NO") // Imprimir "NO"
    }
}




/*
Explicación paso a paso

    Entrada del número de filas y columnas:

val f = readLine()!!.toInt()
val c = readLine()!!.toInt()

    f y c contienen el número de filas y columnas de la matriz. Estas dimensiones son necesarias para construir la matriz y recorrerla.

Crear la matriz vacía:

val matriz = Array(f) { Array(c) { "" } }

    Aquí se define una matriz bidimensional de tamaño f x c. Cada celda contiene un string vacío "" inicialmente.

Variables para la posición de "SPIDERMAN":

var filaSpiderman = -1
var columnaSpiderman = -1

    Estas variables almacenarán la posición (fila y columna) donde se encuentre "SPIDERMAN". Inicialmente, tienen valores de -1 para indicar que no se ha encontrado todavía.

Rellenar la matriz y buscar "SPIDERMAN":

for (i in 0 until f) { // Recorre cada fila
    val fila = readLine()!!.split(" ") // Leer una fila como una lista de palabras
    for (j in 0 until c) { // Recorre cada columna de la fila
        matriz[i][j] = fila[j] // Asigna cada palabra a la matriz
        if (matriz[i][j] == "SPIDERMAN") { // Si la palabra es "SPIDERMAN"
            filaSpiderman = i // Guardar la fila
            columnaSpiderman = j // Guardar la columna
        }
    }
}

    Este bloque llena la matriz con los valores de entrada. Mientras se llena, se verifica si alguna celda contiene "SPIDERMAN", y si es así, se guardan las coordenadas en filaSpiderman y columnaSpiderman.

Verificar la fila de "SPIDERMAN":

if (filaSpiderman > 0) {
    println(matriz[filaSpiderman - 1][columnaSpiderman])
} else {
    println("NO")
}

    Si "SPIDERMAN" se encuentra en una fila superior a la primera (filaSpiderman > 0), se imprime el contenido de la celda que está justo encima (es decir, en filaSpiderman - 1 y la misma columna).
    Si "SPIDERMAN" está en la primera fila (filaSpiderman == 0) o no se encuentra en la matriz (filaSpiderman == -1), imprime "NO".
 */