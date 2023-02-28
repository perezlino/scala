/*  ======================================================
    ==================== CONVERSIONES ====================
    ======================================================
*/

    val arr = Array(1,2,3,4,5)

    arr.toVector
    // val res0: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5)

    arr.toArray
    // val res1: Array[Int] = Array(1, 2, 3, 4, 5)

    arr.toSet
    // val res2: scala.collection.immutable.Set[Int] = HashSet(5, 1, 2, 3, 4)

    arr.zipWithIndex.toMap
    // val res3: scala.collection.immutable.Map[Int,Int] = HashMap(5 -> 4, 1 -> 0, 2 -> 1, 3 -> 2, 4 -> 3)

    arr.toList
    // val res4: List[Int] = List(1, 2, 3, 4, 5)