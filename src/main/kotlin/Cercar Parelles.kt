import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val c1 = scanner.nextInt()
    val c2 = scanner.nextInt()
    val c3 = scanner.nextInt()


    if (c1 == c2 || c2 == c3 || c1 == c3  ) {
        println("SI")
    } else {
        println("NO")
}

    //when ((c1 == c2 && c2 == c3) && (c1 ==c3)) {
      //  println("SI")
        //else -> println("NO")

}
