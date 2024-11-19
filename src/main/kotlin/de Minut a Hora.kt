import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var minutos = scanner.nextInt()
    val hores = minutos / 60
    val minutsRestants = minutos % 60
    println("$hores:$minutsRestants")
}