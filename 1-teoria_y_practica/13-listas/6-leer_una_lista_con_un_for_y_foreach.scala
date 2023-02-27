/*  ======================================================
    ======== LEER UNA LISTA CON UN FOR Y FOREACH =========
    ======================================================
*/

//  Acceder a los elementos de una Lista usando un bucle 'for'

    var colores = List("Morado", "Naranjo", "Rojo", "Azul", "Verde", "Amarillo")

    for(color <- colores) {println(color)}
/*
    Morado
    Naranjo
    Rojo
    Azul
    Verde
    Amarillo
*/

//  Acceder a los elementos de una lista usando un 'foreach'

    var colores = List("Morado", "Naranjo", "Rojo", "Azul", "Verde", "Amarillo")

    colores.foreach(x => println(x))
/*
    Morado
    Naranjo
    Rojo
    Azul
    Verde
    Amarillo
*/    

    colores.foreach(println(_))
/*
    Morado
    Naranjo
    Rojo
    Azul
    Verde
    Amarillo
*/    

    colores.foreach(println)
/*
    Morado
    Naranjo
    Rojo
    Azul
    Verde
    Amarillo
*/

    val numeros = List(2,4,6,8,10)

    numeros.foreach(x => println(x * 2))
/*    
    4
    8
    12
    16
    20
*/