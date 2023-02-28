/*  ======================================================
    ============= INTRODUCCION A LOS STRINGS =============
    ======================================================
*/

//  "cadena" es una instancia de un Objeto de tipo 'String', es decir, es un Objeto de tipo 'String'. 
//  Por lo tanto, tiene sus propios métodos/propiedades.

    var cadena = "cadena"
    // var cadena: String = cadena

    // cadena.length
    cadena.length()
    // val res0: Int = 6

    cadena.head
    // val res1: Char = c

    cadena.last
    // val res2: Char = a

    cadena.charAt(2)
    // val res3: Char = d

    cadena.toUpperCase
    // val res4: String = CADENA

    cadena.foreach(println)
/*
    c
    a
    d
    e
    n
    a
*/
    cadena.toUpperCase.foreach(println)
/*
    C
    A
    D
    E
    N
    A
*/

    var str1 = "Hola"
    var str2 = "Mundo"

    str1.concat(str2).concat("!")
    // val res7: String = HolaMundo!

    var str3 = "Hola"
    var str4 = "Hola"

    str3 == str4
    // val res8: Boolean = true

    str3.equals(str4)
    // val res9: Boolean = true

//  ---------------------------------------------------------------------------------------------------------

//  String interpolation
//  --------------------

    var nombre = "Alfonso"
    var edad = 36

    println("Te llamas " + nombre + " y tienes " + edad + " años")
    // Te llamas Alfonso y tienes 36 años

    println(s"Te llamas $nombre y tienes $edad años")
    // Te llamas Alfonso y tienes 36 años

    println(s"Te llamas: $nombre y dentro de 2 años tendras ${edad+2} años")
    // Te llamas Alfonso y tienes 38 años