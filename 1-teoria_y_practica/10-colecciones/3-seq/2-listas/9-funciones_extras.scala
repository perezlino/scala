/*  ======================================================
    ================= CONSTANTES EXTRAS ==================
    ======================================================
*/

    val nums = (1 to 10).toList  // val nums: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // head: 1er elemento de la lista
    nums.head       // val res0: Int = 1

    // tail: Excepto el primer elemento de la lista, todos los demás elementos
    nums.tail       // val res1: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10)

    // size: Cantidad de elementos en la Lista
    nums.size       // val res2: Int = 10

    // isEmpty: Si la lista es una lista vacía
    nums.isEmpty    // val res3: Boolean = false

    // nonEmpty: Si la lista no es una lista vacía
    nums.nonEmpty   // val res4: Boolean = true

    0 :: nums       // val res5: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    nums.::(0)      // val res6: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // last: Devuelve el ultimo elemento
    nums.last       // val res7: Int = 10

    // init: Excepto el ultimo elemento de la lista, todos los demás elementos
    nums.init       // val res8: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // length: Cantidad de elementos en la Lista
    nums.length     // val res9: Int = 10

    // reverse: Devuelve la lista con los elementos en un orden inverso
    nums.reverse    // val res10: List[Int] = List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

    // drop: Elimina primeros elementos segun la cantidad especificada
    nums.drop(2)
    // val res11: List[Int] = List(3, 4, 5, 6, 7, 8, 9, 10)

    // take: Devuelve primeros elementos segun la cantidad especificada
    nums.take(2)
    // val res12: List[Int] = List(1, 2)

    // updated: Modifica el valor del elemento segun el indice indicado en el 1er argumento
    nums.updated(0,1000)
    // val res13: List[Int] = List(1000, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // headOption: Devuelve el primer elemento como tipo [Option]
    nums.headOption 
    // val res14: Option[Int] = Some(1)   


    // Definir una lista vacía
    val numeros = Nil // val numeros: collection.immutable.Nil.type = List()

    // mkString: Convierte la lista en String
    val nuevosNumeros = nums.mkString(", ")
    // val nuevosNumeros: String = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10