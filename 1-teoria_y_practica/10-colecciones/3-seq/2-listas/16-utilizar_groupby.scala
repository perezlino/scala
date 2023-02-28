/*  ======================================================
    ================== UTILIZAR GROUPBY ==================
    ======================================================
*/

//  Agrupar por las primeras letras de una palabra:

    val words = List("uno","dos","tres","cuatro","cuatro")

    // words.groupBy(_.head)
    words.groupBy(word => word.head)
    // val res0: scala.collection.immutable.Map[Char,List[String]] = HashMap(t -> List(tres), u -> List(uno), 
    //                                                                       c -> List(cuatro, cuatro), d -> List(dos))