/*  ======================================================
    ========= ACCESO A LOS ELEMENTOS DE LA TUPLA =========
    ======================================================
*/

    val tuple1 = (1, "String Data", 2.3, 5, 5.6)
    // val tuple1: (Int, String, Double, Int, Double) = (1,String Data,2.3,5,5.6)

    // tuple1._0  // No existe
    tuple1._1     // val res0: Int = 1
    tuple1._2     // val res1: String = String Data
    tuple1._3     // val res2: Double = 2.3
    tuple1._4     // val res3: Int = 5
    tuple1._5     // val res4: Double = 5.6

//  -------------------------------------------------------------------------------------------------

//  ACCESO A LOS ELEMENTOS DE LA TUPLA MEDIANTE EL MÉTODO 'PRODUCTITERATOR'
//  =======================================================================

    tuple1.productIterator.foreach(i => println("El valor es " + i))
/*
    El valor es 1
    El valor es String Data
    El valor es 2.3
    El valor es 5
    El valor es 5.6
*/