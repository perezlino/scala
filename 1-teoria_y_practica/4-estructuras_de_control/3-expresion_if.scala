/*  ======================================================
    ==================== EXPRESION IF ====================
    ======================================================
*/

//  En muchos lenguajes, por ejemplo, Java, if es una sentencia (no tiene valor de retorno)

    // esto es Java
    String fileName = "default.txt"; // define una variable

    if (args.length > 0) {
    fileName = args[0]; // efecto secundario
    }

//  Java también tiene un operador ternario que es una expresión:

    String fileName = (args.length) > 0 ? args[0] : "default.txt";


//  Scala combina estas dos cosas en una sola (if es una expresión)

    val fileName = if (args.length > 0) args(0) else "default.txt" // ahora puede ser val
    

//  El tipo de retorno es la combinación de los tipos a ambos lados del else, por ejemplo

    val res = if (x > 0) x else false // el tipo de res será AnyVal
/*
    _______________________________________________________________
   | scala> val x = 5                                              | 
   | x: Int = 5                                                    |         
   |                                                               | 
   | scala> val res = if (x > 0) x else false                      | 
   | res: AnyVal = 5                                               | 
   |                                                               | 
   | scala>                                                        | 
   |_______________________________________________________________|
*/