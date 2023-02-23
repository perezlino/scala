/*  ======================================================
    ============ EXPRESIONES VS DECLARACIONES ============
    ======================================================
*/

//  Una expresión tiene un valor de retorno (return value), una sentencia no (al menos no uno útil)

//  En Programación Funcional, una expresión pura no tiene más efectos que los que se ven en el valor 
//  de retorno (return value).

//  Scala no tiene la palabra clave void para expresiones, void es la ausencia de un tipo de retorno 
//  (return type), pero en Scala todo tiene un tipo de retorno (return type).

//  Pero para las expresiones, ese tipo de retorno es Unit, a la inversa, un tipo de retorno de Unit 
//  denota una expresión

    // Una expresion
    val x = 1 + 2 // x: Int = 3

    // Una declaracion
    println(x) // Imprime 3

    // Como todo tiene un tipo de retorno
    val un = println(x) // 3
                        // un: Unit = ()

    un == () // () es la única instancia de Unit
    // Advertencia: comparar valores de los tipos Unit y Unit usando `=='
    // siempre dará verdadero