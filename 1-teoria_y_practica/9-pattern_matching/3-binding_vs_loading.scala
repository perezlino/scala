/*  ======================================================
    ================= BINDING VS LOADING =================
    ======================================================
*/

//  Un identificador de variable en un pattern match se carga con el valor

//  Pero hay una alternativa, útil para coincidencias múltiples:

    def opposite2(s: String): String = s match {
        case "hot"         => "cold"
        case "full"        => "empty"
        case "cool"        => "square"
        case "happy"       => "sad"
        case inWord @ ("sane" | "edible" | "secure") => s"in$inWord"
        case anythingElse => s"not $anythingElse"
    }

    opposite2("happy")    // val res3: String = sad
    opposite2("sane")     // val res4: String = insane
    opposite2("edible")   // val res5: String = inedible
    opposite("fish")      // val res6: String = not fish

//  ("sane" | "edible" | "secure") coincide con cualquiera de esas palabras, y la @ vincula (binds) el 
//  resultado a inWord

//  De forma más general, @ vincula (binds) el pattern match a su derecha con la variable a su izquierda
