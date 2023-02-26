/*  ======================================================
    =================== VARIABLE LOADS ===================
    ======================================================
*/

//  Además de simplemente hacer coincidir constantes, Scala puede cargar un valor para su uso en el bloque de 
//  código:

    def opposite(s: String): String = s match {
        case "hot"         => "cold"
        case "full"        => "empty"
        case "cool"        => "square"
        case "happy"       => "sad"
        case anythingElse  => s"not $anythingElse"
    }

    opposite("cool")    // val res0: String = square
    opposite("happy")   // val res1: String = sad
    opposite("sane")    // val res2: String = not sane

//  Mientras que las constantes se comprobarán primero, cualquier cosa que no coincida con esas constantes se 
//  pondrá en el valor anythingElse y se devolverá el valor s "not $anythingElse" (esto también hace que el 
//  pattern match se complete para todas las entradas).