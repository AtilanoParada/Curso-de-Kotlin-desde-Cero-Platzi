//Las constantes, se generan antes de entrar en la función, se declara en tiempo de compilación,
//a diferencia de las variables que se generan en tiempo de ejecución
const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    //variable común y modificable
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)

    //variable de solo lectura, no se puede modificar
    val nombre = "María"
    println(nombre)
    println(PI)

    //Boolean = true or false
    val boolean = true
    //Long = números extremadamente largos
    val numeroLargo = 3L
    //Double = números con puntos flotantes
    val double = 2.7182
    //Float = n[umeros flotantes
    val float = 1.1f

    //En kotlin las variables son objetos y se pueden realizar operaciones predefinidas
    val primerValor = 20
    val segundoValor = 10
    //Presionar Ctrl + B sobre el operador, en este caso minus, lleva a la declaración de la función
    val tercerValor = primerValor.minus(segundoValor)
    println(tercerValor)

    //Las cadenas de texto son una parte fundamental del código, estas también nos permiten sumar(concatenar)
    //dos cadenas de texto, por ejemplo: nombre + apellido
    val apellido = "Sánchez"
    //En la línea siguiente se usarán las propiedades de Kotlin para imprimir las variables dentro de una
    //cadena de texto con el símbolo $
    val nombreCompleto = "Su nombre es $nombre $apellido"
    println(nombreCompleto)

    //Video 13 del curso de Platzi
    if (nombre.isNotEmpty()) {
        println("El largo de nuestra variable nombre es ${nombre.length}.")
    } else {
        println("Error, la variable nombre está vacía.")
    }

    //Está es la manera simplificada del if:
    if (nombre.isNotEmpty()) println("El largo de nuestra variable nombre es ${nombre.length}.") else
        println("Error, la variable nombre está vacía.")

    val mensaje : String = if (nombre.length > 4) {
        "Tú nombre es largo!"
    } else if (nombre.isEmpty()) {
        "El nombre está vacío"
    } else {
        "Tienes un nombre corto."
    }
    println (mensaje)

    //Video 14 del curso de Platzi
    //When es como un if, pero compara la misma variable, si solo tiene una línea se pueden omitir los corchetes.
    val nombreColor = "Amarillo"

    when (nombreColor) {
        "Amarillo" -> println("El amarillo es el color de la alegría.")
        "Rojo", "Carmesí" -> {
            println("Este color simboliza la pasión.")
        }
        else -> println("Error, no tengo la información del color.")
    }

    val code = 200

    when (code) {
        in 200..299 -> println("Todo ha ido bien.")
        in 400.rangeTo(500) -> println("Algo ha fallado.")
        else -> println("Código desconocido, algo ha fallado.")
    }

    val tallaDeZapatos = 41

    val mensaje2: String = when (tallaDeZapatos) {
        41, 43 -> "Tenemos disponible."
        42, 44 -> "Casi no nos quedan."
        45 -> "Lo siento no tenemos disponible."
        else -> "Estos zapatos solo vienen en tallas desde el 41 al 45"
    }
    println(mensaje2)

    //Ejercicios del video 15 del curso de Platzi
    var contador = 10

    while (contador > 0) {
        println("El valor del contador es $contador.")
        contador--
    }

    do {
        println("Generando número aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El número generado es $numeroAleatorio.")
    } while (numeroAleatorio > 50)

    ciclos()

    nullables()

    listas()
}