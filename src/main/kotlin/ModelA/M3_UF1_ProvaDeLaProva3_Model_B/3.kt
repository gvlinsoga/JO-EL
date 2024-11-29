package M3_UF1_ProvaDeLaProva3_Model_B


/*
3.
Programa que rep 2 dates de naixement (dd/mm/aaaa), cadascuna pertany a un nom també introduït per l'usuari, el programa haurà de comparar ambdues dates per determinar la diferència entre elles i digui quina persona és més gran.

Exemple:

Entrada
Laura 15/10/1998
Pablo 19/11/2000

Sortida
2 anys 1 mes 4 dies
Laura és major que Pablo

 */


fun main() {
    val (name1, date1) = readLine()!!.split(" ")
    val (name2, date2) = readLine()!!.split(" ")

    val (day1, month1, year1) = date1.split("/").map { it.toInt() }
    val (day2, month2, year2) = date2.split("/").map { it.toInt() }

    val diffYears = year2 - year1
    val diffMonths = month2 - month1
    val diffDays = day2 - day1

    println("$diffYears anys $diffMonths mesos $diffDays dies")
    if (diffYears > 0) {
        println("$name1 és major que $name2")
    } else if (diffYears < 0) {
        println("$name2 és major que $name1")
    } else {
        if (diffMonths > 0) {
            println("$name1 és major que $name2")
        } else if (diffMonths < 0) {
            println("$name2 és major que $name1")
        } else {
            if (diffDays > 0) {
                println("$name1 és major que $name2")
            } else if (diffDays < 0) {
                println("$name2 és major que $name1")
            } else {
                println("Les edats són iguals")
            }
        }
    }
}