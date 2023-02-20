/*  ======================================================
    ============= BUCLES SIMPLES - DO WHILE ==============
    ======================================================

    - While comprueba primero el predicado antes de ejecutar el cuerpo del bucle

    - Posiblemente nunca se ejecute el cuerpo

    - Do while ejecuta el cuerpo al menos una vez, y comprueba el predicado para ver si debe repetirse:
     __________________________________________________________________________________
    |                                                                                  | 
    |    scala> var x = 0                                                              | 
    |    x: Int = 0                                                                    | 
    |                                                                                  | 
    |    scala> do {                                                                   | 
    |        | println(s"El cuadrado de $x es ${x * x}")                               | 
    |        | x += 1                                                                  |     
    |        | } while (x < 10)                                                        |         
    |    El cuadrado de 0 es 0                                                         |     
    |    El cuadrado de 1 es 1                                                         | 
    |    El cuadrado de 2 es 4                                                         | 
    |    El cuadrado de 3 es 9                                                         | 
    |    El cuadrado de 4 es 16                                                        |   
    |    El cuadrado de 5 es 25                                                        | 
    |    El cuadrado de 6 es 36                                                        | 
    |    El cuadrado de 7 es 49                                                        | 
    |    El cuadrado de 8 es 64                                                        |   
    |    El cuadrado de 9 es 81                                                        | 
    |    res0: Unit = ()                                                               |    
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|

    - Nótese el uso de interpolación de cadenas: s "el cuadrado de $x es ${x * x}"

*/    