/*  ======================================================
    ================== ESTILO FUNCIONAL ==================
    ======================================================

    - Ignorar el valor de retorno significa que necesitarás efectos secundarios (side effects) para 
      hacer algo útil. útil, por ejemplo, en este ejemplo mutamos una variable como efecto secundario (side effect).

    - El código puramente funcional evita los efectos secundarios (y no necesita vars)

    - Por lo tanto Scala pone un mayor énfasis en las expresiones (que devuelven valores) en lugar de declaraciones 
      (que no lo hacen)

    - En una expresión Scala que consta de más de una expresión anidada, la expresión interna final se convierte en 
      el valor de la expresión global, por ejemplo:
     __________________________________________________________________________________
    |                                                                                  | 
    |    scala> a                                                                      | 
    |    res8: Int = 10                                                                | 
    |                                                                                  | 
    |    scala> b                                                                      |     
    |    res9: Int = 12                                                                | 
    |                                                                                  | 
    |    scala> val maxSquaredDoubled = if (a > b) {                                   |     
    |        | val aSquared = a * a                                                    | 
    |        | aSquared * 2                                                            | 
    |        | } else {                                                                |         
    |        | val bSquared = b * b                                                    | 
    |        | bSquared * 2                                                            | 
    |        | }                                                                       |     
    |    maxSquaredDoubled: Int = 288                                                  | 
    |                                                                                  | 
    |   scala>                                                                         | 
    |__________________________________________________________________________________|

*/    