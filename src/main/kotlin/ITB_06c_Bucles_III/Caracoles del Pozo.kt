package ITB_06c_Bucles_III

/*Hi ha una endevinalla que diu així:

“Un cargol cau a un pou de cinc metres de profunditat. Durant el dia puja tres metres, però per la nit cau dos metres. Quants dies triga en sortir del pou?” Pensa, pensa ... però la resposta és ... 3 (ho veus?).

fer un programa que ajudi als cargols a saber quan temps trigaran en sortir d’un pou, tenint en compte que no tots els cargols tenen la mateixa capacitat de pujar durant el dia ni de caure per la nit.
Entrada

L’entrada comença amb un número indicant la quantitat de casos de prova que vindran a continuació.

Cada cas de prova consta de: Una terna de números separats per un espai que indicaran:
Copy

-   Profunditat en metres del pou on cau el cargol (enter positiu entre 1 i 999)
-   Metres que puja el cargol durant el dia (enter positiu entre 0 i 999)
-   Metres que cau el cargol durant la nit (enter positiu entre 0 i 999)

Sortida

Per cada cas de prova, caldrà respondre, en una sola línia:
Copy

-   Si el cargol pot sortir del pou:
Número de dies que triga el cargol en sortir del pou
-   Si no pot sortir del pou:
Missatge “NO”
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()
    repeat(casProva){ //per cada cas de prova es repeteix el bucle
        val profunditat = scanner.nextInt()
        val puja = scanner.nextInt()
        val baixa = scanner.nextInt()
        var dia = 0 //inicialitzem el dia a 0
        var metres = 0 //inicialitzem els metres a 0
        while (metres < profunditat) { //mentre els metres siguin menors que la profunditat
            dia++ //augmentem el dia
            metres = metres + puja //augmentem els metres amb els metres que puja
            if (metres < profunditat) { //si els metres són menors que la profunditat
                metres =  metres - baixa //restem els metres amb els metres que baixa
            }
        }
        if (metres == profunditat) { //si els metres són iguals que la profunditat
            println(dia) //imprimim el dia
        } else { //si no
            println("NO") //imprimim NO
        }
    }
}