/*  ======================================================
    ============ OCULTAR UN VAL CON OTRO VAL =============
    ======================================================

    - Observar lo que ocurre en el siguiente caso. ¿Esto no acaba de reasignar un val?
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> val x = 10                                                              | 
    |   x: Int = 10                                                                    |  
    |                                                                                  | 
    |   scala> println(x)                                                              |     
    |   10                                                                             |     
    |                                                                                  | 
    |   scala> val x = 11                                                              | 
    |   x: Int = 11                                                                    | 
    |                                                                                  |                 
    |   scala> println(x)                                                              | 
    |   11                                                                             | 
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|     


    - De hecho el segundo val x oculta al primero, es así:
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> :paste                                                                  | 
    |   // Entering paste mode (ctrl-D to finish)                                      | 
    |                                                                                  | 
    |   val x = 10                                                                     |     
    |                                                                                  |     
    |   println(x)                                                                     | 
    |                                                                                  | 
    |   { // start a new scope                                                         | 
    |        val x = 11 // hides x in the outer scope                                  | 
    |        println(x)                                                                | 
    |   }                                                                              | 
    |                                                                                  | 
    |   println(x)                                                                     | 
    |                                                                                  | 
    |   // Exiting paste mode, now interpreting.                                       |         
    |                                                                                  |     
    |   10                                                                             | 
    |   11                                                                             | 
    |   10                                                                             |     
    |   x : Int = 10                                                                   |     
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________| 


    - Cada nuevo prompt REPL es como un nuevo scope

    - Ten en cuenta también el modo :paste, que te permite decidir cuándo la REPL evaluará tu código
    
*/     