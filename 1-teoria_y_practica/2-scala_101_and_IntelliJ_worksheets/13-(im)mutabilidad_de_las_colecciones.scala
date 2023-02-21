/*  ======================================================
    ========= (IM)MUTABILIDAD DE LAS COLECCIONES =========
    ======================================================
*/

//  - Array es mutable, puede crecer, los valores pueden actualizarse, etc.

    val arr = Array("scooby", "dooby", "doo")   // val arr: Array[String] = Array(scooby, dooby, doo)

    arr(0) = "scrappy"
    arr(1) = "dappy"

    arr.mkString(" ")   // val res2: String = scrappy dappy doo

//  - List y Vector son inmutables, una vez creados la única forma de cambiar el tamaño o actualizarlos es 
//    transformarlos en otra referencia (o usar un var para reasignar la referencia)

    val xs1 = List(1,2,3)   // val xs1: List[Int] = List(1, 2, 3)
    val xs2 = 0 :: xs1      // val xs2: List[Int] = List(0, 1, 2, 3)

    var xs3 = List(4,5,6)   // var xs3: List[Int] = List(4, 5, 6)
    xs3 = xs2 ::: xs3  // porque es 'var'
    xs3                     // val res3: List[Int] = List(0, 1, 2, 3, 4, 5, 6)

//  - Set tiene implementaciones mutables e inmutables:

import scala.collection._

val s1 = mutable.Set(1,2,3)     // val s1: scala.collection.mutable.Set[Int] = HashSet(1, 2, 3)
var s2 = inmutable.Set(1,2,3)   // var s2: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

//  - Ahora si usamos += en ambos

s1 += 4 // funciona porque s1 tiene un operador +=  // val res4: s1.type = HashSet(1, 2, 3, 4)
s1                                                  // val res5: scala.collection.mutable.Set[Int] = HashSet(1, 2, 3, 4)

s2 += 4 // funciona porque s2 es un var             
s2                                                  // res7: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

// Para s2, Scala utiliza una regla de reescritura de la expresión a s2 = s2 + 4

// No es necesario (ni recomendable) usar un var y una colección mutable juntas