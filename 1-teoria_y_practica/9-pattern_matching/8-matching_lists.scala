/*  ======================================================
    =================== MATCHING LISTS ===================
    ======================================================
*/

//  En el caso concreto de las listas, puede utilizar la notación :: (cons) para las coincidencias (matches):

    def matchList(xs: List[Int]): String = xs match {
        case 1 :: 2 :: rest => s"A 1, 2 list followed by $rest"
        case a :: b :: _ => s"A list of at least 2 items, starting with $a, $b"
        case a :: Nil => s"A single element list of $a"
        case Nil => "The empty list"
    }

    matchList(List(1,2,3))  // val res10: String = A 1, 2 list followed by List(3)
    matchList(List(1,2))    // val res11: String = A 1, 2 list followed by List()
    matchList(List(1,3,4))  // val res12: String = A list of at least 2 items, starting with 1, 3
    matchList(List(4))      // val res13: String = A single element list of 4
    matchList(Nil)          // val res14: String = The empty list


//  Muy común ver case head :: tail => en funciones recursivas
