import java.util.*;

fun main() {
    val scan = Scanner(System.`in`)
    val numCas = scan.nextInt()
    val tamany = scan.nextInt()
    repeat(numCas) { //iterem sobre el cas de prova
        val pokemons = ArrayList<Int>() //creem una llista de pokemons
        val nivells = ArrayList<Int>()  //creem una llista de nivells

        for (i in 0 until tamany) { //iterem sobre el tamany de la llista y afegim els pokemons a la llista
            pokemons.add(scan.nextInt()) 
        }
        for (i in 0 until tamany) { //iterem sobre el tamany de la llista y afegim els nivells a la llista
            nivells.add(scan.nextInt())
        }
        val mapaPokemon = mutableMapOf<Int, Int>() //creem un mapa mutable de pokemons

        for (i in pokemons.indices) { //iterem sobre els pokemons
            val id = pokemons[i] //guardem el id del pokemon
            val nivell = nivells[i] //guardem el nivell del pokemon
            if (!mapaPokemon.containsKey(id) || mapaPokemon[id]!! < nivell) { //si el mapa de pokemons no conté la clau id o el mapa de pokemons és més petit que el nivell
                mapaPokemon[id] = nivell //afegim el nivell al mapa de pokemons
            }
        }

        val resultat = mutableListOf<Int>() //creem una llista mutable de resultats
        for (i in pokemons.indices) { //iterem sobre els pokemons
            if (nivells[i] == mapaPokemon[pokemons[i]]) { //si el nivell és igual al mapa de pokemons
                if (!resultat.contains(pokemons[i])) { //si el resultat no conté els pokemons
                    resultat.add(pokemons[i])//afegim els pokemons al resultat
                }
            }
        }

        println(resultat.joinToString(" ")) //mostrem el resultat

    }
}
