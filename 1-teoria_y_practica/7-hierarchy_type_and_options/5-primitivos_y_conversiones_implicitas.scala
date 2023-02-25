/*  ======================================================
    ======== PRIMITIVOS Y CONVERSIONES IMPLICITAS ========
    ======================================================
*/

//  La mayoría de los lenguajes tienen una forma de conversión implícita, a menudo denominada coerción 
//  de tipos (type coercion).

//  Por ejemplo, en Java puedes llamar a un método que espera un long con un int.

//  La ampliación de tipos primitivos en Scala se consigue con implicits.

//  Y puedes usarlos (con cuidado) para tus propios propósitos también.

//  A diferencia de Java, Scala no hace distinción en el código escrito entre primitivos y boxed types.

//  También mientras los métodos pueden ser invocados como 1.+(2) detrás de escena Scala implementa estos 
//  eficientemente en tipos primitivos

//  Además de ampliaciones implícitas, y adaptadores implícitos para tipos Java, también hay wrappers "Ricos" 
//  para tipos primitivos y otras clases comunes (como Strings)


    def addDoubles(a: Double, b: Double): Double = a + b

    val a: Int = 7
    val b: Int = 2

    addDoubles(a, b)  //no es necesario convertir: los tipos se amplían automáticamente
    // val res0: Double = 9.0

    def addInts(a: Int, b: Int): Int = a + b

    // addInts(1.0, 2.0)  // pero sólo de una manera, tenemos que estrechar explícitamente los tipos
    addInts(1.0.toInt, 2.0.toInt)
    // val res1: Int = 3