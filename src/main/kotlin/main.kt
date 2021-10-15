// Las constantes van definidas fuera de la función, como lo siguiente:
const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")
    // Variables:
    // Kotlin infiere los tipos, se puede ser bien explicito: var dinero : Int = 10, o simplemente:
    // para definir variables de lectura y escritura se utiliza el keyword 'var'
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    // para definir variables de sólo lectura se utiliza el keyword 'val'
    val nombre = "Maria"
    println(nombre)
    println(PI)

// Tipos de variables
    // Boleanos
    val boolean : Boolean = true
    // Long
    val numeroLargo = 3L
    // Punto flotante
    val double : Double = 2.7182
    // Valores flotantes
    val float : Float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor.minus(segundoValor)
    println(tercerValor)

    // Con los strings se puede usar interpolacion
    val apellido = "Salinas"
    val juan = "Juan"
    val nombreCompleto = "Mi nombre es: $juan $apellido"
    println(nombreCompleto)

// Estructuras de control
    // IF
    val name = ""

    val mensaje = if (name.length > 4) {
        "Tu nombre es largo!"
    }else if(name.isEmpty()){
        "Name esta vacio"
    }else{
        "Tienes un nombre corto"
    }

    println(mensaje)

    // WHEN
    val nombreColor = "Carmesi"

    when(nombreColor){
        "Amarillo" -> {
            println("El amarillo es el color de la alegria")
        }
        "Rojo", "Carmesi" -> println("Este color simboliza el calor")
        else -> println("Error. No tengo informacion del color")
    }

    val code = 501
    when(code){
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Codigo desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 46
    val mensajeZapatos = when(tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42, 44 -> "Casi no nos quedan!"
        45 -> "Lo siento, no tenemos disponible"
        else -> "Estos zapatos sólo vienen en talla 41, 42, 43, 44 y 45"
    }

    println(mensajeZapatos)

}