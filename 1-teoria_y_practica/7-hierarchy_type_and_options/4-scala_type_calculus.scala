/*  ======================================================
    ================ SCALA TYPE CALCULUS =================
    ======================================================
*/

//  Si el tipo A es un subtipo de AnyRef, A + Null es A (porque Null es un subtipo de todos los AnyRefs, 
//  por lo que A se convierte en el LUB (Least Upper Bounds)

//  Para cualquier tipo A en Scala, A + Nothing es A (porque Nothing es un subtipo de todo, así que el mismo 
//  razonamiento anterior se aplica para el LUB).

//  Si B y C son ambas subclases de A, entonces B + C es A, siendo ese el LUB (el primer lugar que cubre la 
//  jerarquía de tipos para B y C a medida que subes por las superclases).

//  Ejemplos prácticos (utilizando una expresión if con dos tipos de retorno):

//  En este tipo de calculo de tipos no similares, Scala define segun jerarquia. 

    val flag = true  // could be false...

    if (flag) 1.0 else ()  // Double + Unit = AnyVal

    // if (flag) 1.0 else () <--- Es lo mismo
    if (flag) 1.0  // Unit implicito, Double + Unit = AnyVal

    // if (flag) "hi" else () <--- Es lo mismo
    if (flag) "hi" // Unit implicito, String + Unit = Any

    if (flag) "Hello" else null // String + Null = String

    if (flag) 2.0 else null // Double + Null = Any

    def fail(msg: String): Nothing =
    throw new IllegalStateException(msg)

    if (flag) 2.0 else fail("not 2.0") // Double + Nothing = Double

    if (flag) "yo" else fail("no yo") // String + Nothing = String