/*  ======================================================
    =============== LA LISTA ES INMUTABLE ================
    ======================================================
*/

//  La lista es inmutable {El array es mutable}

    val numerosPar = List(2,4,6,8,10)

    numerosPar(0) // val res0: Int = 2
    numerosPar(1) // val res1: Int = 4
    numerosPar(2) // val res2: Int = 6
    numerosPar(3) // val res3: Int = 8
    numerosPar(4) // val res4: Int = 10

    numerosPar(0) = 20  // Error!