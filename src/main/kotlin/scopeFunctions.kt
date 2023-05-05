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

    //Ejercicios del video 33 del curso de Platzi
    //Apply, Esta función nos permite realizar operaciones sobre una variable y luego devolver el valor, al contrario
    //de la función Run que necesita devolver "this" al final, apply lo devuelve automáticamente. También si lo
    //combinamos con una función de safe calls crea una función apply segura, solo ejecutará el apply si no es nula.
    val moviles2= mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3").apply {
            removeIf{ movil -> movil.contains("Xiaomi")}
        }

    println(moviles2)

    //Esta función puede funcionar como el with, solo que el apply acepta valores nullables.
    val colores2 : MutableList<String>? = null

    colores2?.apply {
        println("Nuestros colores son $this.")
        println("La cantidad de colores es $size.")
    }
    colores2?.add("Amarillo")
    colores2?.add("Azul")
    colores2?.add("Rojo")
    colores?.apply {
        println("Nuestros colores son $this.")
        println("La cantidad de colores es $size.")
    }
}