/*  ======================================================
    ==================== CONVERSIONES ====================
    ======================================================
*/

    val set = Set(1,2,3,4,5)
    // val set: scala.collection.immutable.Set[Int] = HashSet(5, 1, 2, 3, 4)

    set.toVector
    // val res0: scala.collection.immutable.Vector[Int] = Vector(5, 1, 2, 3, 4)

    set.toArray
    // val res1: Array[Int] = Array(5, 1, 2, 3, 4)

    set.toSet
    // val res2: scala.collection.immutable.Set[Int] = HashSet(5, 1, 2, 3, 4)

    set.zipWithIndex.toMap
    // val res3: scala.collection.immutable.Map[Int,Int] = HashMap(5 -> 0, 1 -> 1, 2 -> 2, 3 -> 3, 4 -> 4)

    set.toList
    // val res4: List[Int] = List(5, 1, 2, 3, 4)