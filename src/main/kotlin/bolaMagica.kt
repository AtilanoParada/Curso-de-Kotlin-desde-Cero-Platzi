//Ejercicios de los videos 35 & 36 del curso de Platzi.
// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "\uD83E\uDD14"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun bolaMagica() {
    println("Hola soy tu bola 8 mágica en Kotlin. ¿Cuál de estas opciones deseas realizar?")
    println("1. Realizar una pregunta.")
    println("2. Revisar todas las respuestas.")
    println("3. Salir.")

    val valorIngresado = readLine()

    when (valorIngresado) {
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }
}

fun realizarPregunta() {
    println("¿Qué pregunta deseas realizar?")
    readLine()
    println("Así que esa era tu pregunta... La respuesta a eso es:")

    val respuestaGenerada = respuestas.keys.random()

    println(respuestaGenerada)
}

fun mostrarRespuestas() {
    println("Selecciona una opción:")
    println("1. Revisar todas las respuestas.")
    println("2. Revisar solo las respuestas afirmativas.")
    println("3. Revisar solo las respuestas dudosas.")
    println("4. Revisar solo las respuestas negativas.")

    val opcionIngresada = readLine()

    when(opcionIngresada) {
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_DUDOSA)
        "4" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_NEGATIVA)
        else -> println("Respuesta no valida. Adios.")
    }
}

fun mostrarRespuestasPorTipo(tipoDeRespuesta : String = "TODOS") {
    when(tipoDeRespuesta) {
        //For each a diferencia de maps no devuelve un valor, lo cual lo hace ideal para imprimir una línea sin
        //tener que devolver un valor
        "TODOS" -> respuestas.keys.forEach { respuesta -> println(respuesta) }
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
            .also { respuestasPositivas -> println(respuestasPositivas.keys) }
        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
            .also { respuestasDudosas -> println(respuestasDudosas.keys) }
        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
            .also { respuestasNegativas -> println(respuestasNegativas.keys) }
    }
}

fun salir () {
    println("¡Hasta luego!")
}

fun mostrarError() {
    println("Haz elegido una opción no valida, intenta de nuevo.")
}