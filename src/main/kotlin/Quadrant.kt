/*
En un joc 2D el punt (0,0) és l’origen del món i les
coordenades (x,y) de qualsevol objecte situat en aquest
món poden ser positives o negatives. Segons el signe de les
coordenades l’objecte es troba en el quadrant 1, 2, 3 o 4.o va dir
"mai més ningú de 29 anys" El tercer tenia 26. Bambino... sí, ja us ho imagineu.


Fes un programa que donades les coordenades x i y del centre d’un enemic
i que digui a quin quadrant es troba.

ATENCIÓ: Si una de les coordenades val 0, llavors l’enemic es
troba en DOS QUADRANTS.
Si les coordenades són 0,0, llavors es troba al centre.
Cal indicar-ho correctament a l’usuari.

Entrada:
Cada entrada conté un únic cas amb les coordenades X i Y de l'enemic.

Sortida:
Per a cada cas cal indicar els quadrant en els que es troba, ordenats i separats per coma.
 */

import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    val y = scanner.nextInt()


    when {
        (x == 0 && y == 0) -> println("1,2,3,4") //Si les coordenades són 0,0, llavors es troba als quatre quadrants.
        (x > 0 && y > 0) -> println("1") //Si les coordenades són positives, es troba en el quadrant 1.
        (x < 0 && y > 0) -> println("2") //Si les coordenades són negatives, es troba en el quadrant 2.
        (x < 0 && y < 0) -> println("3") //Si les coordenades són negatives, es troba en el quadrant 3.
            (x > 0 && y < 0) -> println("4") //Si les coordenades són positives, es troba en el quadrant 4.
            (x == 0 && y > 0) -> println("1,2") //Si una de les coordenades val 0, llavors l’enemic es troba en DOS QUADRANTS.
            (x == 0 && y < 0) -> println("3,4") //Si una de les coordenades val 0, llavors l’enemic es troba en DOS QUADRANTS.
            (x > 0 && y == 0) -> println("1,4") //Si una de les coordenades val 0, llavors l’enemic es troba en DOS QUADRANTS.
            (x < 0 && y == 0) -> println("2,3") //Si una de les coordenades val 0, llavors l’enemic es troba en DOS QUADRANTS.
    }

}