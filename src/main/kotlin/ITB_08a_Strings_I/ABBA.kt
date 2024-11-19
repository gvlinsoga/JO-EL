import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val numCasos = scanner.nextInt()
    scanner.nextLine()

    repeat(numCasos) { // Iterar sobre los casos de prueba
        // Leer los nombres separados por coma y la última parte después de " i "
        val membres = scanner.nextLine().split(", ")
        val ultimos = membres.last().split(" i ")

        val listaNombres = membres.dropLast(1) + ultimos // Combina todos los nombres en una lista
        var grup = ""


        for (miembro in listaNombres) { // Recorremos cada miembro de la frase original
            var primerCaracter = miembro[0].uppercaseChar()
            primerCaracter = when (primerCaracter) {
                'A', 'Á', 'À'-> 'A'
                'E', 'É', 'È'-> 'E'
                'I', 'Í', 'Ì'-> 'I'
                'O', 'Ó', 'Ò' -> 'O'
                'U', 'Ú', 'Ù'-> 'U'
                else -> primerCaracter
            }
            grup += primerCaracter
        }
        println(grup)
    }

}

