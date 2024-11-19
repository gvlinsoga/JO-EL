package ITB_06d_Bucles_IV

/*
> (problema NO patrocinado por Square Enix)

¿Has oído hablar del famoso MMORPG aclamado por la crítica: FINAL FANTASY XIV? Si es así, enhorabuena, seguro que tu vida es mejor que la de los que no lo han hecho. Si no es así... ¿A qué esperas?

Sea como sea seguro que SÍ que conoces la famosa cancioncilla que dice: "Un elefante se balanceaba sobre la tela de una araña..." pues verás, en FINAL FANTASY XIV existe una adorable raza de pequeños humanoides que ¡Adora balancearse! El problema es que las arañas les aterran, pero como son muy temerarios, si ven una telaraña intentarán balancearse... Aunque siempre respetando la capacidad de la tela, no queremos ningún accidente.
ENTRADA

La primera linea indica el número de casos de prueba a considerar. Cada caso de prueba consta de dos líneas: la primera es una secuencia de palabras entre las que aparecerán los términos "Lalafel, Telaranya o Aranya" (Es importante que utiliceis la -ny- porque java se pone nervioso con la -ñ- ) . La segunda línea es un número 𝑁

que determina la capacidad de las telarañas.
SALIDA

La frase "Hay x telarañas llenas." donde x es el número de telarañas COMPLETAMENTE OCUPADAS. Ten en cuenta que una telaraña solo quedará ocupada cuando en la secuencia aparezcan tantos Lalafel como los necesarios para ocuparla. También piensa que NO QUEREMOS ACCIDENTES por lo que siempre que haya una telaraña completa, los Lalafels que no quepan esperaran a que aparezca otra telaraña. Por último recuerda: LOS LALAFELS ODIAN LAS ARAÑAS Si aparece una araña en la secuencia, todos los lalafels que estaban balanceándose se irán corriendo y las telas se romperán, quedando inutilizables.

Exemple d'entrada


6
Lalafel
2
Lalafel, Lalafel, Telaranya
0
Lalafel, Lalafel, Telaranya, Lalafel, Lalafel, Telaranya
10
Lalafel, Lalafel, Telaranya
2
Lalafel, Lalafel, Telaranya, Aranya
2
Lalafel, Lalafel, Lalafel, Lalafel, Telaranya, Telaranya
1

Exemple de sortida


Hay 0 telaranyas llenas.
Hay 0 telaranyas llenas.
Hay 0 telaranyas llenas.
Hay 1 telaranyas llenas.
Hay 0 telaranyas llenas.
Hay 2 telaranyas llenas.


 */
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casProva = scanner.nextInt()
    scanner.nextLine()

    for (i in 1..casProva) {
        val frase = scanner.nextLine().lowercase() // Llegim la frase i la convertim a minúscules
        val paraules = frase.split(" ") // Dividim la frase en paraules
        val num = scanner.nextInt() // Llegim el número que es fa servir per comptar 'L'
        scanner.nextLine() // Consumim el salt de línia restant

        var telaranyes = 0 // Inicialitzem el comptador de telaranyes a 0
        var lalafels = 0 // Inicialitzem el comptador de 'L' a 0
        var aranyes = 0 // Inicialitzem el comptador de 'A' a 0
        var telaranyesPlenes = 0 // Inicialitzem el comptador de telaranyes plenes a 0

        for (j in 1 until frase.length) { // Iterem a través de cada caràcter de la frase
            when (frase[j]) { // Comprovem el caràcter actual
                'L' -> lalafels++ // Si és 'L', incrementem el comptador de lalafels
                'T' -> telaranyes++ // Si és 'T', incrementem el comptador de telaranyes
                'A' -> aranyes++ // Si és 'A', incrementem el comptador d'aranyes
            }
            if (lalafels == num) { // Si el comptador de lalafels arriba al número especificat
                telaranyesPlenes++ // Incrementem el comptador de telaranyes plenes
                lalafels = 0 // Reiniciem el comptador de lalafels
            }
            if (aranyes > 0) { // Si hi ha alguna aranya
                telaranyes = 0 // Reiniciem el comptador de telaranyes
                lalafels = 0 // Reiniciem el comptador de lalafels
            }
        }
        println("Hay $telaranyesPlenes telaranyas llenas.") // Imprimim el nombre de telaranyes plenes
    }
}
