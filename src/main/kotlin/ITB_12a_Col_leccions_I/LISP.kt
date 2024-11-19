package ITB_12a_Col_leccions_I

/*
 A vegades tinc que fer coses amb Lisp. Afortunadament, cada cop menys. LISP (Lots of Innecessary and Superfluous Parenthesis) és un llenguatge conegut per la quantitat absurda de parentesis que té.

Ho dic en serio

Entrada:
La primera línea es el nombre de casos de prova. Cada cas conté una líniea amb caràcters ( , ) , i qualsevol altre, que serà ignorat.


Sortida:
Per cada cas d'entrada has de dir si la string LISP es correcta. És a dir, no es deixa cap parèntesis sense tancar, i no tanca cap que no estigués obert d'abans

 */

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt() //llegim el nombre de casos
    scan.nextLine()
    for (i in 1..casos) { //per cada cas
        val lisp = scan.nextLine() //llegim la string
        val pila = Stack<Char>() //creem la pila
        var correcte = true //inicialitzem la variable correcte a true
        for (j in 0 until lisp.length) { //per cada caràcter de la string
            if (lisp[j] == '(') { //si el caràcter és un (
                pila.push('(') //empilem un (
            } else if (lisp[j] == ')') { //si el caràcter és un )
                if (pila.isEmpty()) { //si la pila està buida
                    correcte = false //canviem la variable correcte a false
                } else { //si la pila no està buida
                    pila.pop() //desempilem un (
                }
            }
        }
        if (pila.isEmpty() && correcte) { //si la pila està buida i correcte és true
            println("SI") //escrivim SI
        } else { //si la pila no està buida o correcte és false
            println("NO") //escrivim NO
        }
    }
}