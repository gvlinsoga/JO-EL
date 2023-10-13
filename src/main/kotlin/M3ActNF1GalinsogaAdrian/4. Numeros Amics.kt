package M3ActNF1GalinsogaAdrian

/*
Dos números enteros y positivos a y b son amigos si la suma de los divisores enteros
del primero, a, excepto él mismo es igual a la suma de los divisores del segundo, b,
salvo él mismo. Ejemplo: Los números 33 y 16 son amigos
Haz un programa que solicite dos enteros positivos y que determine si son amigos.

 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introdueix un número: ")
    val num1 = scanner.nextInt()
    println("Introdueix un número: ")
    val num2 = scanner.nextInt()

    // Inicialitzem una variable per comprovar si els nombres són amics
    var sonAmics = false

    // Inicialitzem variables per emmagatzemar la suma dels divisors de cada nombre
    var sumaDivisors1 = 0
    var sumaDivisors2 = 0

    // Iterem a través dels nombres des de 1 fins a num1 - 1 per comprovar si num1 és divisible per algun d'ells
    for (i in 1 until num1) {
        if (num1 % i == 0) {
            sumaDivisors1 += i // Si és divisible, sumem el divisor a la variable sumaDivisors1
        }
    }

    // Iterem a través dels nombres des de 1 fins a num2 - 1 per comprovar si num2 és divisible per algun d'ells
    for (i in 1 until num2) {
        if (num2 % i == 0) {
            sumaDivisors2 += i // Si és divisible, sumem el divisor a la variable sumaDivisors2
        }
    }

    // Comprovem si la suma dels divisors de num1 és igual a num2 i viceversa
    if (sumaDivisors1 == num2 && sumaDivisors2 == num1) {
        sonAmics = true // Si és així, els nombres són amics
    }

    // Mostrem el resultat
    if (sonAmics) {
        println("Els nombres $num1 i $num2 són amics.")
    } else {
        println("Els nombres $num1 i $num2 no són amics.")
    }
}