fun main (args: Array<String>){

// With: Nos permite acceder directamente a las propiedades de una variable que le pasamos como parametro
    // De esta forma, podemos evitar repetir llamar a la variable en varias lineas sino que simplemente utilizamos "this"
    // o directamente utilizamos sus propiedades

    val colores = listOf("Azul", "Amarillo", "Rojo")
    with(colores){
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }
}