/*  ======================================================
    ================= UTILIZAR MKSTRING ==================
    ======================================================
*/

//  Para cualquier tipo de Lista en la que desee crear una representación de cadena:

    val words = List("uno","dos","tres","cuatro")

    words.toString
    // val res0: String = List(uno, dos, tres, cuatro)

    words.mkString 
    // val res1: String = unodostrescuatro

    words.mkString(",")
    // val res2: String = uno,dos,tres,cuatro

    words.mkString("[", ",", "]")
    // val res3: String = [uno,dos,tres,cuatro]


    val numeros = List(1,2,3,4,5)
    // val numeros: List[Int] = List(1, 2, 3, 4, 5)

    numeros.toString
    // val res4: String = List(1, 2, 3, 4, 5)

    numeros.mkString
    // val res5: String = 12345

    numeros.mkString(",")
    // val res6: String = 1,2,3,4,5

    numeros.mkString("[", ",", "]")
    // val res7: String = [1,2,3,4,5]