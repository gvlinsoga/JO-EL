import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casosDePrueba = scanner.nextInt()

    for (i in 1..casosDePrueba) {
        val numeroComprado = scanner.nextInt() // Importe total que Celia compró
        val solicitudes = IntArray(100) // Array para almacenar hasta 100 solicitudes
        var contadorSolicitudes = 0

        // Leemos las solicitudes hasta encontrar un 0
        var solicitud = scanner.nextInt()
        while (solicitud != 0) {
            solicitudes[contadorSolicitudes] = solicitud
            contadorSolicitudes++
            solicitud = scanner.nextInt() // Leer la siguiente solicitud
        }

        // Ordenamos el array de solicitudes para aceptar las más pequeñas primero
        solicitudes.sort(0, contadorSolicitudes) // Solo ordenamos hasta el número de solicitudes ingresadas

        var sumaSolicitudes = 0
        var solicitudesAceptadas = 0

        // Recorrer las solicitudes y aceptar hasta alcanzar el límite
        for (j in 0 until contadorSolicitudes) {
            if (sumaSolicitudes + solicitudes[j] <= numeroComprado) {
                sumaSolicitudes += solicitudes[j]
                solicitudesAceptadas++
            }
        }

        println(solicitudesAceptadas)
    }
}
