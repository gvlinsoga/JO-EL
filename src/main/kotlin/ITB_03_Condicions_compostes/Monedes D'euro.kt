package ITB_03_Condicions_compostes

/*
L'euro (EUR o €) és la moneda oficial de disset països de la Unió Europea (UE). El nom d'euro va ser aprovat pel Consell Europeu en la reunió celebrada a Madrid els dies 15 i 16 de desembre de 1995. Les monedes i bitllets d'Euro van entrar en circulació l'1 de gener de 2002 en els 12 estats de la Unió Europea que van adoptar l'euro en aquell any.

Hi ha vuit denominacions de monedes d'euro, que van des d'un cèntim a dos euros (l'euro es divideix en cent cèntims).

Dissenyeu un programa que, donat un nombre enter pel teclat que representa un import en cèntims d’euro, ho descompongui en monedes. Així doncs, minimitzant el nombre de monedes ha de retornar el nombre de monedes de dos euros, un euro, cinquanta cèntims, vint cèntims, deu cèntims, cinc cèntims, dos cèntims i un cèntim necessaris per representar l'import.
Entrada

L'entrada serà un nombre enter entre 0 i 999
Sortida

Nombre de monedes de dos euros, un euro, cinquanta cèntims, vint cèntims, deu cèntims, cinc cèntims, dos cèntims i un cèntim necessaris per representar l'import de l'entrada.

Una linia per moneda.
Exemple d'Entrada


542

Exemple de Sortida


2
1
0
2
0
0
1
0
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    var monedes2 = 0
    var monedes1 = 0
    var monedes50 = 0
    var monedes20 = 0
    var monedes10 = 0
    var monedes5 = 0
    var monedes2c = 0
    var monedes1c = 0

    if (num >= 200) {
        monedes2 = num / 200
        monedes1 = (num % 200) / 100
        monedes50 = ((num % 200) % 100) / 50
        monedes20 = (((num % 200) % 100) % 50) / 20
        monedes10 = ((((num % 200) % 100) % 50) % 20) / 10
        monedes5 = (((((num % 200) % 100) % 50) % 20) % 10) / 5
        monedes2c = ((((((num % 200) % 100) % 50) % 20) % 10) % 5) / 2
        monedes1c = (((((((num % 200) % 100) % 50) % 20) % 10) % 5) % 2) / 1
    } else if (num >= 100) {
        monedes1 = num / 100
        monedes50 = (num % 100) / 50
        monedes20 = ((num % 100) % 50) / 20
        monedes10 = (((num % 100) % 50) % 20) / 10
        monedes5 = ((((num % 100) % 50) % 20) % 10) / 5
        monedes2c = (((((num % 100) % 50) % 20) % 10) % 5) / 2
        monedes1c = ((((((num % 100) % 50) % 20) % 10) % 5) % 2) / 1
    } else if (num >= 50) {
        monedes50 = num / 50

    }
    println(monedes2)
    println(monedes1)
    println(monedes50)
    println(monedes20)
    println(monedes10)
    println(monedes5)
    println(monedes2c)
    println(monedes1c)

}