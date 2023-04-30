fun nullables() {
    //Ejercicios del video 19 del curso de Platzi
    //El símbolo '?', después del tipo en la declaración de variables indica que es nullable
    var nombre : String? = null

    //El símbolo '?', después de la variable cuando se va a ejecutar una acción indica una Safe Call y
    //Kotlin ignorará la línea de código si es null
    println(nombre?.length)

    //El Try Catch sirve para gestionar posibles errores en ejecución, excepciones
    //Dentro del Try se prueba el código propenso a errores, y en el Catch se ejecuta un mensaje de error
    //o se maneja este error; Finally se ejecuta al final a[un si no pasa por Catch
    try {
        //El doble bang (!!) se ocupa cuando se est[a seguro de que no es null la variable cuando se ejecute el código
        //WARNING, esto se debe de usar con cuidado, ya que existe posbilidades de que la variable sea null aunque
        //estemos seguros de que no sea null
        //nombre!!.length

        //la palabra reservada throw lanza un error para que lo gestione el catch sin ejecutar código que
        // genere el error
        throw NullPointerException("Referencia nula.")
    } catch (e : NullPointerException) {
        println("¡Ha ocurrido un error! Cerrando aplicación...")
    } finally {
        println("Ya se termino el Try Catch.")
    }

    //También se puede asignar el try a una variable
    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor } catch (e : Exception) { 0 }
    println(resultado)

    //Ejercicios del video 20 del curso de Platzi
    var nombre2 : String? = null
    //El operador Elvis (?:) se ocupa para asignar un valor por defecto cuando una variable nullable es null
    val caracteresDeNombre : Int = nombre?.length ?: 0
    println(caracteresDeNombre)

}