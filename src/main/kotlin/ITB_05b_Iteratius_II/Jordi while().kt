package ITB_05b_Iteratius_II/*Jordi While() és un streamer famós. Com tots els streamers, el que més por li fa es que l'hi posin 3 strikes a la compta, perquè aleshores li tancarien
Entrada:
Cada cas és una linea amb un nombre desconegut de números. Els números seran, o bé un nombre positiu, amb els viewers que ha tingut Jordi, o bé -1, que significa que li han posat un strike. La línea acaba al tercer strike.
Sortida:
Per cada cas de prova caldrà respondre: Quants videos ha fet jordi fins a rebre el tercer strike (sense comptar els vídeos amb strike)
 */

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var strike = 0
    var videos = 0


    while (strike < 3) {
        var viewers = scanner.nextInt()
        if (viewers == -1) {
            strike++
        } else {
            videos++
        }
    }
    println(videos)
}
