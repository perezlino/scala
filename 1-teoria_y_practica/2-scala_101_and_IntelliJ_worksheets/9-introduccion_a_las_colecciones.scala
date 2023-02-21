/*  ======================================================
    =========== INTRODUCCION A LAS COLECCIONES ===========
    ======================================================
*/

//  - Hasta ahora hemos visto Array, que es mutable, y ahora List, que es inmutable.

//  - Ambos tipos de colección tienen un tipo de parámetro que especifica lo que contienen:

    val array1: Array[Int] = Array(1,2,3)   // val array1: Array[Int] = Array(1, 2, 3)
    val list1: List[String] = List("scooby", "dooby", "doo")    // val list1: List[String] = List(scooby, dooby, doo)

//  - El tipo de parámetro no es opcional, pero puede deducirse del contenido de la inicialización.

    val array2 = Array(1,2,3)   // val array2: Array[Int] = Array(1, 2, 3)
    val list2 = List("scooby", "dooby", "doo")  // val list2: List[String] = List(scooby, dooby, doo)

//  - Cuando se especifica un tipo de colección en el parámetro de un método (o en un parámetro de retorno), 
//    se debe indicar el tipo de parámetro.

    def squareRootsOf(xs: List[Int]): List[Double] = {  // def squareRootsOf(xs: List[Int]): List[Double]
    for (x <- xs) yield math.sqrt(x)
    }

    squareRootsOf(List(1,2,3,4,5,6))
/*
val res0: List[Double] = List(1.0, 1.4142135623730951, 1.7320508075688772, 2.0, 2.23606797749979, 2.449489742783178)
*/