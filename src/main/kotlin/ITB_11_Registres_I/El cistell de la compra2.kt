import java.util.*

data class Producto(val nombre: String, val precio: Float)

fun main() {
    val scan = Scanner(System.`in`)
    scan.useLocale(Locale.US)

    val casos = scan.nextInt()
    val productos = mutableListOf<Producto>()

    // Lee los datos de cada producto y agrégalo a la lista
    repeat(casos) {
        val nombre = scan.next()
        val precio = scan.nextFloat()
        val producto = Producto(nombre, precio)
        productos.add(producto)
    }

    // Lee el nombre del producto que queremos comprobar
    val productoBuscado = scan.next()

    // Busca el producto en la lista
    val productoEncontrado = productos.find { it.nombre == productoBuscado }

    // Verifica si el producto fue encontrado
    if (productoEncontrado != null) {
        // Filtra los productos con nombres alfabéticamente menores que el producto encontrado
        val productosAnteriores = productos
            .filter { it.nombre < productoEncontrado.nombre }
            .sortedBy { it.nombre }

        // Imprime el mensaje si el producto fue encontrado
        print("SI, M'HA COSTAT ${productoEncontrado.precio}")

        // Imprime información solo sobre el último producto anterior
        val ultimoProductoAnterior = productosAnteriores.lastOrNull()
        if (ultimoProductoAnterior != null) {
            print(" I TAMBE TINC ${ultimoProductoAnterior.nombre} A ${ultimoProductoAnterior.precio}")
        }

    } else {
        // Imprime el mensaje si el producto no fue encontrado
        println("NO N'HI HAVIA")
    }
}
