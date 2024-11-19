package Concurso

/*Cada año la liebre y la tortuga hacen una carrera en el bosque. La liebre, atlética y dotada de unas condiciones excepcionales, siempre es la favorita ante la tortuga, grande y de movimientos lentos. Sin embargo, la liebre tiene un handicap a tener presente: su superioridad natural hace que no entrene correctamente, y, por tanto, le aparezca la fatiga antes. La tortuga tiene una constitución que la hace más resistente y constante, aunque con el tiempo desciende su rendimiento.
Entrada

La entrada comienza con un número indicando la cantidad de casos de prueba que vendrán a continuación. Cada caso de prueba consta de:

Una línea con un entero entre 1 y 10000 que indica la distancia en metros de la carrera
Una línea con un entero entre 5 y 20 que indicará la velocidad de la tortuga, expresada en metros/minuto. Cada 10 minutos de carrera, la tortuga baja un metro/minuto la velocidad, hasta alcanzar un mínimo de 5 metros/minuto, en que ya no baja más.
Una línea con dos valores enteros, que indicarán las siguientes características de la liebre:
El primer valor será estará entre 5 y 500, y representa la velocidad, expresada en metros/minuto
El segundo valor indicará el número de minutos que aguanta la liebre de carrera continua, sin detenerse para descansar, y será un valor entre 1 y 100. Cuando descansa la liebre, siempre lo hace por 5 minutos si en el momento de d detenerse va por delante de la tortuga y 3 minutos de lo contrario (detrás o igual).

Salida

El programa debe mirar, a cada minuto, dónde se encuentran la liebre y la tortuga. Por cada caso de prueba, habrá que responder:

Si la liebre llega a la meta y la tortuga no, escribirá LLEBRE (que es liebre en catalán)
Si la tortuga llega a la meta y la liebre no, escribirá TORTUGA
*/

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val metrosCarrera = scanner.nextInt()
        var velocidadTortuga = scanner.nextInt()
        var velocidadLiebre = scanner.nextInt()
        var minutosCarreraContinua = scanner.nextInt()
        var tortuga = 20
        var liebre = 500

        for (j in 1..metrosCarrera) {
            if (velocidadTortuga in 5 .. 20) {
                if (j % 10 == 0) {
                    velocidadTortuga -= 1
                }

            }
        }
        println()
    }
}