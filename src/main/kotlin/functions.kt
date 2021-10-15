fun main (args: Array<String>){

    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)

    imprimirNombre(nombre = "Juan", apellido = "Salinas")

    // Lambdas: Son funciones anónimas, es decir, no se declaran. Se utilizan directamente como una expresión

    val myLambda : (String) -> Int = {
        it.length
    }
    val lambdaEjecutada : Int = myLambda("Hola mundo")
    println(lambdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println("Cantidad de saludos: $longitudDeSaludos")

//High Order functions: Funciones que reciben funciones

    val largoDelValorInicial = superFuncion(valorInicial = "Hola!", block = { valor ->
        valor.length
    })

    println("Largo del valor: $largoDelValorInicial")
    val lamdbaInception : () -> String = functionInception(nombre = "Juan")
    val valorLambda : String = lamdbaInception()
    println(valorLambda)

}

fun superFuncion(valorInicial: String , block : (String) -> Int) : Int {
    return block(valorInicial)
}

fun functionInception(nombre: String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}

fun imprimirFrase(frase: String) : Unit {
    println("Tu frase es: $frase")
}

fun String.randomCase(): String {
    val numeroAleatorio = 0 .. 99
    val resultadoAleatrorio = numeroAleatorio.random()
    return if(resultadoAleatrorio.rem(2) == 0){
        this.toUpperCase()
    }else{
        this.toLowerCase()
    }
}

fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido :String){
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}