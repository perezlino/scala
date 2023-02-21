/*  ======================================================
    ============= RE-WRITING RULES - UPDATE ==============
    ======================================================
*/

//  - Vamos a crear un array:

    val arr = Array("scooby", "dooby", "doo")   // val arr: Array[String] = Array(scooby, dooby, doo)

//  - Que pasa si actualizamos el valor en un Array (los arrays son mutables por lo que pueden ser 
//    actualizados):

    arr(1) = "dappy"

    arr(1)  // val res10: String = dappy

//  - Esto se reescribe a una llamada a update con el valor entre paréntesis como primer argumento, y el 
//    valor después de la igualdad como el segundo, así:

    arr(1) = "dappy"
    // se reescribe como
    arr.update(1, "dappy")

//  - El resultado de update se define como Unit, por lo que para hacer algo útil, debe tener un efecto 
//    secundario (side effect)