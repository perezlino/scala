/*  ======================================================
    =================== FOR ... YIELD ====================
    ======================================================
*/


//  EJEMPLO 1
//  =========

//  El bucle For utilizado con una instrucción Yield en realidad crea una secuencia de lista, que permite 
//  de esta manera ser almacenado en una variable.

    package curso

    object example {
        def main(args: Array[String]): Unit = {
            
            var numbersList3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

            var evenNumberList = for (i <- numbersList3 if i % 2 == 0) yield i
            println(evenNumberList)
        }
    }
/*
        List(2, 4, 6, 8, 10)
*/

//  EJEMPLO 2
//  =========

    for (i <- 1 to 10) yield i * i
    // val res6: IndexedSeq[Int] = Vector(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

    // Dentro de un Objeto
    package curso

    object example {
        def main(args: Array[String]): Unit = {

            var vector = for (i <- 1 to 10) yield i * i
            println(vector)
        }
    }
/*
        Vector(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
*/

    // Obtenemos lo mismo
    (1 to 10).map(i => i * i)
/*
val res7: IndexedSeq[Int] = Vector(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
*/


//  EJEMPLO 3
//  =========

    for (i <- 1 to 3; j <- 1 to 3) yield i * j

    (1 to 3).flatMap(i => (1 to 3).map(j => i * j))
/*
val res8: IndexedSeq[Int] = Vector(1, 2, 3, 2, 4, 6, 3, 6, 9)
val res9: IndexedSeq[Int] = Vector(1, 2, 3, 2, 4, 6, 3, 6, 9)
*/  


//  EJEMPLO 4
//  =========

    for {
    i <- 1 to 3
    j <- 1 to 3
    k <- 1 to 3
    } yield {
    i * j * k
    }

    (1 to 3).flatMap(i => (1 to 3).flatMap(j => (1 to 3).map(k => i * j * k)))
/*
val res10: IndexedSeq[Int] = Vector(1, 2, 3, 2, 4, 6, 3, 6, 9, 2, 4, 6, 4, 8, 12, 6, 12, 18, 3, 6, 9, 6, 12, 18, 9, 18, 27)
val res11: IndexedSeq[Int] = Vector(1, 2, 3, 2, 4, 6, 3, 6, 9, 2, 4, 6, 4, 8, 12, 6, 12, 18, 3, 6, 9, 6, 12, 18, 9, 18, 27)
*/