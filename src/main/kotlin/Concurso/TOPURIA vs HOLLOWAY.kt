package Concurso

fun main() {
    // Puntos acumulados por cada luchador
    var puntosTopuria = 0
    var puntosHolloway = 0

    // Tiempo máximo por ronda en segundos (5 minutos)
    val tiempoRonda = 300
    var koRealizado = false

    println("¡Bienvenido al octógono virtual! El combate comienza.")

    // Iterar por las 5 rondas
    for (ronda in 1..5) {
        println("Ronda $ronda:")
        var tiempoConsumido = 0
        var tiempoRestante = tiempoRonda

        // Mientras quede tiempo en la ronda
        while (tiempoConsumido < tiempoRonda) {
            print("Introduce el golpe (ej. T LK o H J): ")
            val input = readLine()?.split(" ") ?: continue
            if (input.size != 2) continue // Validar entrada

            val luchador = input[0]
            val golpe = input[1]
            var puntos = 0
            var tiempoGolpe = 0

            // Determinar puntos y tiempo del golpe
            when (golpe) {
                "LK" -> {
                    puntos = 2
                    tiempoGolpe = 50
                }
                "J" -> {
                    puntos = 5
                    tiempoGolpe = 150
                }
                "G" -> {
                    puntos = 10
                    tiempoGolpe = 200
                }
                "KO" -> {
                    if (ronda >= 3) {
                        puntos = 5000
                        koRealizado = true
                        tiempoGolpe = tiempoRestante // Consumir el tiempo restante de la ronda
                    } else {
                        puntos = -1
                        tiempoGolpe = 120
                    }
                }
                else -> {
                    puntos = -1
                    tiempoGolpe = 120
                }
            }

            // Actualizar el tiempo consumido
            tiempoConsumido += tiempoGolpe
            tiempoRestante = tiempoRonda - tiempoConsumido

            // Asignar los puntos al luchador correspondiente
            when (luchador) {
                "T" -> puntosTopuria += puntos
                "H" -> puntosHolloway += puntos
                else -> println("Luchador no válido. Introduce T o H.")
            }

            // Si hay KO, termina el combate inmediatamente
            if (koRealizado) {
                println("¡KO realizado en la ronda $ronda!")
                println("WINS (KO)")
                println("Puntos finales: Topuria: $puntosTopuria, Holloway: $puntosHolloway")
                return
            }

            // Si el tiempo restante es 0, salir del bucle sin usar break
            if (tiempoRestante <= 0) {
                tiempoConsumido = tiempoRonda // Asegurar salida del bucle
            }
        }
    }

    // Mostrar resultado final si no hubo KO
    println("¡El combate ha terminado!")
    println("Puntos finales: Topuria: $puntosTopuria, Holloway: $puntosHolloway")

    when {
        puntosTopuria > puntosHolloway -> println("WINS Topuria ($puntosTopuria)")
        puntosHolloway > puntosTopuria -> println("WINS Holloway ($puntosHolloway)")
        else -> println("DRAW ($puntosTopuria)")
    }
}
