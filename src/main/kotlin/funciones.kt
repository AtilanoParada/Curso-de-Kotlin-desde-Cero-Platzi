import java.util.*

fun funciones() {
    //Ejercicios de los videos 25 y 26 del curso de Platzi.
    //Una función es un código que se ejecuta cada vez que lo llamamos.
    //La sintaxis de una función empieza con la palabra reservada "fun", luego el nombre de la función, seguido de los
    //parámetros dentro de paréntesis, estas son las variables que le damos a la función para que las use en el código
    // que tiene dentro. Sigue el tipo de retorno, es decir el tipo de resultado que regresará la función, para terminar
    //tenemos el código que va dentro de los corchetes.
    //Cuando no indicamos un tipo de retorno y no tiene la palabra reservada return dentro del código es un tipo Unit
    //y no se retornara nada.
    val fraseAleatoria = "En Platzi nunca paramos de aprender."
    val fraseOrdenadaAleatoriamente = randomCase(fraseAleatoria)

    imprimirFrase(fraseOrdenadaAleatoriamente)

    //Las funciones de extensión nos permiten extender del comportamiento del tipo que tenemos, en este caso String, y
    // que se utilicen como si fuesen frases directamente del tipo.
    //Utilizaremos la función randomCase() en extención del String
    val fraseAleatoriaExtendida = "En Platzi nunca paramos de aprender.".randomCaseExtendida()

    println("Tu frase extendida es: $fraseAleatoriaExtendida")

    //Ejercicios del video 27 del curso de Platzi.
    //Parámetros nombrados son los parámetros que se les asigna la variable de la función al valor que se le
    // quiere pasar. Esta función también tiene un parámetro por defecto, segundoNombre = "".
    imprimirNombre(nombre = "Atilano", apellido = "Parada")

}

//La siguiente es una función que retorna un valor String.
fun randomCase(frase : String) : String {
    val numAleatorio = 0..99
    val resultadoAleatorio = numAleatorio.random()

    return if (resultadoAleatorio.rem(2) == 0) {
        frase.uppercase(Locale.getDefault())
    } else {
        frase.lowercase(Locale.getDefault())
    }
}

//La siguiente es una función Unit que no retorna valores.
fun imprimirFrase(frase : String) {
    println("Tu frase es: $frase")
}

fun String.randomCaseExtendida() : String {
    val numAleatorio = 0..99
    val resultadoAleatorio = numAleatorio.random()

    return if (resultadoAleatorio.rem(2) == 0) {
        //"this" se utiliza como comodín para el String que lo está llamando.
        this.uppercase(Locale.getDefault())
    } else {
        this.lowercase(Locale.getDefault())
    }
}

//La siguiente es una función para el ejemplo de la función con parámetros nombrados
fun imprimirNombre(nombre : String, segundoNombre : String = "", apellido : String) {
    println("Mi nombre completo es $nombre $segundoNombre $apellido.")
}