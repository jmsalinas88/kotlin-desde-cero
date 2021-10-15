fun main (args : Array<String>){

//Las listas por defecto son inmutables, se dividen en dos tipos:
    //Inmutables: No se pueden modificar, Kotlin provee métodos para consultas
    //Mutables: Se pueden modificar, Kotlin provee métodos para cambiar o remover elementos

    val listaDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listaDeNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor = listaDeNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length > 3 }
    println(listaVacia)

    val myArray = arrayOf(1, 2, 3, 4)
    println(myArray)
    println("Nuestro array ${myArray.toList()}")

// Sorting
    val numerosDeLoteria = listOf(11, 22, 43, 56, 78, 66)
    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)
    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50  }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros =  numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)

// Maps: Estructura de datos clave-valor

    val edadSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )

    println(edadSuperHeroes)

    val edadSuperHeroesMutables = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroesMutables)
    edadSuperHeroesMutables.put("Wolverine", 45)
    println(edadSuperHeroesMutables)
    edadSuperHeroesMutables["Storm"] = 30
    println(edadSuperHeroesMutables)

    val edadIronMan = edadSuperHeroesMutables["Ironman"]
    println(edadIronMan)

    edadSuperHeroesMutables.remove("Ironman")
    println(edadSuperHeroesMutables)

    println(edadSuperHeroesMutables.keys)
    println(edadSuperHeroesMutables.values)

// Sets: No admiten elementos duplicados
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1, 2, 3, 4)
    numerosFavoritos.add(5)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet: Int? = numerosFavoritos.firstOrNull{ numero -> numero > 2}
    println(valorDelSet)


}