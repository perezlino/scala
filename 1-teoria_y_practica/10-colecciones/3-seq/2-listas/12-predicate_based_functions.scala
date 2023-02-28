/*  ======================================================
    ============= PREDICATE BASED FUNCTIONS ==============
    ======================================================
*/

//  Un predicado no es más que una función que devuelve un valor booleano, por lo que las funciones 
//  basadas en predicados son higher order functions.

    val words = List("uno", "dos", "tres", "cuatro")
    // val words: List[String] = List(uno, dos, tres, cuatro)

    words.filter(_.contains("a"))
    // val res0: List[String] = List(cuatro)

    words.filter(_.contains("f"))
    // val res1: List[String] = List()

    words.filter(_.length == 3)
    // val res2: List[String] = List(uno, dos)

    words.filter(_ == "uno")
    // val res3: List[String] = List(uno)

    words.find(_.contains("a"))
    // val res2: Option[String] = Some(cuatro)

    words.find(_.contains("z"))
    // val res3: Option[String] = None

    words.indexWhere(_.contains("a"))
    // val res4: Int = 3

    words.indexWhere(_.contains("z"))
    // val res7: Int = -1

    words.indexWhere(_.contains("r"))
    // val res8: Int = 2

    words.lastIndexWhere(_.contains("r"))
    // val res9: Int = 3

    words.filterNot(_.contains("a"))
    // val res10: List[String] = List(uno, dos, tres)

    words.exists(_ == "dos")
    // val res11: Boolean = true

    words.exists(_ == "cinco")
    // val res12: Boolean = false

    words.partition(_.contains("a"))
    // val res13: (List[String], List[String]) = (List(cuatro),List(uno, dos, tres))

    words.takeWhile(_.contains("f"))
    // val res14: List[String] = List()

    words.dropWhile(_.contains("f"))
    // val res15: List[String] = List(uno, dos, tres, cuatro)