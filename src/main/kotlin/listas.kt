fun listas() {
    //Ejercicios del video 21 del curso de Platzi
    //Las listas pertenecen a la familia de las 'collections'.
    //Estas listas se dividen en listas mutables y listas inmutables.
    //Las listas inmutables son aquellas que no pueden tener elementos modificados. No se pueden modificar ni eliminar.
    val listaDeNombres = listOf("Juan", "Enrique", "Camila")

    println(listaDeNombres)
    //Ahora veremos la lista mutables
    val listaVacia = mutableListOf<String>()

    println(listaVacia)
    listaVacia.add("Juan")
    println(listaVacia)

    //Para obtener el valor de la lista, se puede realizar de varias formas, una de las formas en usando la función get
    val valorUsandoGet = listaVacia.get(0)

    println(valorUsandoGet)

    //La segunda forma es usando un operador indexado
    val valorUsandoOperador = listaVacia[0]

    println(valorUsandoOperador)

    //Otra forma de obtener el primer valor de una lista es con la función first.
    //Hay que tener en cuenta que si no encuentra el primer elemento de una lista da una excepción, de preferencia
    //utilizar el firstOrNull para que si está vacía regresará un String nullable.
    val primerValor: String? = listaVacia.firstOrNull()

    println(primerValor)

    //Kotlin también puede eliminar elementos de una lista mutable.
    listaVacia.removeAt(0)
    println(listaVacia)
    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length > 3 }
    println(listaVacia)

    //Los array son una estructura de datos que contiene una lista de elementos agrupados.
    val myArray = arrayOf(1, 2, 3, 4)

    println("Mi array con errores $myArray.")
    println("Array como lista ${myArray.toList()}.")
}