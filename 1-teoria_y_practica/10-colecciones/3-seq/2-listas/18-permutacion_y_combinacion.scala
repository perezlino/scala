/*  ======================================================
    ============= PERMUTACION Y COMBINACION ==============
    ======================================================
*/

    val nums = List.range(0, 10)
    // List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    nums.grouped(2).take(5).toList
    // val res0: List[List[Int]] = List(List(0, 1), List(2, 3), List(4, 5), List(6, 7), List(8, 9))

    nums.sliding(3).take(5).toList
    // val res1: List[List[Int]] = List(List(0, 1, 2), List(1, 2, 3), List(2, 3, 4), List(3, 4, 5), List(4, 5, 6))

    nums.combinations(3).take(5).toList
    // val res2: List[List[Int]] = List(List(0, 1, 2), List(0, 1, 3), List(0, 1, 4), List(0, 1, 5), List(0, 1, 6))

    nums.permutations.take(5).toList
    // val res3: List[List[Int]] = List(List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), List(0, 1, 2, 3, 4, 5, 6, 7, 9, 8), 
    //                                  List(0, 1, 2, 3, 4, 5, 6, 8, 7, 9), List(0, 1, 2, 3, 4, 5, 6, 8, 9, 7), 
    //                                  List(0, 1, 2, 3, 4, 5, 6, 9, 7, 8))

    // val numsPlusOne = nums.map(x => x + 1)
    val numsPlusOne = nums.map(_ + 1)
    // val numsPlusOne: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    nums.corresponds(numsPlusOne)((a, b) => a + 1 == b)
    // val res4: Boolean = true