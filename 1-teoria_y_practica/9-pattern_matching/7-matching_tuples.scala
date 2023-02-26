/*  ======================================================
    ================== MATCHING TUPLES ===================
    ======================================================
*/

//  'true' es una palabra clave, por lo que no hay confusión sobre load o constant match allí, es una 
//  constante

    def matchTuple3(tup: (Int, Boolean, String)): String = tup match {
        case (1, flag, string) => s"a 1 followed by $flag and $string"
        case (i, true, "Fred") => s"a true Fred with int $i"
        case (a, b, c)         => s"Some other tuple int $a, flag $b, string $c"
    }


    matchTuple3((1, false, "Sally"))  // val res5: String = a 1 followed by false and Sally
    matchTuple3((1, true, "Harry"))   // val res6: String = a 1 followed by true and Harry
    matchTuple3((2, true, "Fred"))    // val res7: String = a true Fred with int 2
    matchTuple3((1, true, "Fred"))    // val res8: String = a 1 followed by true and Fred
    matchTuple3((2, false, "Fred"))   // val res9: String = Some other tuple int 2, flag false, string Fred