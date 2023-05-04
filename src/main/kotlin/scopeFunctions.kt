fun scopeFunctions() {
    //Ejercicios del video 30 del curso de Platzi.
    //Las scope functions son las funciones de Kotlin que nos permiten realizar ciertas operaciones de manera
    //más dinámica con una sintaxis más concisa, por ejemplo, una función que nos permite cambiar el valor de una
    //variable sin tener que estar repitiendo el nombre de la variable.
    //La palabra reservada Let permite ejecutar código solamente cuando una variable nullable no es nula, esto evita
    //el tener un error de tipo NullPointerException.
    var nombre : String? = null

    //El let es un operador de safe calls, se le debe de agregar "?" después de la variable, antes de llamar al let.
    nombre?.let {
        valor -> println("El valor no es nulo, es $valor.")
    }
    nombre = "José"
    nombre?.let {
        valor -> println("El valor no es nulo, es $valor.")
    }
    
    //Ejercicios del video 31 del curso de Platzi.
    //El With nos permite acceder directamente a las propiedades de una variable que le pasamos como parámetro, de
    //esta forma evitamos repetir llamar a la variable en varias líneas, utilizando "this" o sus propiedades.
    val colores = listOf("Azul", "Amarillo", "Rojo")

    //En el siguiente ejemplo $this se refiere a la variable y $size que es una propiedad de la variable se usa
    //sin llamarla.
    with(colores) {
        println("Nuestros colores son $this.")
        println("Está lista tiene una cantidad de colores de $size.")
    }

    //Ejercicios del video 32 del curso de Platzi.
    //Run, ejecuta una serie de operaciones inmediatamente después de declarar una variable.
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .run {
            //El removeIf elimina los elementos que cumplan una condición.
            //El contains es una condición, retorna un verdadero o falso si contiene la palabra indicada.
            removeIf { movil -> movil.contains("Google") }
            this
        }

    println(moviles)
}