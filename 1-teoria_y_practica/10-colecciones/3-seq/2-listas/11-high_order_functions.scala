/*  ======================================================
    ================ HIGH ORDER FUNCTIONS ================
    ======================================================
*/

//  Las Higher Order Functions son simplemente funciones que toman otras funciones

    val words = List("uno", "dos", "tres", "cuatro")
    // val words: List[String] = List(uno, dos, tres, cuatro)

    // words.map(_.reverse)
    words.map(word => word.reverse)
    // val res0: List[String] = List(onu, sod, sert, ortauc)

    // words.reverse.map(_.reverse)
    words.reverse.map(word => word.reverse)
    // val res1: List[String] = List(ortauc, sert, sod, onu)

    // words.map { _.toList }
    words.map { word => word.toList }
    // val res2: List[List[Char]] = List(List(u, n, o), List(d, o, s), List(t, r, e, s), List(c, u, a, t, r, o))

    // words.flatMap { _.toList }
    words.flatMap { word => word.toList }
    // val res3: List[Char] = List(u, n, o, d, o, s, t, r, e, s, c, u, a, t, r, o)

    words foreach println
    // uno
    // dos
    // tres
    // cuatro