/*  ======================================================
    =============== METODO DE EXTENSION -> ===============
    ======================================================
*/

//  -> puede invocarse sobre una instancia de cualquier tipo con un parámetro de cualquier otro tipo

    "hello" -> 88   // val res0: (String, Int) = (hello,88)

    "hello".->(88)  // val res1: (String, Int) = (hello,88)

//  El resultado es una tupla2[PrimerTipo, SegundoTipo] con los valores de ambas instancias.

//  Es principalmente syntactic sugar para crear maps, pero no es una palabra clave. Funciona así

    1 -> "uno"                  // val res2: (Int, String) = (1,uno)
    // se reescribe como
    1.->("uno")                 // val res3: (Int, String) = (1,uno)
    // se expande a
    ArrowAssoc(1).->("uno")     // val res4: (Int, String) = (1,uno)

//  No existe tal método -> en Int, pero un implícito llamado ArrowAssoc lo proporciona justo a tiempo

//  Los implícitos se tratarán en profundidad más adelante en el curso.