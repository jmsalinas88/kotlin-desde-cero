import java.lang.Exception

fun main(args : Array<String>){
    var nombre : String? = null
    try{
        throw NullPointerException("Referencia nula")
    }catch(excepcion: NullPointerException){
        println("Ha ocurrido un error")
    }finally{
        println("Finalmente Ha ocurrido un error ... Cerrando aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try{ primerValor / segundoValor} catch (exception: Exception){ 0 }
    println(resultado)

}