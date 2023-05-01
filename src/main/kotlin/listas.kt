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

    //Ejercicios de; video 22 del curso de Platzi, ordenar arreglos.
    val numerosDeLoteria = listOf<Int>(11, 22, 43, 56, 78, 66)

    println(numerosDeLoteria)

    //Vamos a ordenar los n[umeros de menor a mayor con sort.
    val numerosSorted = numerosDeLoteria.sorted()

    println(numerosSorted)

    //También se puede ordenar los n[umeros de mayor a menos o descendiente.
    val numerosDescendientes = numerosDeLoteria.sortedDescending()

    println(numerosDescendientes)

    //La siguiente función permite ordenar dependiendo de una condición.
    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }

    println(ordenarPorMultiplos)

    //La siguiente función ordena de manera aleatoriamente, shuffled.
    val numerosAleatorios = numerosDeLoteria.shuffled()

    println(numerosAleatorios)

    //La siguiente función ordena la lista de manera inversa.
    val numerosEnReversa = numerosDeLoteria.reversed()

    println(numerosEnReversa)

    //Las siguientes dos funciones son muy útiles en programación funcional.
    //Map nos permite convertir un elemento de un tipo a otro tipo.
    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tú número de lotería es $numero." }
    println(mensajesDeNumeros)

    //La función filter, nos permite filtrar elementos dependiendo de la condición indicada.
    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }

    println(numerosFiltrados)
}