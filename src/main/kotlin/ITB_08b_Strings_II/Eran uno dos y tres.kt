import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numCasos = scanner.nextInt() //Leer el num de casos

    repeat(numCasos) {
        val tropas = scanner.nextInt() //leemos el numero de tropas
        scanner.nextLine()
        val nombreTropa = scanner.nextLine().split(",") //leemos el nombre de la tropa separado con el split

        val mosqueperro: MutableList<String> = mutableListOf() //guardamos las tropas que tengan mosqueperro
        val noMosqueperro: MutableList<String> = mutableListOf() //aquí guardamos los que no tienen mosqueperro

        for (tropa in 0 until tropas) { //recorremos dentro de tropas
            if ("mosqueperro" in nombreTropa[tropa].lowercase() && "antimosqueperro" !in nombreTropa[tropa].lowercase()) { //verificamos que mosqueperro esté dentro de nombreTropa y antimosqueperro
                mosqueperro.add(nombreTropa[tropa]) //lo añadimos a la lista de mosqueperro
            } else {
                noMosqueperro.add(nombreTropa[tropa]) //en caso de que no esté lo añadimos a la lista noMosqueperro
            }
        }
        //imprimimos las dos listas mutables
        println(mosqueperro)
        println(noMosqueperro)
    }
}
