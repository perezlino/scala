/*  ======================================================
    ==================== VALS Y VARS =====================
    ======================================================

    - Un val es una definición de variable final, no puede ser reasignada con un valor diferente

    - Una var es una definición de variable mutable, puede ser reasignada con otro valor del mismo tipo
                                         ____________________
                                        |                    |
                                        |   val: INMUTABLE   |
                                        |   var: MUTABLE     |   
                                        |____________________|   

    - Prefiere 'vals' en lugar de 'vars'

    - Todos los 'vals' y 'vars' tienen tipos

    - El compilador infiere automáticamente los tipos cuando se omiten

    - No podemos modificar el valor de la variable al utilizar 'val' 
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> val x = 10                                                              |
    |   x: Int = 10                                                                    | 
    |                                                                                  |     
    |   scala> x = 11                                                                  | 
    |   <console>:12: error: reassignment to val                                       | 
    |        x = 11                                                                    | 
    |            ^                                                                     |      
    |                                                                                  | 
    |   scala> val nombre = "Alfonso"                                                  | 
    |   nombre: String = Alfonso                                                       | 
    |                                                                                  | 
    |   scala> nombre = "Javiera"                                                      | 
    |   <console>:12: error: reassignment to val                                       |     
    |        nombre = "Javiera"                                                        | 
    |                ^                                                                 | 
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________| 


    - Podemos modificar el valor de la variable al utilizar 'var'   
     __________________________________________________________________________________
    |                                                                                  | 
    |   scala> var y = 10                                                              | 
    |   y: Int = 10                                                                    | 
    |                                                                                  | 
    |   scala> y = 11                                                                  |         
    |   y: Int = 11                                                                    | 
    |                                                                                  |     
    |   scala> y = "once"                                                              | 
    |   <console>:12: error: type mismatch;                                            | 
    |   found   : String("once")                                                       |     
    |   required: Int                                                                  | 
    |        y = "once"                                                                | 
    |            ^                                                                     | 
    |                                                                                  | 
    |   scala> var nombre = "Alfonso"                                                  |
    |   nombre: String = Alfonso                                                       | 
    |                                                                                  | 
    |   scala> nombre = "Javiera"                                                      | 
    |   nombre: String = Javiera                                                       | 
    |                                                                                  |     
    |   scala>                                                                         |     
    |__________________________________________________________________________________| 

*/