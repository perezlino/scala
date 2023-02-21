/*  ======================================================
    ======================= SETS =========================
    ======================================================
*/

//  - Una Seq (secuencia) es una colección ordenada de valores homogéneos que pueden repetirse

//  - Por el contrario, un Set es una colección no ordenada de valores homogéneos que son únicos

    val set1 = Set(1,2,3,1,2,4,5) // val set1: scala.collection.immutable.Set[Int] = HashSet(5, 1, 2, 3, 4)

//  - Un Set no puede pasarse a una función que espera un Seq, no es un subtipo de Seq:

    def cuadradoRaizDeTodo(xs: Seq[Int]): Seq[Double] = // def squareRootOfAll(xs: Seq[Int]): Seq[Double]
    xs.map(x => math.sqrt(x))

    squareRootOfAll(set1) // no compilará