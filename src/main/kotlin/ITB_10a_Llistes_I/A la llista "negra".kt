import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() // leemos la cantidad de casos
    scanner.nextLine() // avanzar a la siguiente línea

    repeat(casos) {
        val actividades = scanner.nextLine().split(" ") // Leemos las actividades
        val numeroVeces = scanner.nextInt() // Leemos la cantidad de veces que Marc observa a Albert
        val horasObservadas = mutableSetOf<Int>() // Crea un conjunto para almacenar las horas observadas

        repeat(numeroVeces) {
            horasObservadas.add(scanner.nextInt()) // almacenar las horas observadas por Marc
        }

        scanner.nextLine() // Avanzamos a la siguiente línea

        var nivelShitlist = 0 // inicializa el nivel de Shitlist a 0
        var jugandoLoL = false // Variable de control para saber si se está jugando LoL
        var vecesLoL = 0 // Contador para llevar la cuenta de las veces que se juega LoL

        for (hora in horasObservadas) {
            val actividad = actividades[hora - 15] // Obtiene la actividad de Albert en la hora observada por Marc

            if (actividad != "Eclipse" && !arrayOf("HollowKnight", "DarkSouls", "Zelda").contains(actividad)) {
                nivelShitlist++ // Incrementa el nivel si la actividad no es permitida
            }

            if (actividad == "LoL") {
                if (!jugandoLoL) {
                    nivelShitlist++ // Aumentamos el nivel si se comienza a jugar LoL
                    jugandoLoL = true // Actualizamos la variable de control
                    vecesLoL++ // Incrementmos el contador de veces jugando LoL
                } else {
                    nivelShitlist += 2 // Aumentamos el nivel si se juega LoL en horas consecutivas
                    vecesLoL++ // IncrementaMOS el contador de veces jugando LoL
                }
            }
        }

        if (vecesLoL == numeroVeces) { // Verifica si se juega LoL en todas las horas
            nivelShitlist = numeroVeces * 2 // Actualiza el nivel si se juega LoL en todas las horas
        }

        println("Nivell de Shitlist: $nivelShitlist") // imprimimos el nivel de Shitlist
    }
}
