/*  ======================================================
    ======================== MAPS ========================
    ======================================================
*/

//  - Un Map puede considerarse como una secuencia asociativa de tuplas, el primer elemento de la tupla puede 
//    utilizarse para buscar el segundo elemento.

//  - Al igual que los Sets, los Maps tienen implementaciones mutables e inmutables

    import scala.collection._

    val m1 = mutable.Map('a' -> 1, 'b' -> 2, 'c' -> 3)      // val m1: scala.collection.mutable.Map[Char,Int] = HashMap(a -> 1, b -> 2, c -> 3)
    var m2 = immutable.Map('d' -> 4, 'e' -> 5, 'f' -> 6)    // var m2: scala.collection.immutable.Map[Char,Int] = Map(d -> 4, e -> 5, f -> 6)

//  - Actualizando (Updating ) los maps

    m1 ++= m2 // llama ++= al map mutable               // val res8: m1.type = HashMap(a -> 1, b -> 2, c -> 3, d -> 4, e -> 5, f -> 6)
    
    m2 += 'g' -> 7 // reescribe a m2 = m2 + 'g' -> 7
    m2                                                  // val res10: scala.collection.immutable.Map[Char,Int] = Map(d -> 4, e -> 5, f -> 6, g -> 7)

//  - ¿Qué es esta sintaxis 'g' -> 7? 

//  - No es sintaxis, es un 'método de extensión'