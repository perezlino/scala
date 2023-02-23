/*  ======================================================
    =================== FOR Y FOREACH ====================
    ======================================================
*/

//  EJEMPLO 1
//  =========

    1 to 10
    // val res0: scala.collection.immutable.Range.Inclusive = Range 1 to 10

    for (i <- 1 to 10) println(i * i)       // FOR

    // Mismas formas de hacer el FOR
    for (i <- 1 to 10)
    println(i * i)

    for (i <- 1 to 10) {
        println(i * i)
    }
    
    (1 to 10).foreach(i => println(i * i))  // FOREACH
/*
    1
    4
    9
    16
    25
    36
    49
    64
    81
    100
*/


//  EJEMPLO 2
//  =========

    1 to 10
    // val res0: scala.collection.immutable.Range.Inclusive = Range 1 to 10

    for (i <- 1 until 10) println(i)       // FOR
/*
    1
    2
    3
    4
    5
    6
    7
    8
    9
*/  


//  EJEMPLO 3
//  =========

    for (i <- 1 to 3; j <- 1 to 3) println(i * j)                 // FOR

    // Mismas formas de hacer el FOR
    for (i <- 1 to 3) {
        for (j <- 1 to 3){
            println(i * j) 
        }
    }

    (1 to 3).foreach(i => (1 to 3).foreach(j => println(i * j)))  // FOREACH    

/*
    1   // (1 * 1)
    2   // (1 * 2)
    3   // (1 * 3)
    2   // (2 * 1)
    4   // (2 * 2)
    6   // (2 * 3)
    3   // (3 * 1)
    6   // (3 * 2)
    9   // (3 * 3)
*/  


//  EJEMPLO 4
//  =========

    for {
        i <- 1 to 3
        j <- 1 to 3
        } {
            println(i * j)
          }
/*
    1
    2
    3
    2
    4
    6
    3
    6
    9
*/    


//  EJEMPLO 5
//  =========

//  Lista - similar a Arrays. Las listas son inmutables, es decir, no se puede cambiar su contenido una 
//          vez definidas.

    var numbersList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        for (i <- numbersList) {
            println("El valor de 'i' es " + i)
    }
/*
    El valor de 'i' es 1
    El valor de 'i' es 2
    El valor de 'i' es 3
    El valor de 'i' es 4
    El valor de 'i' es 5
    El valor de 'i' es 6
    El valor de 'i' es 7
    El valor de 'i' es 8
    El valor de 'i' es 9
    El valor de 'i' es 10
*/


//  EJEMPLO 6
//  =========

    var numbersList2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        for (i <- numbersList2 if i % 2 == 0; if i != 4) {
            println("El valor de 'i' es " + i)
    }
/*
    El valor de 'i' es 2
    El valor de 'i' es 6
    El valor de 'i' es 8
    El valor de 'i' es 10
*/

    // Misma forma de hacer el FOR
    for(i <- numbersList2){
        if( i % 2 == 0 && i != 4){
            println("El valor de 'i' es " + i)
        }
    }


//  EJEMPLO 7
//  =========

    var rollNox = Range(2,11,2)

    for(roll <- rollNox){
        print(roll + ", ")
    }
/*
    2, 4, 6, 8, 10, 
*/


//  EJEMPLO 8
//  =========

    package curso

    // Debemos importar Array._ para utilizar 'range'
    import Array._

    object example {
        def main(args: Array[String]): Unit = {

            // var rollNox = Array[1,2,3,4,5,6,7,8,9,10]
            var rollNox = range(1,10)
            rollNox.foreach(print)
        }
    }
/*
        123456789
*/