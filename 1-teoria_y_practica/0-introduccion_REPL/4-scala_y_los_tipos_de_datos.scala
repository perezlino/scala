/*  ======================================================
    ============= SCALA Y LOS TIPOS DE DATOS =============
    ======================================================

    - El compiladro es capaz de inferir el tipo de dato

    - Scala inferirá el mejor tipo que pueda si no lo especificamos.

    - El tipo va después del nombre de la variable, separado por un :
     __________________________________________________________________________________
    |                                                                                  | 
    |   // No es obligatorio indicar el tipo de dato                                   |     
    |                                                                                  | 
    |   scala> val nombre:String = "Alberto"                                           | 
    |   nombre: String = Alberto                                                       | 
    |                                                                                  |         
    |   scala>                                                                         | 
    |__________________________________________________________________________________|  


    - Recordar:
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> var x = 10                                                              | 
    |   x: Int = 10                                                                    |  
    |                                                                                  |     
    |   scala> x = "ten"                                                               |     
    |   <console>:12: error: type mismatch;                                            | 
    |   found   : String("ten")                                                        |     
    |   required: Int                                                                  | 
    |        x = "ten"                                                                 | 
    |            ^                                                                     | 
    |                                                                                  |         
    |   scala>                                                                         | 
    |__________________________________________________________________________________|

    - Scala no nos deja reasignar un var entero a un String

    - Esto es porque x tiene un tipo Int cuando lo creamos

*/