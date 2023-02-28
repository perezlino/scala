/*  ======================================================
    ================= INDICES ZIP UNZIP ==================
    ======================================================
*/

    val chars = List.range('a', 'h')
    // List[Char] = List(a, b, c, d, e, f, g)

    val idx = chars.indices
    // scala.collection.immutable.Range = Range 0 until 7

    chars.zip(idx)
    // List[(Char, Int)] = List((a,0), (b,1), (c,2), (d,3), (e,4), (f,5), (g,6))

    val zipped = chars.zipWithIndex
    // List[(Char, Int)] = List((a,0), (b,1), (c,2), (d,3), (e,4), (f,5), (g,6))

    zipped.unzip
    // (List[Char], List[Int]) = (List(a, b, c, d, e, f, g),List(0, 1, 2, 3, 4, 5, 6))