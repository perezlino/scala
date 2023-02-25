/*  ======================================================
    ================== NULL Y NOTHING ====================
    ======================================================
*/

//  NULL
//  ====

    val s1: String = "hello"

    s1.charAt(1)
    // val res0: Char = e

    val s2: String = null

    // NullPointerException...
    // s2.charAt(1)

    s1.isInstanceOf[String]  // val res1: Boolean = true
    s2.isInstanceOf[String]  // val res2: Boolean = false

//  Para las comprobaciones 'isInstanceOf', 'null' siempre devolverá 'false'


//  NOTHING
//  =======

//  ¿Cómo puede ser útil Nothing?

    // val emptyList: List[Nothing] = List.empty <---- Esto es lo que representa
    val emptyList = List.empty
    // val emptyList: List[Nothing] = List()

    1 :: emptyList
    // val res3: List[Int] = List(1)

    "hello" :: emptyList
    // val res4: List[String] = List(hello)

    true :: 1 :: emptyList
    // val res5: List[AnyVal] = List(true, 1)

    true :: 1 :: "hello" :: emptyList
    // val res5: List[Any] = List(true, 1, hello)