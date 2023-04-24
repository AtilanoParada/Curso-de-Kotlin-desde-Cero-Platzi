//Las constantes, se generan antes de entrar en la función, se declara en tiempo de compilación,
//a diferencia de las variables que se generan en tiempo de ejecución
const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    //variable com[un y modificable
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
}