/*  ======================================================
    ================ VARIABLES: MODO LAZY ================
    ======================================================

     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> val x = 1/0                                                             | 
    |   java.lang.ArithmeticException: / by zero                                       |     
    |   ... 26 elided                                                                  |     
    |                                                                                  | 
    |   // Al utilizar el modo 'lazy' se crea la variable pero su contenido solo se    | 
    |      activa al momento de llamarla. Esto para ahorrar espacio en la memoria      |  
    |                                                                                  | 
    |   scala> lazy val x1 = 1/0                                                       | 
    |   x1: Int = <lazy>                                                               | 
    |                                                                                  | 
    |   // Al llamar a la variable por medio de un 'print' se activa su valor          | 
    |                                                                                  |     
    |   scala> print(x1)                                                               | 
    |   java.lang.ArithmeticException: / by zero                                       | 
    |   at .x1$lzycompute(<console>:11)                                                |  
    |   at .x1(<console>:11)                                                           | 
    |   ... 26 elided                                                                  | 
    |                                                                                  | 
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________| 

*/  