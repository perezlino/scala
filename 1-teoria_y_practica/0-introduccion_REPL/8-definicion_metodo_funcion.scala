/*  ======================================================
    ============= DEFINICION METODO/FUNCION ==============
    ======================================================

    - Además de val y var, Scala tiene 'def'

    - Los 'defs' pueden tomar parámetros y actuar sobre ellos
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> def sumar(x: Int, y: Int) = x + y                                       | 
    |   sumar: (x: Int, y: Int)Int                                                     | 
    |                                                                                  |     
    |   scala> def sumar(x: Int, y: Int): Int = x + y                                  | 
    |   sumar: (x: Int, y: Int)Int                                                     | 
    |                                                                                  | 
    |   scala> sumar(2, 3)                                                             | 
    |   res0: Int = 5                                                                  | 
    |                                                                                  |         
    |   scala>                                                                         | 
    |__________________________________________________________________________________|


    - Observar el = antes del cuerpo de la función

    - El tipo de retorno puede deducirse, pero los tipos de los parámetros no:    
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> def sumar(x, y) = x + y                                                 | 
    |   <console>:1: error: ':' expected but ',' found.                                |     
    |       def sumar(x, y) = x + y                                                    |     
    |                   ^                                                              | 
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|

    - Scala no tiene nada que deduzca los tipos de los parámetros

*/    