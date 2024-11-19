import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

        var dado1 = scanner.nextInt()
        var dado2 = scanner.nextInt()
        var dado3 = scanner.nextInt()
        var dado4 = scanner.nextInt()

        if (dado1 == dado2 && dado2 == dado3 && dado3 == dado4) {
            println("POKER")
        } else if (dado1 == dado2 && dado2 == dado3 || dado2 == dado3 && dado3 == dado4 || dado1 == dado3 && dado3 == dado4 || dado1 == dado2 && dado2 == dado4) {
            println("TRIO")
        } else if (dado1 == dado2 || dado2 == dado3 || dado3 == dado4 || dado1 == dado3 || dado1 == dado4 || dado2 == dado4) {
            println("PARELLA")
        } else {
            println("RES")
        }

}
