fun maps() {
    //Ejercicios del video 23 del curso de Platzi.
    //Los maps son elementos de clave valor que nos permiten ordenar los elementos de forma que tenemos una
    // clave que tienen asignado un valor
    //con maoOf creamos un mapa inmutable.
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )

    println(edadDeSuperHeroes)

    //El mapa mutable es mutableMapOf.
    val edadDeSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )

    println(edadDeSuperHeroesMutable)

    //Podemos agregar elementos a los mapas de dos formas.
    //La primera es put.
    edadDeSuperHeroesMutable.put("Wolverine", 45)
    println(edadDeSuperHeroesMutable)

    //La segunda es por asignación.
    edadDeSuperHeroesMutable["Strom"] = 30
    println(edadDeSuperHeroesMutable)

    //Para obtener un valor del mapa hay que pasarle la clave
    val edadIronman = edadDeSuperHeroesMutable["Ironman"]

    println(edadIronman)

    //La siguiente función vamos a eliminar un elemento del mapa
    edadDeSuperHeroesMutable.remove("Wolverine")
    println(edadDeSuperHeroesMutable)

    //Podemos revisar solo las claves o los elementos de un mapa
    println(edadDeSuperHeroesMutable.keys)
    println(edadDeSuperHeroesMutable.values)
}