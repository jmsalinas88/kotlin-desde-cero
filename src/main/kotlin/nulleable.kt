fun main(args: Array<String>){

    //Definiendo variable nulleable:
    var segundoNombre : String ? = "Antonio"

    /* Safe Calls: Son una herramienta de Kotlin que nos ayuda a ejectura un codigo
       cuando una variable del tipo nullable no es nula
       Ej:
     */

    // Se imprime el length del string solo cuando la variable no sea null
    println(segundoNombre?.length)
    // Double bang: Este operador se indica con dos símbolos de exclamación !!
    // con esto le decimos al compilador que sabes que en este punto la variable no puede ser nula
    // Recomendación: Utilizarlos lo menos posible, se considera mala práctica

    // Elvis operator: Nos ayuda a devolver un valor cuando el elemento es nulo
    var nombre : String? = null
    val caracteresDeNombre : Int = nombre?.length ?: 0
    println(caracteresDeNombre)

}