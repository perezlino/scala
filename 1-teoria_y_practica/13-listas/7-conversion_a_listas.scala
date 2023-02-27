/*  ======================================================
    ================ CONVERSION A LISTAS =================
    ======================================================
*/

//  Otros tipos de colección se pueden convertir fácilmente en Lista:

    Vector('a', 'b', 'c').toList
    // List[Char] = List(a, b, c)

    Set(1.0, 2.0, 3.0).toList
    // List[Double] = List(1.0, 2.0, 3.0)

    Map(1 -> "one", 2 -> "two").toList
    // List[(Int, String)] = List((1,one), (2,two))

    "hello world".toList
    // List[Char] = List(h, e, l, l, o, , w, o, r, l, d)