/*  ======================================================
    ==================== SECUENCIAS ======================
    ======================================================
*/

//  - List y Array son ambas secuencias en Scala, subtipos de Seq

//  - Hay otros, en particular 'Vector':

    val v = Vector(1,2,3,4)  // val v: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4)

//  - Todos pueden ser pasados a un método que requiera un Seq del tipo correcto:

    val vector = Vector(1,2,3,4)    // val v: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4)
    val lista = List(1,2,3,4)       // val lista: List[Int] = List(1, 2, 3, 4)
    val array = Array(1,2,3,4)      // val array: Array[Int] = Array(1, 2, 3, 4)

    def cuadradoRaizDeTodo(xs: Seq[Int]): Seq[Double] = // def squareRootOfAll(xs: Seq[Int]): Seq[Double]
    xs.map(x => math.sqrt(x))

//  - Ahora se pueden pasar List[Int], Array[Int] y Vector[Int]:

    squareRootOfAll(vector)
    squareRootOfAll(lista)
    squareRootOfAll(array)
/*
    val res1: Seq[Double] = Vector(1.0, 1.4142135623730951, 1.7320508075688772, 2.0)
    val res2: Seq[Double] = List(1.0, 1.4142135623730951, 1.7320508075688772, 2.0)
    val res3: Seq[Double] = ArraySeq(1.0, 1.4142135623730951, 1.7320508075688772, 2.0)
*/

//  - No te preocupes todavía por la notación x => math.sqrt(x), ya nos ocuparemos con literales de función