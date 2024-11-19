package ITB_04_Alternatives_IV

/*En tots els jocs a on hi ha un teclat hi ha un menú per fer varies coses, en que pots seleccionar varies opcions,
i cada tecla farà una cosa diferent.

Demana amb Scanner una tecla i fes un switch a on cada opció representi una acció, segons aquesta taula. Torna l’opció escollida per pantalla.

Entrada:
Cada cas es una sola línea amb l'acció demanada

Sortida:
L'acció executada segons la taula
*/

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val tecla = scanner.nextLine() // Llegeix la tecla

    when (tecla) {
        "Q" -> println("Skill 1") // Si la tecla és Q, imprimeix Skill 1
        "W" -> println("Skill 2") // Si la tecla és W, imprimeix Skill 2
        "E" -> println("Skill 3") // Si la tecla és E, imprimeix Skill 3
        "R" -> println("Ultimate") // Si la tecla és R, imprimeix Ultimate
        "B" -> println("Recall") // Si la tecla és B, imprimeix Recall
        "D" -> println("Bronzes never use summoners") // Si la tecla és D, imprimeix Bronzes never use summoners
        "F" -> println("Bronzes never use summoners") // Si la tecla és F, imprimeix Bronzes never use summoners
        else -> println("Error") // Si la tecla no és cap de les anteriors, imprimeix Error
    }
}