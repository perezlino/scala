/*  ======================================================
    ============= FUNCIONES ANONIMAS - FILTER ============
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package scala

    object test {

        def main(args: Array[String]): Unit = {

            println("============= Ejemplo 1.B => Resultado 1 =============")
            println(divisibleByThreeOutput)

            println("============= Ejemplo 1.B => Resultado 2 =============")
            divisibleByThreeOutput.foreach(println)

        }

        var listOfNumbers: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

        // Forma tradicional
        /*  def divisibleByThree (x : Int) = {
                x % 3 == 0
            }                                    */

        // Función anónima
        var divisibleByThree = (x:Int) => x % 3 == 0

        //============= Ejemplo 1.A =============

        listOfNumbers.foreach(num =>
            if (divisibleByThree(num)) {
            println(num + " es divisible por tres")
            }
            else {
            println(num + " no es divisible por tres")
            }
        )

        //============= Ejemplo 1.B =============

        // OBTENER LO MISMO QUE EL EJEMPLO DE ARRIBA USANDO Filter

        //var divisibleByThreeOutput = listOfNumbers.filter((x:Int) => x % 3 == 0)
        //var divisibleByThreeOutput = listOfNumbers.filter(x => x % 3 == 0)
        var divisibleByThreeOutput = listOfNumbers.filter(_ % 3 == 0)

    }
/*
        0 es divisible por tres
        1 no es divisible por tres
        2 no es divisible por tres
        3 es divisible por tres
        4 no es divisible por tres
        5 no es divisible por tres
        6 es divisible por tres
        7 no es divisible por tres
        8 no es divisible por tres
        9 es divisible por tres
        ============= Ejemplo 1.B => Resultado 1 =============
        List(0, 3, 6, 9)
        ============= Ejemplo 1.B => Resultado 2 =============
        0
        3
        6
        9
*/


//  EJEMPLO 2
//  =========

    package scala

    object test {

        def main(args: Array[String]): Unit = {

            println("============= Resultado 1 =============")
            println(pares)

            println("============= Resultado 2 =============")
            pares.foreach(println)

            println("============= Resultado 3 =============")
            lista.foreach((i:Int) => println(i))

            println("============= Resultado 4 =============")
            lista.foreach((i) => println(i))

            println("============= Resultado 5 =============")
            lista.foreach(i => println(i))

            println("============= Resultado 6 =============")
            lista.foreach(println(_))

            println("============= Resultado 7 =============")
            lista.foreach(println)

        }

        var lista = List.range(1,10)
        // lista: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

        // var pares = lista.filter((i:Int) => i % 2 == 0)
        // pares: List[Int] = List(2, 4, 6, 8)

        // var pares = lista.filter((i) => i % 2 == 0)
        // pares: List[Int] = List(2, 4, 6, 8)

        var pares = lista.filter(_ % 2 == 0)
        // pares: List[Int] = List(2, 4, 6, 8)

    }
/*
    ============= Resultado 1 =============
    List(2, 4, 6, 8)
    ============= Resultado 2 =============
    2
    4
    6
    8
    ============= Resultado 3 =============
    1
    2
    3
    4
    5
    6
    7
    8
    9
    ============= Resultado 4 =============
    1
    2
    3
    4
    5
    6
    7
    8
    9
    ============= Resultado 5 =============
    1
    2
    3
    4
    5
    6
    7
    8
    9
    ============= Resultado 6 =============
    1
    2
    3
    4
    5
    6
    7
    8
    9
    ============= Resultado 7 =============
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