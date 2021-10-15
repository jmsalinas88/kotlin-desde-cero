fun main (args: Array<String>){

// Scope functions: Son unas funciones que tiene Kotlin que nos permite
    // realizar ciertas operaciones de una forma más dinámica con una sintaxis más concisa

    // Let + safe calls: Nos permite ejecutar un codigo solo cuando nuestra variable nullable no sea nula
    var nombre : String? = null
    nombre?.let {
            valor -> println("El nombre no es nulo, es $valor")
    }
    nombre = "Juan"

    nombre?.let {
            valor -> println("El nombre no es nulo, es $valor")
    }

}