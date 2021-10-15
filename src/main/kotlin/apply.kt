fun main(args: Array<String>){

// Apply: Nos permite realizar operaciones sobre una variable y luego devolver el valor

    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .apply {
            removeIf { movil -> movil.contains("Google") }
        }

    println(moviles)

    //val colores : MutableList<String>? = mutableListOf("Azul", "Amarillo", "Rojo")

    val colores : MutableList<String>? = mutableListOf("Azul", "Amarillo", "Rojo")
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }

}
