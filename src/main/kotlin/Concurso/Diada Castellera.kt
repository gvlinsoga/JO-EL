package Concurso

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce el número de rondas:")
    val n = scanner.nextInt()

    if (n <= 0) {
        println("ERROR: Número de rondas no válido")
        return
    }

    var descargadosABoomers = 0
    var descargadosAMilenials = 0
    var descargadosBBoomers = 0
    var descargadosBMilenials = 0

    for (ronda in 1..n) {
        println("Introduce los datos de la ronda $ronda (8 números):")
        val intentadosABoomers = scanner.nextInt()
        val descargadosABoomersRonda = scanner.nextInt()
        val intentadosAMilenials = scanner.nextInt()
        val descargadosAMilenialsRonda = scanner.nextInt()
        val intentadosBBoomers = scanner.nextInt()
        val descargadosBBoomersRonda = scanner.nextInt()
        val intentadosBMilenials = scanner.nextInt()
        val descargadosBMilenialsRonda = scanner.nextInt()

        // Validar que los descargados no superan los intentados
        if (descargadosABoomersRonda > intentadosABoomers ||
            descargadosAMilenialsRonda > intentadosAMilenials ||
            descargadosBBoomersRonda > intentadosBBoomers ||
            descargadosBMilenialsRonda > intentadosBMilenials
        ) {
            println("ERROR")
            return
        }

        // Sumar los castillos descargados por cada grupo y categoría
        descargadosABoomers += descargadosABoomersRonda
        descargadosAMilenials += descargadosAMilenialsRonda
        descargadosBBoomers += descargadosBBoomersRonda
        descargadosBMilenials += descargadosBMilenialsRonda
    }

    // Total descargados por cada colla
    val totalDescargadosA = descargadosABoomers + descargadosAMilenials
    val totalDescargadosB = descargadosBBoomers + descargadosBMilenials

    // Determinar la colla ganadora
    val collaGanadora = if (totalDescargadosA > totalDescargadosB) "A" else "B"

    // Determinar la categoría con más castillos descargados
    val categoriaGanadora = if (descargadosABoomers + descargadosBBoomers > descargadosAMilenials + descargadosBMilenials) {
        "BOOMERS"
    } else {
        "MILENIALS"
    }

    // Mostrar resultados
    println(collaGanadora)
    println(categoriaGanadora)
}
