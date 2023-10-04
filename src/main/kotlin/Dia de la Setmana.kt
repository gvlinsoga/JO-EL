/*
Garfield odia els dilluns. Ajuda a Garfield a saber el dia de la setmana. Sap la gent que comença Grau Superior a dia d'avui qui és Garfield? Ho he de preguntar.
Entrada:Cada cas és d'una línea, i conté un número 𝑁 de l'1 al 7, els dos inclosos.
Sortida:Per cada cas es dira "Monday", "Tuesday", etc. fins a "Sunday" Sí, els anglesos comencen la setmana per Sunday, pero també van amb sandàlies i mitjons, per tant la seva opinió no compta*/

import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val numeroSetmana = scanner.nextInt()

    //Comparem el numero de la setmana amb els dies de la setmana
    when  {
        numeroSetmana == 1 -> println("Monday")
        numeroSetmana == 2 -> println("Tuesday")
        numeroSetmana == 3 -> println("Wednesday")
        numeroSetmana == 4 -> println("Thursday")
        numeroSetmana == 5 -> println("Friday")
        numeroSetmana == 6 -> println("Saturday")
        numeroSetmana == 7 -> println("Sunday")

        else -> println("Error") // Si el número de dia no és correcte
    }
}