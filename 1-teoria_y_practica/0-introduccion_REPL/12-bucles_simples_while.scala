/*  ======================================================
    =============== BUCLES SIMPLES - WHILE ===============
    ======================================================

    - Scala sólo tiene un constructor de bucle verdadero: 'while' (y el asociado do..while)

    - 'while' es una sentencia, y no tiene un tipo de retorno útil propio

    - 'while' no es funcional y a menudo se sustituye por funciones foreach o map sobre colecciones, o por 
      bloques for y for..yield (los cubriremos pronto)

    - 'while' todavía se utiliza por varias razones, incluyendo el rendimiento

     __________________________________________________________________________________
    |                                                                                  | 
    |    scala> var x = 0                                                              | 
    |    x: Int = 0                                                                    | 
    |                                                                                  | 
    |    scala> while (x < 10) {                                                       | 
    |        | println(s"El cuadrado de $x es ${x * x}")                               | 
    |        | x += 1                                                                  |     
    |        | }                                                                       | 
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

    - while debe tener un efecto secundario (side-effect) para hacer algo útil

    - En Scala, todo tiene un tipo de retorno, no hay void.

    - Unit se proporciona como tipo de retorno para las sentencias, tiene una instancia: ()

*/    