/*  ======================================================
    ============== RE-WRITING RULES - APPLY ==============
    ======================================================
*/

//  - Vamos a crear un array:

    val arr = Array("scooby", "dooby", "doo")   // val arr: Array[String] = Array(scooby, dooby, doo)

//  - Extraer elementos de un array puede lograrse con el método apply:

    arr.apply(1)    // val res0: String = dooby

    println(arr.apply(1))   // dooby

//  - Scala tiene un atajo para apply, cualquier elemento (que no sea un método) seguido de paréntesis 
//    llama a apply con el contenido de los paréntesis (si lo hay):

    arr(0)  // val res2: String = scooby

    println(arr(0)) // scooby

//  - De hecho, la línea de creación de arrays anterior también utiliza esta regla:

    Array("scooby", "dooby", "doo")
    // se reescribe como
    Array.apply("scooby", "dooby", "doo")

//  - que llama al método apply en el companion object usando varargs (aprenderemos sobre ambos pronto)