import java.util.*
fun main()
{
    val scanner = Scanner(System.`in`)
    val jiden = scanner.nextLine()
    val drump = scanner.nextLine()

    if (drump < jiden)  // Compara 'drump' con 'jiden'. Si 'drump' es menor que 'jiden', imprime "Jiden"
    { println("Jiden") }
    else if (drump > jiden ) // Si la comparación anterior es falsa, compara 'drump' con 'jiden'.
    { println("Drump") }// Si 'drump' es mayor que 'jiden', imprime "Drump"
    else println("No") //  Si ninguna de las condiciones anteriores es verdadera, significa que son iguales, imprime "No"
}

