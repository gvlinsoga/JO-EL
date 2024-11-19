package ITB_12c_Col_leccions_III


/*
En Battlefield, els usuaris poden seleccionar el mapa que volen després de cada partida. El mapa que sol guanyar es Desierto del Sinaí, el més divertit i popular dels mapes. El preferit de tothom.

Fes un sistema de votacions per als mapes.

Entrada:
La primera línia indica els casos de prova a considerar Cada cas de prova comença amb un nombre 𝐾
que indica les línies del cas Després, vindran 𝐾

línies, amb noms de mapes

Sortida:
Per cada cop que surti un mapa, suma-li 1 als vots que té. Torna el nom del mapa més votat. Es garantitza que no hi haurà empat.

Exemple d'Entrada
2
3
Desierto del Sinaí
Tsaritsyn
Desierto del Sinaí
1
Amiens

Exemple de Sortida
Desierto del Sinaí
Amiens

 */



import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    for (i in 1..casos) {
        val n = scan.nextInt()
        val vots = mutableMapOf<String, Int>()
        for (j in 0 until n) {
            val mapa = scan.next()
            vots[mapa] = vots.getOrDefault(mapa, 0) + 1
        }
        println(vots.maxByOrNull { it.value }!!.key)
    }
}