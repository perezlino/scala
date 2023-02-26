/*  ======================================================
    ========== DEFINIR Y ACCEDER A UN ELEMENTO ===========
    ======================================================
*/ 

//  -	No es una colección 
//  -	Ayuda a proporcionar métodos para iterar sobre los elementos dentro de la colección 
//  -	'next' -> Devuelve el siguiente elemento. 
//  -	'hasNext' -> Comprueba si el siguiente elemento está presente

    var iterator1 = Iterator("Hola Mundo","Hola Chile", "Hola Antofagasta", "Hola Santiago")

    iterator1 // val res0: Iterator[String] = <iterator>

    iterator1.next()  // val res1: String = Hola Mundo
    iterator1.next()  // val res2: String = Hola Chile
    iterator1.next()  // val res3: String = Hola Antofagasta
    iterator1.next()  // val res4: String = Hola Santiago

    // Nota: Si no hay elementos en el Iterator, next() dará error. En su lugar, compruebe primero con hasNext().
    iterator1.next()  // java.util.NoSuchElementException: next on empty iterator

//  --------------------------------------------------------------------------------------------------------------

//  Usa hasNext antes de hacer next()

    var iterator1 = Iterator("Hola Mundo","Hola Chile", "Hola Antofagasta", "Hola Santiago")

    iterator1.hasNext // val res0: Boolean = true
    iterator1.next()  // val res1: String = Hola Mundo
    iterator1.hasNext // val res2: Boolean = true
    iterator1.next()  // val res3: String = Hola Chile
    iterator1.hasNext // val res4: Boolean = true
    iterator1.next()  // val res5: String = Hola Antofagasta
    iterator1.hasNext // val res6: Boolean = true
    iterator1.next()  // val res7: String = Hola Santiago
    iterator1.hasNext // val res8: Boolean = false    

//  --------------------------------------------------------------------------------------------------------------

// Bucle a través del 'iterator'

    var iterator1 = Iterator("Hola Mundo","Hola Chile", "Hola Antofagasta", "Hola Santiago")

    while(iterator1.hasNext){
        println(iterator1.next())
    }
    /*
    Hola Mundo
    Hola Chile
    Hola Antofagasta
    Hola Santiago
    */

//  --------------------------------------------------------------------------------------------------------------

//  Uso de la función 'max' y 'min'

    var iterator1 = Iterator("Hola Mundo","Hola Chile", "Hola Antofagasta", "Hola Santiago")

    iterator1.max
    // val res0: String = Hola Santiago

    // iterator1.min
    // java.lang.UnsupportedOperationException: empty.min

    // Nota: Si se aplica inmediamente despues 'min' dara error porque ya has usado la función max en él.
    // Se debe volver a definir 'iterator1'

    var iterator1 = Iterator("Hola Mundo","Hola Chile", "Hola Antofagasta", "Hola Santiago")

    iterator1.min
    // val res1: String = Hola Antofagasta

//  --------------------------------------------------------------------------------------------------------------

//  Para obtener el número de elementos de un 'iterator'

    var iterator1 = Iterator("Hola Mundo","Hola Chile", "Hola Antofagasta", "Hola Santiago")

    iterator1.length
    // val res0: Int = 4