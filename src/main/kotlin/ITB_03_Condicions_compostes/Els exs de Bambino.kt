package ITB_03_Condicions_compostes//Quan Bambino va sortir amb el seu primer ex, l'ex tenia 18 anys.
//Bambino va dir "mai més ningú de 18 anys" El segón ex de bambino tenia 29.
//Bambino va dir "mai més ningú de 29 anys" El tercer tenia 26. Bambino... sí, ja us ho imagineu.

/*
Entrada:
Cada cas de prova consisteix en 4 números, 𝐴,𝐵,𝐶,𝑁
, sent 𝐴,𝐵,𝐶 l'edat dels exs de bambino, que sempre seran diferents i iguals o majors de 18, i 𝑁
l'edat del seu últim interés, també igual o major de 18.
Sortida:
Per cada cas de prova s'ha de dir SI si l'interés no té l'edat dels exs de bambino i NO en cas contrari.

 */

import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt() //18
    val b = scanner.nextInt() //29
    val c = scanner.nextInt() //26
    val n = scanner.nextInt() //Edat d'interés de Bambino

    if (n != a && n != b && n != c) println("SI")  //Si l'interés no té l'edat dels exs de Bambino
    else println("NO") //En cas de que tingui l'edat dels exs de Bambino
}