package ITB_06c_Bucles_III

/*
En el videojoc League of Legends una de les parts més importants per al jungla (un dels rols), per exemple un Rammus, és matar al primer gran monstre (conegut popularment com a “blau” o “vermell”). Per fer això necessites ajuda del teu equip, com per exemple un Twitch. No obstant, alguns del teu equip poden tenir habilitats de verí…).

Entrada:
La primera línia indica els casos de prova a considerar Cada cas de prova és una linea amb 3 nombres el primer, hp, es la vida màxima del monstre de la jungla. El segón, rammus , es l’atac del Rammus. El tercer, twitch , es l’atac del verí del twitch Es garantitza que els tres nombres son positius i majors de 0.

Sortida:
En cada ronda, rammus i twitch atacaran al monstre de la jungla, restant-li tanta vida com el seu atac.
Primer sempre atacara rammus i després twitch. Per a cada cas de prova s’haura de respondre Si ha estat l’atac de rammus el que ha matat el monstre, (fet que la vida baixes a 0 o menys), escriureu, RAMMUS, en cas de que fos el verí de twitch escriureu TWITCH.
Després del nom escriureu quantes rondes s’han necessitat per a matar el monstre.

 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()

    for (i in 1..casProva) { //per cada cas de prova es repeteix el bucle
        val hp = scanner.nextInt()
        val rammus = scanner.nextInt()
        val twitch = scanner.nextInt()
        var vida = hp //inicialitzem la vida a la vida màxima
        var rondes = 0 //inicialitzem el nombre de rondes a 0


        while (vida > 0) { //mentre la vida sigui superior a 0
            vida -= rammus //restem l'atac del rammus a la vida
            rondes++ //sumem 1 al nombre de rondes
            if (vida <= 0) { //si la vida és superior a 0
                println("RAMMUS $rondes") //imprimim RAMMUS i el nombre de rondes

            } else { //si no
                vida -= twitch //restem l'atac del twitch a la vida
                if (vida <= 0) {
                    println("TWITCH $rondes") //imprimim TWITCH i el nombre de rondes
                }
            }
        }
    }
}
