package ITB_12c_Col_leccions_III

/*
A vegades una bombeta està fosa. I se te’n va la llum mentre estàs jugant a l’última expansió del Final Fantasy XIV. Aleshores has de jugar amb els diferencials fins que trobes quin és el diferencial que et fa anar-te’n la llum i el Final Fantasy XIV
Entrada

L’usuari començarà amb un nombre 𝑁
que diu quantes línies té el programa La primera línea és el nom del diferencial que està espatllat i fa saltar els ploms. Després venen 𝑁−1

línies que mostren quin diferencial actives. En aquest cas, si el diferencial està a true, el poses a false, i si està a false, el poses a true. L'estat default d'un diferencial és false. (és a dir, la seva primera activació el posarà a true) Si apareix el diferencial espatllat, tots cauen i per tant tots es posen a false.
Sortida

Has de dir quants diferencials queden a true i quants diferencials queden a false després de tota l'execució. No comptis el diferencial espatllat ni com a true ni com a false.
Exemple d'Entrada

9
NEVERA
PC
LLUMS
LAVABO
NEVERA
PC
LLUMS
LLUMS
CALDERA

Exemple de Sortida
2 2

 */

/*

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    val diferencials = mutableMapOf<String, Boolean>() //creem una mutablelist
    for (i in 0 until casos) { //per cada cas llegim el diferencial
        val diferencial = scan.next()
        if (diferencial !in diferencials) { //si el diferencial no està al diccionari dona true
            diferencials[diferencial] = true
        } else {
            diferencials[diferencial] = !diferencials[diferencial]!! //si el diferencial està al diccionari canvia el seu valor
        }
    }
    val trueDiferencials = diferencials.filter { it.value }.count() //filtrem els diferencials que estan a true i els comptem
    val falseDiferencials = diferencials.filter { !it.value }.count() //filtrem els diferencials que estan a false i els comptem
    println("$trueDiferencials $falseDiferencials") }//escrivim el resultat
}


 */