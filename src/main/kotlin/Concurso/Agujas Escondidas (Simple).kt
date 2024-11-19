package Concurso

/*Si alguna vez necesitas saber la hora y no tienes un reloj, el peor sitio al que dirigiros es una relojería.
Pero eso ya lo sabéis de algún ejercicio anterior...

A veces, te llevas un buen susto debido a que sólo ves una aguja y se debe a que una de las agujas se ha escondido detrás de la otra.

Antiguamente los relojes eran completamente mecánicos y todas las agujas se movian a una velocidad constante.

La tecnología ha hecho que las agujas de los relojes avancen a saltos: la de los segundos avanza de tal forma que hace un
salto de 6º cada segundo, la aguja de los minutos hace el mismo salto pero cada 60 segundos y, finalmente, la aguja de las
horas hace este salto cada 12 minutos.

Entrada
Cada caso contiene la hora que marca un reloj en formato HH:MM. Se garantiza que todas las horas son correctas.
HH contiene un valor entre 01 i 12. MM contiene un valor entre 00 i 59.

Salida
Para cada caso debe indicarse "SI" en el caso que la hora que marca el reloj contiene ambas agujas en la misma dirección,
o "NO" en caso contrario.
 */


import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val partes = input.split(":")
    if (partes.size == 2) {
        val hora = partes[0].toInt()
        val minutos = partes[1].toInt()

    if (hora in 1 .. 12 && minutos in 0 .. 59)
    {
        val horaSalto = (hora % 12) * 30 + minutos * 0.5
        val minutosSaltos = minutos * 6
        val segundosSaltos = minutos * 0.1

        if (horaSalto.toInt() == minutosSaltos) {
            println("SI")
        } else {
            println("NO")
        }
    }
    }


}

