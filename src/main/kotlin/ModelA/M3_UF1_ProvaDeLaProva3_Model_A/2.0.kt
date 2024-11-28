package M3_UF1_ProvaDeLaProva3_Model_A
/*
2. Programa que recull la temperatura (valors amb decimals) mínima i màxima de cada dia durant una setmana.
Fes que el programa doni la següent informació:
La temperatura mitjana de cada dia en Celsius
La menor temperatura a Kelvin i quin dia va ser
La temperatura més alta a Fahrenheit i quin dia va ser
*/

import java.util.Scanner

fun main() {
    // Arrays para almacenar las temperaturas mínimas y máximas de cada día
    val tempMin = DoubleArray(7)
    val tempMax = DoubleArray(7)

    // Leer las temperaturas para cada día
    println("Introduce la temperatura mínima y máxima (en Celsius) para cada día de la semana:")
    for (i in 0 until 7) {
        print("Día ${i + 1} - Temperatura mínima: ")
        tempMin[i] = readLine()?.toDoubleOrNull() ?: 0.0

        print("Día ${i + 1} - Temperatura máxima: ")
        tempMax[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }

    // Calcular y mostrar la temperatura media de cada día
    println("\nTemperatura media de cada día (en Celsius):")
    for (i in 0 until 7) {
        val media = (tempMin[i] + tempMax[i]) / 2
        println("Día ${i + 1}: $media °C")
    }

    // Encontrar la menor temperatura en Kelvin y el día correspondiente
    val menorTemp = tempMin.minOrNull()
    val diaMenorTemp = tempMin.withIndex().minByOrNull { it.value }?.index?.plus(1)
    val menorTempKelvin = menorTemp?.plus(273.15)

    println("\nLa menor temperatura fue ${menorTemp}°C ($menorTempKelvin K) y ocurrió el día $diaMenorTemp.")

    // Encontrar la mayor temperatura en Fahrenheit y el día correspondiente
    val mayorTemp = tempMax.maxOrNull()
    val diaMayorTemp = tempMax.withIndex().maxByOrNull { it.value }?.index?.plus(1)
    val mayorTempFahrenheit = mayorTemp?.times(9.0 / 5.0)?.plus(32)

    println("\nLa mayor temperatura fue ${mayorTemp}°C ($mayorTempFahrenheit °F) y ocurrió el día $diaMayorTemp.")
}