fun ciclos() {
    //Ejercicios del video 16 del curso de Platzi
    val listaDeFrutas: List<String> = listOf("Manzana", "Pera", "Frambuesa", "Durazno")

    //Ejemplo de sintaxis comprimida para el for cuando solo hay una línea
    for (fruta in listaDeFrutas) println("Hoy voy a comerme una fruta llamada $fruta.")

    //Ejemplo de for each
    listaDeFrutas.forEach { fruta -> "Hoy voy a comerme una fruta nueva que se llamada $fruta." }

    //Ejemplos de map, es mutable
    val caracteresDeFruta : List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    //Ejemplos de filter
    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)}