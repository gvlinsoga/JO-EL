fun main() {
    val numCasos = readLine()!!.toInt()

    repeat(numCasos) {
        val datos = readLine()!!.split(" ").map { it.toInt() }
        val n = datos[0]
        val alturas = datos.subList(1, n + 1)

        var maxAltura = Int.MIN_VALUE
        var minAltura = Int.MAX_VALUE

        for (altura in alturas) {
            if (altura > maxAltura) {
                maxAltura = altura
            }
            if (altura < minAltura) {
                minAltura = altura
            }
        }

        val diferenciaMaxima = maxAltura - minAltura
        println(diferenciaMaxima)
    }
}
