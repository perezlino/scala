/*  ======================================================
    ======================== UNIT ========================
    ======================================================
*/

//  Un tipo de retorno Unit implica que un método debe tener un efecto secundario (side effect) para hacer algo 
//  útil

//  Por ejemplo, I/O, modificar (set) o actualizar (update) una variable.

//  Sin embargo, un tipo de retorno no Unit no implica que no haya efectos secundarios.

//  Muchos built in constructs en Scala son expresiones en lugar de sentencias, pocos devuelven sólo Unit

//  Incluso si tienes efectos secundarios, puede haber algo más útil que Unit que puedas devolver, siempre puedes 
//  ignorarlo si no quieres usarlo

//  Sólo hay una instancia de Unit, es () (a veces llamada tupla vacía)

//  Unit desciende de AnyVal como los tipos "primitivos