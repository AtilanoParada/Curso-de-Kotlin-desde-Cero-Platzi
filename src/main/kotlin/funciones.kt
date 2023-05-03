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
    imprimirNombre(nombre = "José", apellido = "Fernández")

    //Ejercicios del video 28 del curso Platzi.
    //Lambdas, estas son funciones anónimas.
    //Aquí tenemos una función anónima (Lambda) que tiene un parámetro de tipo cadena String y que retorna un
    //entero (Int). El "it" dentro de la lambda se refiere al parámetro de entrada, en este caso el String.
    //El it puede ser reemplazado por cualquier palabra que no sea reservada inmediatamente después de los corchetes,
    //por ejemplo: "{ valor -> "
    val myLambda : (String) -> Int = { it.length }
    val lambdaEjecutada = myLambda("Hola Platzi")

    println(lambdaEjecutada)

    //Podemos pasar las lambdas como parámetros a otras funciones
    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)

    println(longitudDeSaludos)

    //Ejercicios del video 29 del curso de Platzi
    //Las High Order Function o Funciones de Orden Superior son las funciones que reciben otras funciones como
    //parámetros.
    //Funciones de orden superior, guardamos el resultado de la función superFuncion, dandole como datos una cadena y
    //una lambda, para que la función de orden superior se encargue de abrir la caja que es el lambda.
    //Las lambdas como parámetro en una función se suelen poner en la última posición por legibilidad, ya que nos
    //permite sacar la lambda fuera de la función.
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!") { valor -> valor.length }

    println(largoDelValorInicial)

    //El siguiente ejemplo es para obtener una función de una función, en este ejemplo será para devolver una lambda.
    //Se obtiene una variable con una lambda integrada.
    val lambda : () -> String = funcionInception(nombre = "Patricia")
    //Invocamos el valor de la lambda para que nos de la cadena de texto.
    val valorLambda = lambda()

    println(valorLambda)
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

//Función de orden superior
//la variable de entrada block es una sintaxis recomendada por Kotlin para nombrar las lamdas que llegan como
//variables de entrada
fun superFuncion(valorInicial : String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

//La siguiente es una funci[on que retorna una lambda.
fun funcionInception(nombre : String) : () -> String {
    return {
        "Hola $nombre, desde la lambda."
    }
}