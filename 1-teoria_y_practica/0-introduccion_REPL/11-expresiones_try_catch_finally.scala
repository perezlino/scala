/*  ======================================================
    =========== EXPRESIONES TRY CATCH FINALLY ============
    ======================================================

     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> val a = 10                                                              | 
    |    a: Int = 10                                                                   |     
    |                                                                                  | 
    |    scala> val b = 12                                                             | 
    |    b: Int = 12                                                                   | 
    |                                                                                  | 
    |    scala> val division = try {                                                   |     
    |        | a / (b - 11)                                                            | 
    |        | } catch {                                                               |     
    |        | case ae: ArithmeticException => 0                                       | 
    |        | } finally {                                                             | 
    |        | println("Esto siempre se ejecuta, pero no afecta al resultado")         | 
    |        | }                                                                       | 
    |    Esto siempre se ejecuta, pero no afecta al resultado                          | 
    |    division: Int = 10                                                            | 
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|

*/    