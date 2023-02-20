/*  ======================================================
    ================== EXPRESIONES IF ====================
    ======================================================

    - En Scala, las expresiones if..else pueden devolver valores (a diferencia de muchos lenguajes 
      más imperativos):
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> val a = 10                                                              |     
    |   a: Int = 10                                                                    |     
    |                                                                                  |     
    |   scala> val b = 12                                                              | 
    |   b: Int = 12                                                                    |     
    |                                                                                  | 
    |   scala> val m = if (a > b) a else b                                             | 
    |   m: Int = 12                                                                    |         
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|

    
    - Puedes ignorar el valor devuelto, entonces se ve igual que en otros lenguajes:
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> var m = 0                                                               | 
    |   m: Int = 0                                                                     |     
    |                                                                                  | 
    |   scala> if (a > b) {                                                            | 
    |       | m = a                                                                    | 
    |       | } else {                                                                 | 
    |       | m = b                                                                    | 
    |       | }                                                                        | 
    |                                                                                  |         
    |   scala> m                                                                       | 
    |   res1: Int = 12                                                                 |     
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|


    - Ejemplos
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> val x = 2                                                               | 
    |   x: Int = 2                                                                     | 
    |                                                                                  |     
    |   scala> if (x > 5) {                                                            | 
    |       | println("x es mayor a 5")                                                | 
    |       | } else {                                                                 | 
    |       | println("x es menor a 5")                                                | 
    |       | }                                                                        |     
    |   x es menor a 5                                                                 |          
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> val x = 10                                                              | 
    |   x: Int = 10                                                                    | 
    |                                                                                  |  
    |   scala> if (x > 5) println("Es mayor")                                          | 
    |   Es mayor                                                                       | 
    |                                                                                  | 
    |   scala> if (x > 10) println("Es mayor")                                         |     
    |                                                                                  | 
    |   scala> if (x > 5)                                                              | 
    |       | {                                                                        | 
    |       | println("Es mayor")                                                      |     
    |       | println("Estoy en el bloque del if")                                     | 
    |       | }                                                                        | 
    |   Es mayor                                                                       |     
    |   Estoy en el bloque del if                                                      | 
    |                                                                                  | 
    |   scala> var edad = 30                                                           | 
    |   edad: Int = 30                                                                 | 
    |                                                                                  |     
    |   scala> if (edad > 30)                                                          | 
    |       | {                                                                        | 
    |       | println("Eres muy mayor")                                                | 
    |       | } else {                                                                 | 
    |       | println("Eres todavia Joven")                                            |     
    |       | println("Aprovecha la vida")                                             |     
    |       | }                                                                        | 
    |   Eres todavia Joven                                                             | 
    |   Aprovecha la vida                                                              | 
    |                                                                                  | 
    |   scala> var resultado = if (edad > 30) "eres mayor" else "eres menor"           |     
    |   resultado: String = eres menor                                                 |     
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|   

*/ 

