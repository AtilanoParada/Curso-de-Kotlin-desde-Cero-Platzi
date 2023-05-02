fun sets() {
    //Ejercicios del video 24 del curso de Platzi.
    //Seguimos con las colecciones, está vez son los sets, a diferencia de las listas no pueden
    //tener elementos repetidos, son eliminados los elementos repetidos.
    val vocales = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o")

    println(vocales)

    //Los sets inmutables.
    val numerosFavoritos = mutableSetOf(1, 2, 3, 4)

    println(numerosFavoritos)
    //Agregamos otro número a nuestro set
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println(numerosFavoritos)
    //Eliminamos un elemento
    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet : Int? = numerosFavoritos.firstOrNull { numero -> numero > 2 }

    println(valorDelSet)
}